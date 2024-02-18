package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 通过@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话
public class Registration {
    public static void main(String[] args) {
       new SpringApplicationBuilder(Registration.class).web(true).run(args);
    }
}