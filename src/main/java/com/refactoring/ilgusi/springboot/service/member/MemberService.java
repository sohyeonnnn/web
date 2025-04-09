package com.refactoring.ilgusi.springboot.service.member;

import com.refactoring.ilgusi.springboot.domain.member.Member;
import com.refactoring.ilgusi.springboot.domain.member.MemberRepository;
import com.refactoring.ilgusi.springboot.web.dto.member.MemberResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberResponseDto findById(String id){
        /*Optional<Member> entity = memberRepository.findById(id);
        return new MemberResponseDto(entity.get());*/
        System.out.println("!!");
        return null;
    }
}
