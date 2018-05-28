package com.ldlywt.springlearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ldlywt.springlearning.mapper")
public class SpringlearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringlearningApplication.class, args);
	}
}
