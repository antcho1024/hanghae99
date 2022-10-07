package com.sparta.week02_1_login;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week021LoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week021LoginApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo() {
        return (args) -> {

        };
    }
}
