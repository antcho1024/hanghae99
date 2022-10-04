package com.sparta.week01_homework.domain;

import com.sparta.week01_homework.dto.BoardRequestDto;
import com.sparta.week01_homework.entity.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;


@Getter
@Entity
@NoArgsConstructor
public class Board extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column (nullable = false)
    private String author;

    @Column (nullable = false)
    private String password;

    @Column (nullable = false)
    private String content;

    public Board(String title, String author, String password, String content){
        this.title = title;
        this.author = author;
        this.password = password;
        this.content = content;
    }
    public Board(BoardRequestDto boardRequestDto){
        this.title = boardRequestDto.getTitle();
        this.author = boardRequestDto.getAuthor();
        this.password = boardRequestDto.getPassword();
        this.content = boardRequestDto.getContent();
    }
    public void update(BoardRequestDto boardRequestDto){
        this.title = boardRequestDto.getTitle();
        this.author = boardRequestDto.getAuthor();
        this.password = boardRequestDto.getPassword();
        this.content = boardRequestDto.getContent();
    }
}
