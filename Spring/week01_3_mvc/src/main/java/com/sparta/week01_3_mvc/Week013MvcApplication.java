package com.sparta.week01_3_mvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week013MvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week013MvcApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
        };
    }
}
