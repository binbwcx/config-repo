package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // 开启Config Server
public class Application {
    public static void main(String[] args) {
        new  SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}