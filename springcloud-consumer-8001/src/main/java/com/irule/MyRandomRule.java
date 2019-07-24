package com.irule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/24
 */
public class MyRandomRule extends AbstractLoadBalancerRule {

    private int total = 0; 			// 总共被调用的次数，目前要求每台被调用5次
    private int currentIndex = 0;	// 当前提供服务的机器号
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                if(total < 5)
                {
                    server = upList.get(currentIndex);
                    total++;
                }else {
                    total = 0;
                    currentIndex++;
                    if(currentIndex >= upList.size())
                    {
                        currentIndex = 0;
                    }
                }
//                if (serverCount == 0) {
//                    return null;
//                }
//
//                int index = this.rand.nextInt(serverCount);
//                server = (Server)upList.get(index);
                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }
            System.out.println("server-------->"+server);
            return server;
        }
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}
