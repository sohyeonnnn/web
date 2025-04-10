package study.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import study.domain.member.dto.MemberForm;
import study.domain.member.Member;
import study.service.member.MemberService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping(value = "/members/new")
    public String createForm() {
        return "member/createMemberForm";
    }

    @PostMapping(value = "/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());
        memberService.join(member);
        return "redirect:/";
    }

    @GetMapping(value = "/members")
    public String list(Model model) {
        Long memberId = 1l;
        Member member = memberService.findMember(memberId);
        List<Member> list = new ArrayList<>();
        list.add(member);
        model.addAttribute("members", list);
        return "member/memberList";
    }


}
