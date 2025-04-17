package com.refactoring.ilgusi.presentation.member;

import com.refactoring.ilgusi.application.member.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@RequiredArgsConstructor
@Controller
public class AdminController {
	private final AdminService service;

	// 전체회원조회-검색,정렬,페이징
	@RequestMapping("/manageMember")
	public String manageMember(Model model, int reqPage, String grade, String keyword, String order) {
		
		return "admin/memberList";
	}

	// 전체서비스조회-검색,정렬,페이징
	@RequestMapping("/manageService")
	public String selectAllService(Model model, int reqPage, String status, String keyword1, String keyword2,
			String order) {

		return "admin/serviceList";
	}

	// 서비스승인
	@ResponseBody
	@RequestMapping("/acceptService")
	public int acceptService(String mId, int sNo) {
		return 0;	

	}

	// 서비스거절창에 서비스정보보내기
	@RequestMapping("/rejectFrm")
	public String rejectFrm(Model model, int sNo) {
	
		return "admin/rejectFrm";
	}

	// 서비스 등록 거절
	@ResponseBody
	@RequestMapping("rejectService")
	public void rejectService(int sNo) {

	}

	// 서비스 삭제
	@ResponseBody
	@RequestMapping("deleteService")
	public void deleteService(int sNo) {
		
	}

	// 작업내역 조회
	@RequestMapping("tradeHistory")
	public String workingCount(Model model, int sNo, int mNo) {
		
			return "/admin/userHistory";
		
	}

	// 회원에게 메세지보내기 창 열기
	@RequestMapping("adminMessage")
	public String adminMessage(Model model, int mNo) {
		
		return "/admin/adminMessage";
	}

	// qna 관리자페이지 내에서 접속
	@RequestMapping("manageQnA")
	public String qna(Model model, @RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "list_num", defaultValue = "10") int listNum,
			@RequestParam(value = "qna_keyword", required = false) String keyword,
			@RequestParam(value = "qna_type", defaultValue = "1") int type) {
	
		return "/admin/qnaList";
	}

}
