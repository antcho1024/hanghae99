package com.sparta.week01_2_quiz1.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private int age;
    @Column(nullable = true)
    private String job;
    public Person(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public Person(PersonRequestDto personRequestDto){
        this.name = personRequestDto.getName();
        this.age = personRequestDto.getAge();
        this.job = personRequestDto.getJob();
    }
    public void update (PersonRequestDto personRequestDto){
        this.name = personRequestDto.getName();
        this.age = personRequestDto.getAge();
        this.job = personRequestDto.getJob();
    }
}