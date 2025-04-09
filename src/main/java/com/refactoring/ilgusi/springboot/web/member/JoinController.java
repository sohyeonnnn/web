package com.refactoring.ilgusi.springboot.web.member;

import com.refactoring.ilgusi.springboot.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class JoinController {

    @Autowired
    MemberService service;

    @GetMapping({"/join"})
    public String join() {
        return "/member/joinFrm";
    }

    @ResponseBody
    @RequestMapping("/checkDupId")
    public Map<String, String> checkDuplicateId(@RequestParam String id) {
        // 예시: 이미 존재하는 아이디 목록 (실제로는 DB 조회로 확인해야 함)
        List<String> existingIds = List.of("test123", "admin", "user01");

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

