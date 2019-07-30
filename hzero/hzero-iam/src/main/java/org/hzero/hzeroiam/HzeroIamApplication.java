package org.hzero.hzeroiam;

import org.hzero.autoconfigure.iam.EnableHZeroIam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableHZeroIam
@SpringBootApplication
public class HzeroIamApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroIamApplication.class, args);
    }

}
