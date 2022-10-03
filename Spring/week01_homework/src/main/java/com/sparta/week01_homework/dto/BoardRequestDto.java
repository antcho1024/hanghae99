package com.sparta.week01_homework.dto;

import lombok.Getter;

import javax.persistence.Column;

@Getter
public class BoardRequestDto {
    private String title;
    private String author;
    private String password;
    private String content;
}
