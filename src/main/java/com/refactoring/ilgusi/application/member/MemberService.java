package com.refactoring.ilgusi.application.member;

import com.refactoring.ilgusi.common.ResultData;
import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.domain.member.MemberRepository;
import com.refactoring.ilgusi.domain.member.RoleEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder encoder;

    public ResultData<Void> register(Member m) {
        //초기화
        m.setMPw(encoder.encode(m.getMPw()));
        if (m.getMGrade() == null) {
            m.setMGrade(RoleEnum.USER);
        }

        //저장
        /*if (memberRepository.existsByUsername(request.getUsername())) {
            return ResultData.fail("이미 존재하는 아이디입니다.");
        }*/

        try{
            memberRepository.save(m);
            return ResultData.success(null, "회원가입 성공!!");
        }catch (Exception e){
            return ResultData.fail("회원가입 실패!!");
        }
    }

    /*public ResultData<Void> checkDuplicateId(String id){
        Member member = memberRepository.findByMId(id).get();
        System.out.println(member);
        return null;
    }*/




}
