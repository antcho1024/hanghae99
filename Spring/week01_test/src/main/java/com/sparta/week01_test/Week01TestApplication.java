package com.sparta.week01_test;

import com.sparta.week01_test.domain.Member;
import com.sparta.week01_test.domain.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week01TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week01TestApplication.class, args);
    }
    // Week02Application.java 의 main 함수 아래에 붙여주세요.
    @Bean
    public CommandLineRunner demo(MemberRepository memberRepository) {
        return (args) -> {
            memberRepository.save(new Member("asd","qqq","ddd"));
        };
    }
}
