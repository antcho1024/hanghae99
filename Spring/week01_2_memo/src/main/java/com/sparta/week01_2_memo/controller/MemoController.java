package com.sparta.week01_2_memo.controller;

import com.sparta.week01_2_memo.domain.Memo;
import com.sparta.week01_2_memo.domain.MemoRepository;
import com.sparta.week01_2_memo.dto.MemoRequestDto;
import com.sparta.week01_2_memo.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemoController {
    private final MemoRepository memoRepository;
    private final MemoService memoService;

    @PostMapping("/api/memos")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto){
        Memo memo = new Memo(requestDto);
        return memoRepository.save(memo);
    }
    @GetMapping("api/memos")
    public List<Memo> getMemos(){
        return memoRepository.findAllByOrderByModifiedAtDesc();
    }
    @DeleteMapping("api/memos/{id}")
    public Long deleteMemo(@PathVariable Long id){
        memoRepository.deleteById(id);
        return id;
    }
    @PutMapping("/api/memos/{id}")
    public Long updateMemo (@PathVariable Long id, @RequestBody MemoRequestDto requestDto){
          return memoService.update(id, requestDto);
    }
}
