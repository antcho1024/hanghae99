package com.sparta.week01_homework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week01HomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week01HomeworkApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo() {
		return (args) -> {

		};
	}
}
