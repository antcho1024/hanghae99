package com.sparta.week01_homework.controller;

import com.sparta.week01_homework.domain.Board;
import com.sparta.week01_homework.domain.BoardRepository;
import com.sparta.week01_homework.dto.BoardRequestDto;
import com.sparta.week01_homework.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardRestController {
    private final BoardRepository boardRepository;
    private final BoardService boardService;

    @GetMapping("/api/post")
    public List<Board> getPosts() {
        return boardRepository.findAll();
    }
    @GetMapping("/api/post/{id}")
    public Board getPostOne(@PathVariable Long id) {
        //여기 보드 디티오? 그냥 보드?
        return boardRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
    }
    @PostMapping("/api/post")
    public Board createPost(@RequestBody BoardRequestDto boardRequestDto) {
        Board board = new Board(boardRequestDto);
        return boardRepository.save(board);
    }
//    비밀번호 확인
//    @PostMapping("/api/post/{id}")
//    public Boolean checkPassword(@RequestBody BoardRequestDto boardRequestDto) {
//        return new Board(boardRequestDto);
//    }
    @PutMapping("/api/post/{id}")
    public Long update(@PathVariable Long id, @RequestBody BoardRequestDto boardRequestDto){
        return boardService.update(id, boardRequestDto);
    }
    @DeleteMapping("/api/post/{id}")
    public void delete(@PathVariable Long id){
        boardRepository.deleteById(id);
    }
}
