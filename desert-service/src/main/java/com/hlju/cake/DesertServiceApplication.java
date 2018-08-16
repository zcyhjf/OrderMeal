package com.hlju.cake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DesertServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesertServiceApplication.class, args);
    }
}
