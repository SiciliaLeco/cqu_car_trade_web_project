package org.cqu.cart;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.cqu.mapper")
@SpringBootApplication
@EnableDubbo
public class CartApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartApplication.class, args);
        System.out.println("START_CArt_SERVICE");
    }
}



