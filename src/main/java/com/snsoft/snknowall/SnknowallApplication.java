package com.snsoft.snknowall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value="com.snsoft.snknowall.mapper")
@SpringBootApplication
public class SnknowallApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnknowallApplication.class, args);
	}
}