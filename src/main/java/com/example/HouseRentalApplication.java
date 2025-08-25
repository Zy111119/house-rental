package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类
 */
@MapperScan("com.example.mapper")
@SpringBootApplication
public class HouseRentalApplication {
    public static void main(String[] args) {

        SpringApplication.run(HouseRentalApplication.class, args);
    }
}
