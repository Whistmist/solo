package org.hzero.hzeroconfig;

import org.hzero.autoconfigure.config.EnableHZeroConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.config.ConfigServerAutoConfiguration;

@EnableDiscoveryClient
@EnableHZeroConfig
@SpringBootApplication(exclude = ConfigServerAutoConfiguration.class)
public class HzeroConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroConfigApplication.class, args);
    }

}
