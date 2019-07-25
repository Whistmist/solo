package com.hand.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HuangHeng on 2019/7/25
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig()
    {
        String str = "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
        System.out.println("******str: " + str);
        return "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
    }
}
