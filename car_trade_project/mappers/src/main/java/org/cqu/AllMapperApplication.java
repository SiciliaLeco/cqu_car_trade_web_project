package org.cqu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.cqu.mapper")
@SpringBootApplication
public class AllMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllMapperApplication.class, args);
    }

}
