package com.sparta.week01_test.entity;

import com.sparta.week01_test.domain.Member;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse {
    private String message;
    private HttpStatus httpStatus;
    private List<MemberInfoResponseDto> result;
}
