package br.com.sgl.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigServer
@SpringBootApplication
public class SglConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SglConfigServerApplication.class, args);
    }

}
