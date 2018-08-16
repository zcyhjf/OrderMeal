package com.hlju.tumblr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hlju.tumblr")
public class EntityApplication {

    public static void main(String[] args) {
        SpringApplication.run(EntityApplication.class, args);
    }
}
