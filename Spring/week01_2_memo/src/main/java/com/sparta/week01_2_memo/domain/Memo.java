package com.sparta.week01_2_memo.domain;

import com.sparta.week01_2_memo.dto.MemoRequestDto;
import com.sparta.week01_2_memo.entity.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Memo extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (nullable = false)
    private String username;

    @Column (nullable = false)
    private String contents;

    public Memo(String username, String contents){
        this.username=username;
        this.contents=contents;
    }
    public Memo(MemoRequestDto requestDto){
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }
    public void update(MemoRequestDto requestDto){
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

}
