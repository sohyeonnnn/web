package com.refactoring.ilgusi.infrastructure.repository.jpa.notice;

import com.refactoring.ilgusi.domain.notice.Notice;
import com.refactoring.ilgusi.domain.notice.NoticeRepository;

import java.util.ArrayList;

public class JpaNoticeRepository implements NoticeRepository {
    private final SpringDataNoticeRepository jpaRepository;

    public JpaNoticeRepository(SpringDataNoticeRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public ArrayList<Notice> selectNoticeList(int start, int end, String keyword) {
        return null;
    }

    @Override
    public int insertNotice(Notice n) {
        return 0;
    }

    @Override
    public Notice selectNoticeView(int nNo) {
        return null;
    }

    @Override
    public int deleteNotice(int nNo) {
        return 0;
    }

    @Override
    public int updateNotice(Notice n) {
        return 0;
    }

    @Override
    public int totalCount(){
        return 0;
    }

}
