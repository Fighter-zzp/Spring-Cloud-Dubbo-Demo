package com.zzp.spring.cloud.dubbo.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BusinessAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessAdminApplication.class, args);
    }
}
