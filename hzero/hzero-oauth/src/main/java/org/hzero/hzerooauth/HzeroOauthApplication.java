package org.hzero.hzerooauth;

import org.hzero.autoconfigure.oauth.EnableHZeroOauth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableHZeroOauth
@SpringBootApplication
public class HzeroOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroOauthApplication.class, args);
    }

}
