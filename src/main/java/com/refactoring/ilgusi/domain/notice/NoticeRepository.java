package com.refactoring.ilgusi.domain.notice;

import java.util.ArrayList;

public interface NoticeRepository {
    // 공지사항 리스트 조회
    ArrayList<Notice> selectNoticeList(int start, int end, String keyword);

    // 공지사항 등록
    int insertNotice(Notice n);

    // 공지사항 상세 보기
    Notice selectNoticeView(int nNo);

    // 공지사항 삭제
    int deleteNotice(int nNo);

    // 공지사항 수정
    int updateNotice(Notice n);

    // 공지사항 전체 개수 조회
    int totalCount();
}
