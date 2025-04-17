package com.refactoring.ilgusi.presentation.favorite;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequiredArgsConstructor
@Controller
public class FavoriteController {

	//private final FavoriteService service;
	
	// 사용자 마이페이지-찜한 리스트 이동(정렬)
	@RequestMapping("/userHeartList")
	public String userHeartList(int mNo, String order, Model model) {
		
		return "member/userHeartList";
	}
	
	//사용자 마이페이지 - 찜한거 삭제
	@ResponseBody
	@RequestMapping("/deleteHeart")
	public String deleteHeart(int sNo, int mNo) {

		return "";
	}
	
	//사용자마이페이지 - 찜한 목록에 추가
	@ResponseBody
	@RequestMapping("/insertHeart")
	public String insertHeart(int sNo, int mNo) {

		return "";
	}
	
	
}
