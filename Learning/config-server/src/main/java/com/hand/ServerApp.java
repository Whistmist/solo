package com.hand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by HuangHeng on 2019/7/25
 */
@SpringBootApplication
@EnableConfigServer
public class ServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class,args);
    }
}
