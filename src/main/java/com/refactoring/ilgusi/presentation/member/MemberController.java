package com.refactoring.ilgusi.presentation.member;

import com.refactoring.ilgusi.common.ResultData;
import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.application.member.MemberService;
import com.refactoring.ilgusi.domain.member.RoleEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;


@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberService memberService;

    @GetMapping({"/join"})
    public String joinFrm() {
        return "/member/joinFrm";
    }

    @ResponseBody
    @RequestMapping("/checkDupId")
    public ResultData<Void> checkDuplicateId(@RequestParam String id) {
        return memberService.checkDuplicateId(id);
    }

    @PostMapping("/register")
    public String register(/*@ModelAttribute 생략가능*/Member member, Model model) {
        ResultData<Map<String, Object>> result =  memberService.register(member);
        System.out.println(result.toString());
        model.addAttribute("msg", result.getMessage());
        model.addAttribute("loc", result.getData().get("redirectUrl"));
        return "/common/msg";
    }

    @GetMapping("/forgotIdPwd")
    public String searchIdPwFrm() {
        return "/member/searchIdPw";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest req, String id, String pw, Model model) {
        Member m = memberService.checkLoginMember(id, pw).getData();

        String loc="/";

        if (m != null) {
            System.err.println(m.toString());
            HttpSession session = req.getSession();
            session.setAttribute("loginMember", m);
            model.addAttribute("msg", "로그인 성공");
        } else {
            model.addAttribute("msg", "로그인 실패");
        }
        model.addAttribute("loc", loc);
        if (m != null && m.getMGrade().equals(RoleEnum.ADMIN))
            model.addAttribute("loc", "/");

        return "common/msg";
    }

    @RequestMapping("/logout")
    public String login(HttpServletRequest req, Model model) {
        HttpSession session = req.getSession();
        if (session.getAttribute("loginMember") != null) {
            session.setAttribute("loginMember", null);
        }
        model.addAttribute("msg", "로그아웃 성공");
        model.addAttribute("loc", "/");
        return "common/msg";
    }



    //  아이디 찾기 기능
    @RequestMapping("/searchId")
    public String searchId(Member m, Model model) {

        return "common/msg";
    }

    //  비번 찾기 페이지에서 클릭
    @RequestMapping("/searchPw")
    public String searchPw(HttpServletRequest req, Member m, Model model) {
       
            return "member/searchPw";
        
    }

    //  비번 찾기 기능 (비번 변경)
    @RequestMapping("/searchChangePw")
    public String searchPw(HttpServletRequest req, String mPw, Model model) {
   
        return "common/msg2";
    }




    // 사용자 마이페이지 이동
    @RequestMapping("/userMypage")
    public String userMypage(HttpServletRequest req) {

        return "";
    }

    // 사용자 마이페이지-이메일, 폰번호 변경
    @ResponseBody
    @RequestMapping("/changeMypage")
    public String changeMypage(String mId, String mPw, String data, String object, HttpServletRequest req) {

        return "";
    }

    // 사용자 마이페이지-비밀번호 변경
    @RequestMapping("/changePw")
    public String changePw(String mId, String mPw, String data, String object, HttpServletRequest req) {

        return "member/userMypage";
    }

    // 사용자 마이페이지 - 회원탈퇴(아이디로만)
    @RequestMapping("/deleteMember")
    public String deleteMember(String mId, HttpServletRequest req, Model model, String admin, String mNo) {
        return "common/msg";
        
    }

    //  마이페이지에서 사용자-프리랜서 전환
    @RequestMapping("/changeGrade")
    public String changeGrade(String mId, String mPw, int grade, Model model, HttpServletRequest req) {

        // 프리랜서로 전환한 적이 없으면 -> db에 2를 넣어줌
        if (grade == 1) {

            return "redirect:/freelancerMypage?MNo=" + m.getMNo();
        } else {

            return "member/userMypage";
        }
    }

    // 마이페이지 - 의뢰내역 확인하기
    @RequestMapping("/userRequestHistory")
    public String userRequestHistory( int reqPage, Model model) {

        return "member/userRequestHistory";
    }
    
}

