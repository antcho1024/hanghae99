package com.sparta.week01_2_memo.service;

import com.sparta.week01_2_memo.domain.Memo;
import com.sparta.week01_2_memo.domain.MemoRepository;
import com.sparta.week01_2_memo.dto.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {
    private final MemoRepository memoRepository;

    @Transactional
    public Long update(Long id, MemoRequestDto requestDto){
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디 존재 x")
        );
        memo.update(requestDto);
        return memo.getId();
    }
}
