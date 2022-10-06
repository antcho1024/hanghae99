package com.sparta.week01_test.service;

import com.sparta.week01_test.domain.Member;
import com.sparta.week01_test.domain.MemberRepository;
import com.sparta.week01_test.entity.MemberInfoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberInfoResponseDto findMember(Long memberId) {
        Member member = memberRepository.findById(memberId).orElse(null);
        MemberInfoResponseDto d;
        if (member == null){
            d = new MemberInfoResponseDto();
            d.setId((long) -1);
            return d;
        }
        return new MemberInfoResponseDto(member);
    }

public List<MemberInfoResponseDto> findAllMember() {
    List<Member> memberList = memberRepository.findAll();
    List<MemberInfoResponseDto> list;

    if(memberList.size() ==0){
        list = new ArrayList<>();
        return list;
    }
    list = new ArrayList<>(memberList.size());
    for (Member member : memberList) {
        list.add(new MemberInfoResponseDto(member));
    }
    return list;
}
}