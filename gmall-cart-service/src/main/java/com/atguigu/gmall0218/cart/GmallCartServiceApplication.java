package com.atguigu.gmall0218.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu.gmall0218")
@MapperScan(basePackages = "com.atguigu.gmall0218.cart.mapper")
public class GmallCartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallCartServiceApplication.class, args);
	}

}
