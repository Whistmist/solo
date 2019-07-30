package org.hzero.hzeroswagger;

import org.hzero.autoconfigure.swagger.EnableHZeroSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@EnableHZeroSwagger
@SpringBootApplication
public class HzeroSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroSwaggerApplication.class, args);
    }

}
