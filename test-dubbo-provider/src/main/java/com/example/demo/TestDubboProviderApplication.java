package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.demo.dao"})//dao层接口包路径
public class TestDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDubboProviderApplication.class, args);
	}
}
