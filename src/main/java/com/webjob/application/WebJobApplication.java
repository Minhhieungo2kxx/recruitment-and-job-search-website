package com.webjob.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })

public class WebJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebJobApplication.class, args);
    }

}
