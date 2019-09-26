package org.feidao.chapter41;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.feidao.chapter41.dao")
public class Chapter41Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter41Application.class, args);
	}

}
