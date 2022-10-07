package com.sparta.week02_1_login2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week021Login2Application {

    public static void main(String[] args) {
        SpringApplication.run(Week021Login2Application.class, args);
    }
    // Week02Application.java 의 main 함수 아래에 붙여주세요.
    @Bean
    public CommandLineRunner demo() {
        return (args) -> {

        };
    }
}
