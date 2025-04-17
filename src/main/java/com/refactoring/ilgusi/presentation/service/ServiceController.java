package com.refactoring.ilgusi.presentation.service;


import com.refactoring.ilgusi.application.member.MemberService;
import com.refactoring.ilgusi.application.service.ServiceService;
import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.domain.service.Join;
import com.refactoring.ilgusi.domain.service.ServicePay;
import com.refactoring.ilgusi.domain.service.ServiceReview;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;


@RequiredArgsConstructor
@Controller
public class ServiceController {

	private final ServiceService service;
	private final MemberService memberService;

	@RequestMapping("/introduceFrm")
	public String introduceFrm(String mId, int reqPage, Model model) {
	
		return "freelancer/introduce";
	}

	// 리뷰갯수 구하기
	@RequestMapping("/reviewListSize")
	public void reviewListSize(String mId, Model model) {

	}
	// 평점 평균 구하기
	/*
	 * @RequestMapping("/sRateAVG") public void sRateAVG(String mId,Model model)
	 * { System.out.println("midRate>>>>>>>>전>"+mId); List<Service> list =
	 * service.sRateAVG(mId); System.out.println("midRate>>>>>>>>>"+mId);
	 * model.addAttribute("list",list); System.out.println("list>>>>>>평균점수"+list); }
	 */
	// 

	@RequestMapping("/serviceJoinFrm")
	public String serviceJoinFrm() {
		return "freelancer/servicejoin";
	}

	@RequestMapping("/serviceJoin")
	public String serviceJoin(Join join, Model model, MultipartFile[] ssImg, HttpServletRequest request) {
			return "common/msg";
	}

	// 프리랜서 마이페이지 이동
	@RequestMapping("/freelancerMypage")
	public String selectfreelancerMypage(int MNo, Model model) {
		
		return "freelancer/freelancerMypage";
	}

	// 프리랜서 마이페이지 -> 서비스 리스트 이동
	@RequestMapping("/freelancerServiceList")
	public String freelancerServiceList(String mId, Model model, String order) {
	
		return "freelancer/freelancerServiceList";
	}

	// 프리랜서 마이페이지 정보수정(소개글,연락가능시간,브랜드명 추가)
	@RequestMapping("/updateFreelancer")
	public String updateFreelancer(Member m, Model model, HttpServletRequest req) {
		
		return "common/msg";
	}

	// 프리랜서 마이페이지 - 서비스 삭제하기
	@RequestMapping("/delService")
	public String deleteService(int sNo, Model model, String mId) {
		
		return "common/msg";
	}

	// 사용자 마이페이지 - 거래후기 쓰기
	@RequestMapping("/serviceReviewWrite")
	public String serviceReviewWrite(int tNo, int sNo, String mId, String sImg, String sTitle, Model model) {
	
		return "service/serviceReviewWrite";
	}

	//  마이페이지 - 서비스 후기 등록
	@RequestMapping("/serviceReviewInsert")
	public String serviceReviewInsert(ServiceReview data, Model model) {
		
		return "/service/reviewDone";
	}

	//  마이페이지 - 거래 후기 작성한거 확인
	@RequestMapping("/serviceReviewView")
	public String serviceReviewView(ServiceReview data, Model model) {

		return "/service/serviceReviewUpdate";
	}

	//  서비스 리뷰 수정
	@RequestMapping("/serviceReviewUpdate")
	public String serviceReviewUpdate(ServiceReview review, Model model) {
		
		return "/service/reviewDone";
	}

	//  서비스 리뷰 삭제
	@RequestMapping("/serviewReviewDelete")
	public String serviewReviewDelete(int rNo, int tNo, int sNo, Model model) {
		
		return "/service/reviewDone";
	}

	// serviceList
	@RequestMapping("/serviceList")
	public String serviceList(int cNo, int reqPage, String order, Model model, String keyword) {

		return "/service/serviceList";
	}

	//  serviceView 페이지 이동
	@RequestMapping("/serviceView")
	public String serviceView(int sNo, Model model, int reqPage, int mNo) {
	
		return "/service/serviceView";
	}

	//  serviceView 페이지 이동 (로그인 안됐을때)
	@RequestMapping("/serviceView2")
	public String serviceView(int sNo, Model model, int reqPage) {
		
		return "/service/serviceView";
	}

	//  결제 진행
	@RequestMapping("/insertServicePay")
	public String insertServicePay(ServicePay pay) {

		return "redirect:/userTradeHistory?mNo=" + pay.getPNo();
	}

	// serviceList
	@RequestMapping("/serviceSearch")
	public String serviceSearch(@RequestParam(value = "page", defaultValue = "1") int page, String order, Model model, String keyword) {
		return "/service/serviceAllList";
	}

	@ResponseBody
	@RequestMapping
	public int isPossibleMakeService(String mId) {
	
		return 0;
	}
}
