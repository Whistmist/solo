package com.hand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication()
@EnableFeignClients(basePackages = {"com.hand"})
@ComponentScan("com.hand")
public class DeptConsumer8001_Feign_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer8001_Feign_App.class, args);
	}
}
