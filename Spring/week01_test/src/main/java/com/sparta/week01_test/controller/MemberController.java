package com.sparta.week01_test.controller;

import com.sparta.week01_test.entity.CommonResponse;
import com.sparta.week01_test.entity.MemberInfoResponseDto;
import com.sparta.week01_test.service.MemberService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;
    CommonResponse commonResponse = new CommonResponse();


    @GetMapping("/member/{id}")
    public CommonResponse getMemberInfo(@PathVariable Long id) {
        MemberInfoResponseDto memberInfoResponseDto = memberService.findMember(id);
        if(memberInfoResponseDto.getId() != -1){
            commonResponse = CommonResponse.builder()
                    .result(List.of(memberInfoResponseDto))
                    .build();
        }
        else{
            commonResponse = CommonResponse.builder()
                    .message("회원 상세 조회 실패")
                    .build();
        }
        return commonResponse;
    }


    @GetMapping("/member")
    public ResponseEntity<CommonResponse> getMemberList() {
        List<MemberInfoResponseDto> list = memberService.findAllMember();

        if(list.size()!=0){
            commonResponse = CommonResponse.builder()
                    .message("")
                    .httpStatus(HttpStatus.OK)
                    .result(new ArrayList<>(list))
                    .build();
        }
        else{
            commonResponse = CommonResponse.builder()
                    .message("회원 목록 조회 실패")
                    .httpStatus(HttpStatus.NOT_FOUND)
                    .build();
        }
        return new ResponseEntity<>(commonResponse, commonResponse.getHttpStatus());

    }

//    @PostMapping("/member")
//    public
}