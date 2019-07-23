package com.hand.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by HuangHeng on 2019/7/23
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/buy")
    public String getTicket(String name){
        String string = restTemplate.getForObject("http://EUREKA-PROVIDER/getTicket", String.class);
        return name + "购买了" + string;
    }
}
