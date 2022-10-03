package com.sparta.week01_2_quiz1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PersonRequestDto {
    private String name;
    private int age;
    private String job;
    public PersonRequestDto(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }
}
