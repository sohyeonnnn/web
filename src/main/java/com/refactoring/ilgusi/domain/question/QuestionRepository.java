package com.refactoring.ilgusi.domain.question;

import java.util.List;

public interface QuestionRepository {

    // 전체 질문 리스트 조회
    List<Question> selectQuestionList();

    // 질문 리스트 페이징 조회
    List<Question> selectQuestionList(int begin, int end);

    // 조건 검색 포함 질문 리스트 조회
    List<Question> selectQuestionList(int begin, int end, int type, String keyword);

    // 질문 등록
    int insertQuestion(Question q);

    // 특정 질문 조회
    Question selectOneQuestion(int qNo);

    // 전체 질문 개수 조회
    int selectQuestionCount();

    // 조건 포함 질문 개수 조회
    int selectQuestionCount(int type, String keyword);

    // 답변 등록
    int updateAnswer(Question q);

    // 질문 수정
    int updateQuestion(Question q);

    // 질문 삭제
    int deleteQuestion(int qNo);

}
