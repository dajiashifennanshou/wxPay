package com.df;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.df.*")
public class WxPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxPayApplication.class, args);
	}
}
