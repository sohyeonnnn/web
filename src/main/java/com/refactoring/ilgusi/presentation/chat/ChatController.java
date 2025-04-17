package com.refactoring.ilgusi.presentation.chat;


import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
@RequiredArgsConstructor
public class ChatController {

	//private final ChatService service;

	// 찜한 서비스 불러오기
	@RequestMapping("/chatHeartList")
	public String heartList(Model model, int mNo) {

		return "chat/chatHeartList";
	}

	// 채팅방 생성
	@ResponseBody
	@RequestMapping("/makeRoom")
	public HashMap<String, Integer> makeRoom(int sNo, String userId, String freeId, int mNo) {

		return null;
	}

	// 채팅방 리스트 불러오기
	@RequestMapping("/chatList")
	public String chatList(HttpServletRequest req, Model model, String mGrade, String mId) {

		return "chat/chatList";
	}

	// 채팅방 입장
	@RequestMapping("/enterRoom")
	public String enterRoom(HttpServletRequest req, Model model, int cNo, int sNo, String yourId, String myId,
			String mGrade) {

		return "chat/chatContent";
	}

	// 채팅내용 db저장
	@ResponseBody
	@RequestMapping("/insertChat")
	public void insertChat(int cNo, String myId, String date, String time, String content) {
	
	}

	// 채팅방 삭제
	@ResponseBody
	@RequestMapping("/deleteChat")
	public String deleteChat(int cNo) {
	
		return "";
	}

	// 메세지 삭제
	@ResponseBody
	@RequestMapping("/deleteMsg")
	public String deleteMsg(int ccNo) {

		return "";
	}

	// 견적서 작성
	@RequestMapping("/quotationFrm")
	public String quotationFrm(Model model, int sNo, String sTitle, String userId, String freeId) {

		return "chat/quotation";
	}

	// serviceTrade에 insert
	@ResponseBody
	@RequestMapping("/startTrade")
	public void startTrade(int sNo, int mNo, String price, String start, String end) {
	

	}

	// 일반회원-프리랜서 전환
	@ResponseBody
	@RequestMapping("switchAccount")
	public int switchAccount(HttpServletRequest req, String mId, int mGrade) {
	

		return 0;
	}

}
