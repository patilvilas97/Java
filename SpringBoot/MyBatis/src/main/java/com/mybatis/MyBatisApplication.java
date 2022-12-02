package com.mybatis;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mybatis.model.Users;

@MappedTypes(Users.class)
@MapperScan("com.mybatis,mappers")
@SpringBootApplication
public class MyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBatisApplication.class, args);
	}

}
