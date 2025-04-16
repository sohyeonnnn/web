package com.refactoring.ilgusi.presentation.notice;

import com.refactoring.ilgusi.application.notice.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class NoticeController {
    private final NoticeService noticeService;

    @GetMapping("/noticeList")
    public String noticeList() {
        return "/notice/noticeList";
    }



}
