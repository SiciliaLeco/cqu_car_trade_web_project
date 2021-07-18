package org.cqu.car;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableDubbo
public class CarApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
        System.out.println("START_PROJECT");
    }
}