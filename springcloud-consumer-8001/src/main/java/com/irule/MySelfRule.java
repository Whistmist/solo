package com.irule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by HuangHeng on 2019/7/24
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myIRule(){
        //return new RoundRobinRule();
        return new MyRandomRule();
    }
}
