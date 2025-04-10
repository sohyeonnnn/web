package com.refactoring.ilgusi.springboot.service.member;

import com.refactoring.ilgusi.springboot.domain.member.Member;
import com.refactoring.ilgusi.springboot.web.dto.member.MemberResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {
   /* private final MemberRepository memberRepository ;//= new MemoryMemberRepository();

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
*/


    public MemberResponseDto findById(String id){
        /*Optional<Member> entity = memberRepository.findById(id);
        return new MemberResponseDto(entity.get());*/
        System.out.println("!!");
        return null;
    }

    /**
     *
     회원가입
     */
    /*public Integer join(Member member) {
        validateDuplicateMember(member); //중복 회원 검증
        memberRepository.save(member);
        return member.getMNo();
    }
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getMName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }*/
    /**
     *
     전체 회원 조회
     */
    /*public List<Member> findMembers() {
        return memberRepository.findAll();
    }
    public Optional<Member> findOne(String memberId) {
        return memberRepository.findById(memberId);
    }
*/}
