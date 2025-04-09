package com.refactoring.ilgusi.springboot.web.member;

import com.refactoring.ilgusi.springboot.service.member.MemberService;
import com.refactoring.ilgusi.springboot.web.dto.PostsResponseDto;
import com.refactoring.ilgusi.springboot.web.dto.member.MemberResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JoinController {

    @Autowired
    MemberService service;

    @GetMapping({"/join"})
    public String join() {
        return "/member/joinFrm";
    }

    @GetMapping({"/checkDupId"})
    @ResponseBody
    public String checkDupId(String id) {
        if(service.findById(id).equals(null)) {
            return "{\"result\":\"false\"}";
        }else {
            return "{\"result\":\"true\"}"; // 중복임
        }
    }

}

