package com.sparta.week01_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
@ServletComponentScan // @WebServlet 어노테이션이 동작하게 함
@SpringBootApplication
public class Week013Application {

    public static void main(String[] args) {
        SpringApplication.run(Week013Application.class, args);
    }

}
