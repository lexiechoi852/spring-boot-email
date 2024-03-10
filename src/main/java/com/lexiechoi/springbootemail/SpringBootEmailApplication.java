package com.lexiechoi.springbootemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailApplication.class, args);
	}

}
