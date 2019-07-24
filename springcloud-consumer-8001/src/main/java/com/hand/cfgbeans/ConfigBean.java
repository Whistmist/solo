package com.hand.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by HuangHeng on 2019/7/24
 */
//boot -->spring   applicationContext.xml --- @Configuration配置
// ConfigBean = applicationContext.xml
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    @Bean
    public IRule myIRule(){
        //return new RoundRobinRule(); 轮询
        //return new RandomRule(); 随机
        return new RetryRule(); //服务挂掉了就不再选择
    }

}
