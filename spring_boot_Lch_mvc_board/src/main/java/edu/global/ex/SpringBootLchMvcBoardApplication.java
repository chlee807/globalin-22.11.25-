package edu.global.ex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"edu.global.ex.mapper"})
@SpringBootApplication
public class SpringBootLchMvcBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLchMvcBoardApplication.class, args);
	}

}
