package com.refactoring.ilgusi.application.member;

import com.refactoring.ilgusi.common.CommonEnum;
import com.refactoring.ilgusi.common.ResultData;
import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.domain.member.MemberRepository;
import com.refactoring.ilgusi.domain.member.RoleEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@Transactional
@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder encoder;

    public ResultData<Void> checkDuplicateId(String id) {
        Optional<Member> member = memberRepository.findBymId(id);
        if (member.isPresent()) {
            return ResultData.success(null, CommonEnum.ALREADY_USED_ID.getVal());
        } else {
            return ResultData.fail(null, null);
        }
    }

    public ResultData<Map<String, Object>> register(Member m) {
        Map<String, Object> data = new HashMap<>();

        /*Optional<Member> member = memberRepository.findBymId(m.getMId());
        if (member.isPresent()) {
            return ResultData.fail(null,CommonEnum.ALREADY_USED_ID.getVal());
        }*/

        m.setMPw(encoder.encode(m.getMPw()));
        if (m.getMGrade() == null) {
            m.setMGrade(RoleEnum.USER);
        }

        try {
            memberRepository.save(m);
            data.put("redirectUrl", "/");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            return ResultData.success(data, CommonEnum.SUCCESS.getVal());
        } catch (Exception e) {
            data.put("redirectUrl", "/join");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            return ResultData.fail(data, CommonEnum.FAIL.getVal());
        }
    }

    public ResultData<Member> checkLoginMember(String id, String pw) {
        Optional<Member> member = memberRepository.findBymId(id);
        System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        if (member.isPresent()) {
            Member loginMember = member.get();
            if (encoder.matches(pw, loginMember.getMPw())) {
                System.out.println("로그인 성공 ");
                return ResultData.success(loginMember, CommonEnum.SUCCESS.getVal());
            } else {
                System.out.println("로그인 실패 ! ! !@ ");
                return ResultData.fail(null, CommonEnum.FAIL.getVal());
            }
        }else {
            return ResultData.fail(null, CommonEnum.NOT_VALID_ID.getVal());
        }
    }
}
