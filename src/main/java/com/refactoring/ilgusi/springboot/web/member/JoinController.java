package com.refactoring.ilgusi.springboot.web.member;

import com.refactoring.ilgusi.springboot.domain.member.Member;
import com.refactoring.ilgusi.springboot.service.member.MemberService;
import com.refactoring.ilgusi.springboot.web.dto.member.MemberForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class JoinController {

    private final MemberService memberService;

    @Autowired
    public JoinController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(value = "/members/new")
    public String createForm() {
        return "/member/createMemberForm";
    }

/*    @PostMapping(value = "/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setMName(form.getName());
        memberService.join(member);
        return "redirect:/";
    }*/

/*    @GetMapping(value = "/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "/member/memberList";
    }*/


@GetMapping({"/join"})
    public String join() {
        return "/member/joinFrm";
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
    @ResponseBody
    public void register(String id) {
    }


}

