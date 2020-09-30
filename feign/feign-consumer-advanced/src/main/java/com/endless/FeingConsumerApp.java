package com.endless;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class FeingConsumerApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FeingConsumerApp.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}