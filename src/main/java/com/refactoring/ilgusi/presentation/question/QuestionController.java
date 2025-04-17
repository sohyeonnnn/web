package com.refactoring.ilgusi.presentation.question;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RequiredArgsConstructor
@Controller
public class QuestionController {

	//private final QuestionService service;

	//  qna 페이지 접속
	@RequestMapping("qna")
	public String qna(Model model, @RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "list_num", defaultValue = "5") int listNum,
			@RequestParam(value = "qna_keyword", required = false) String keyword,
			@RequestParam(value = "qna_type", defaultValue = "1") int type) {


		return "/question/qna";
	}

	//  qna 상세보기 페이지 접속
	@RequestMapping("questionView")
	public String questionView(int qNo, Model model) {

		return "/question/questionView";
	}

	//  qna 상세보기 페이지 ajax로
	@RequestMapping(value="questionViewAjax", produces = "text/json; charset=utf-8")
	@ResponseBody
	public String questionViewAjax(int qNo, Model model) {

		return null;
	}

	//  question 작성 페이지 접속
	@RequestMapping("questionFrm")
	public String questionFrm(Model model, @RequestParam(value = "q_No", defaultValue = "-1") int qNo) {

		return "/question/registerQuestionFrm";
	}

	//	 파일다운 기능
	@GetMapping("questionDown")
	public void download(HttpServletRequest req,HttpServletResponse resp,String fileName) {

	}
	//  question 삭제 기능
	@RequestMapping("deleteQuestion")
	public String deleteQuestion(Model model,int qNo,String loc) {

		return "/common/msg";
		
	}
	//  question 작성 기능
	@RequestMapping("registerQuestion")
	public String registerQuestion(HttpServletRequest req, MultipartFile file, Model model,
			@RequestParam(value = "answer_No", defaultValue = "-1") int answerNo,
			@RequestParam(value = "q_No", defaultValue = "-1") int qNo,
			@RequestParam(value="loc",required = false) String loc,
			@RequestParam(value="isPrivacy",required = false) String isPrivacy) {


		return "/common/msg";
	}
}
