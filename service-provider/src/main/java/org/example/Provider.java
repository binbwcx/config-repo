package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
/**
 * 服务提供方
 */
public class Provider {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Provider.class).web(true).run(args);
    }
}