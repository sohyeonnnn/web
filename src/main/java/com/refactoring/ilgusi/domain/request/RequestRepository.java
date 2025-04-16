package com.refactoring.ilgusi.domain.request;

import com.refactoring.ilgusi.domain.service.Service;

import java.util.ArrayList;

public interface RequestRepository {
    //(문정) 의뢰글 작성
    int requestInsert(Request req);

    //(문정) 의뢰게시판 총 개수
    int totalCount(String subject, String keyword);

    //(문정) 페이징 리스트
    ArrayList<Request> selectRequestList(int start, int end, String order, String subject, String keyword);

    //(문정) 의뢰게시판 상세보기
    Request selectOneRequest(int reqNo);

    //(문정) 의뢰 수정
    int requestUpdate(Request req);

    //(문정) 의뢰글 삭제
    int requestDeleteOne(int reqNo);

    //(문정) 판매자의 리스트
    ArrayList<Service> selectList(String freeId);
}
