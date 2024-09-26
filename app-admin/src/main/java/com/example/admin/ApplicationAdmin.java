package com.example.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.admin", "com.example.sharedlibrary"})
public class ApplicationAdmin {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationAdmin.class, args);
    }
}
