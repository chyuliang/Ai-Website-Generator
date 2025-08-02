package com.lcy.aiwebgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class AiWebsiteGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiWebsiteGeneratorApplication.class, args);
    }

}
