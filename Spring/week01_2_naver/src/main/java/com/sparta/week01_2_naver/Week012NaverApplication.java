package com.sparta.week01_2_naver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // 시간 자동 변경이 가능하도록 합니다.
@SpringBootApplication
public class Week012NaverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week012NaverApplication.class, args);
    }
    // Week02Application.java 의 main 함수 아래에 붙여주세요.
    @Bean
    public CommandLineRunner demo() {
        return (args) -> {

        };
    }
}
