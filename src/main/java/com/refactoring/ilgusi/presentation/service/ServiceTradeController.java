package com.refactoring.ilgusi.presentation.service;

import com.refactoring.ilgusi.application.service.ServiceTradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@RequiredArgsConstructor
@Controller
public class ServiceTradeController {
	private final ServiceTradeService service;
	
	//사용자 마이페이지-거래내역 불러오기
	@RequestMapping("/userTradeHistory")
	public String userHeartList(int mNo, Model model) {

		return "member/userTradeHistory";
	}

	
	//사용자 마이페이지 - 거래 세부 내용 불러오기
	@RequestMapping("/serviceTradeView")
	public String serviceTradeView(int tNo, Model model) {

		return "service/serviceTradeView";
	}

	//프리렌서 마이페이지-거래내역 불러오기
	@RequestMapping("/freelancerTradeHistory")
	public String freelancerHeartList(int mNo, Model model) {

		return "freelancer/freelancerTradeHistory";
	}
		
	//작업완료버튼누르면 t_status 변경( 1-->2)
	@ResponseBody
	@RequestMapping("/updateTStatus")
	public void updateTStatus(int tNo, Model model) {

	}

	//warningCount 변경
	@RequestMapping("/updateWarningCount")
	public String updateWarningCount(int mNo, Model model, HttpServletRequest req) {

		return "redirect:/freelancerTradeHistory?mNo="/*+m.getMNo()*/;
	}
	
	//팝업창 닫고 페이지 이동만
	@RequestMapping("/goToPage")
	public String goToPage(int sNo) {
		return "redirect:/serviceView?sNo="+sNo+"&reqPage=1";
	}
}
