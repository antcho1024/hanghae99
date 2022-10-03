package com.sparta.week01_2_memo;

import com.sparta.week01_2_memo.domain.Memo;
import com.sparta.week01_2_memo.domain.MemoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Week012MemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week012MemoApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo(MemoRepository repository) {
        return (args) -> {
//            repository.save(new Memo("hs","aaaaa"));
        };
    }
}
