package com.refactoring.ilgusi.presentation.notice;

import com.refactoring.ilgusi.application.notice.NoticeService;
import com.refactoring.ilgusi.domain.notice.NoticePageData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class NoticeController {
    private final NoticeService noticeService;

    @GetMapping("/noticeList")
    public String noticeList(Model model, @RequestParam("reqPage") int reqPage,
                             @RequestParam(value = "keyword", required = false, defaultValue = "") String keyword) {
        Map<String, Object> paramMap = new HashMap();
        paramMap.put("reqPage", 0);
        paramMap.put("keyword", 0);
        NoticePageData npd = noticeService.selectNoticeList(paramMap).getData();
        model.addAttribute("list", npd.getList());
        model.addAttribute("pageNavi", npd.getPageNavi());
        return "/notice/noticeList";
    }



}
