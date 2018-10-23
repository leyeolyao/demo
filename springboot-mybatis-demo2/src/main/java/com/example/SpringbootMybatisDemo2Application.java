package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dao")
public class SpringbootMybatisDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDemo2Application.class, args);
    }
}
