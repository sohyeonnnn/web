package com.refactoring.ilgusi.presentation.notice;

import com.refactoring.ilgusi.application.notice.NoticeService;
import com.refactoring.ilgusi.domain.notice.Notice;
import com.refactoring.ilgusi.domain.notice.NoticePageData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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

    //공지사항 작성
    @RequestMapping("/noticeWriteFrm")
    public String noticeWriteFrm () {
        return "notice/noticeWriteFrm";
    }

    //공지사항 등록
    @RequestMapping("/insertNotice")
    public String insertNotice(MultipartHttpServletRequest mRequest, Model model, HttpServletRequest request) {

        return "common/msg";
    }

    //공지사항 내용 보기
    @RequestMapping("/noticeView")
    public String noticeView (int nNo, Model model, Notice n) {

        return "notice/noticeView";
    }

    //공지사항 삭제 
    @RequestMapping("/deleteNotice")
    public String deleteNotice(int nNo, Model model) {

        return "common/msg";
    }

    //공지사항 수정 페이지로 이동
    @RequestMapping("/updateNoticeFrm")
    public String updateNoticeFrm (int nNo, Model model, Notice n) {

        return "notice/noticeUpdateFrm";
    }


    // 공지사항 수정
    @RequestMapping("/updateNotice")
    public String updateNotice(int nNo, MultipartHttpServletRequest mRequest, Model model,HttpServletRequest request) {

        return "common/msg";
    }

    //관리자 공지사항리스트
    @RequestMapping("/adminNoticeList")
    public String adminNoticeList ( Model model, int reqPage, String keyword) {

        return "admin/noticeList";
    }

}
