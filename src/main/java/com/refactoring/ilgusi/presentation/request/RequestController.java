package com.refactoring.ilgusi.presentation.request;

import com.refactoring.ilgusi.application.request.RequestService;
import com.refactoring.ilgusi.domain.request.Request;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RequiredArgsConstructor
@Controller
public class RequestController {

	private final RequestService service;

	
	//의뢰게시판 리스트
	@RequestMapping("/requestList")
	public String requestList(int reqPage, String order, String subject, String keyword, Model model) {

		return "request/requestList";
	}
	
	//작성폼으로 이동
	@RequestMapping("/requestWriteFrm")
	public String requestWriteFrm( String position, Model model) {
		model.addAttribute("position", position);
		return "request/requestWriteFrm";
	}
	
	// 의뢰 insert
	@RequestMapping("/requestInsert")
	public String requestInsert(Model model, MultipartHttpServletRequest mtfRequest, HttpServletRequest request) {

	      return "common/msg";
	}
	
	// 의뢰게시판 상세보기
	@RequestMapping("/requestDetail")
	public String requestDetail(int reqNo, String position, Model model) {

		return "request/requestDetail";
	}
	
	// 의뢰글 frm
	@RequestMapping("/requestUpdateFrm")
	public String requestUpdateFrm(int reqNo, String position, Model model) {

		return "request/requestUpdateFrm";
	}
	
	// 의뢰글 수정하기
	@RequestMapping("/requestUpdate")
	public String requestUpdate(Request req, Model model, MultipartHttpServletRequest mtfRequest, HttpServletRequest request) {

		return "common/msg";
	}
	
	// 의뢰 삭제
	@RequestMapping("/requestDeleteOne")
	public String requestDeleteOne(int reqNo, String filepath, String position, Model model, HttpServletRequest request, HttpServletResponse response) {

		return "common/msg";
	}
	
	// 의뢰자에게 연락하기 전 서비스 고르는 팝업창 띄움
	@RequestMapping("/requestSendPopup")
	public String requestSendPopup(String userId, String freeId, Model model) {

		return "request/requestSendPopup";
	}
	
	// 파일 다운로드
	@RequestMapping("/requestFileDownload")
	public void requestFileDownload(String filepath, HttpServletRequest req, HttpServletResponse res) {

	}
}
