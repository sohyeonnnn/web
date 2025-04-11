package com.refactoring.ilgusi.presentation.member;

import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.application.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberService memberService;


    @GetMapping({"/join"})
    public String join() {
        return "/member/joinFrm";
    }

    @GetMapping(value = "/members/new")
    public String createForm() {
        return "/member/createMemberForm";
    }

    @ResponseBody
    @RequestMapping("/checkDupId")
    public Map<String, String> checkDuplicateId(@RequestParam String id) {
        // 예시: 이미 존재하는 아이디 목록 (실제로는 DB 조회로 확인해야 함)
        List<String> existingIds = new ArrayList<>();
        existingIds.add("test123");
        existingIds.add("admin");
        existingIds.add("user01");

        Map<String, String> result = new HashMap<>();
        if (existingIds.contains(id)) {
            result.put("result", "true");  // 중복됨
        } else {
            result.put("result", "false"); // 중복 아님
        }

        return result;
    }

    @RequestMapping({"/register"})
    public String register(Member m, Model model) { //(@ModelAttribute가 생략
        if (memberService.registerMember(m)==null){
            model.addAttribute("msg", "회원가입 성공! 로그인 해주세요!");
            model.addAttribute("loc", "/");
        } else {
            model.addAttribute("msg", "회원가입 실패!");
            model.addAttribute("loc", "/join");
        }
        return "/common/msg";
    }


}

