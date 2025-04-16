package com.refactoring.ilgusi.domain.favorite;

import com.refactoring.ilgusi.domain.service.Service;

import java.util.ArrayList;

public interface FavoriteRepository {
    // (문정) 사용자 마이페이지 - 찜한 목록 불러오기 (정렬)
    ArrayList<Service> selectHeartList(int mNo, String order);

    // (문정) 사용자 마이페이지 - 찜한 목록 중 브랜드 이름 가져오기
    ArrayList<String> selectBrandName(int mNo, String order);

    // (문정) 사용자 마이페이지 - 찜한거 삭제
    int deleteHeart(int sNo, int mNo);

    // (문정) 사용자 마이페이지 - 찜한 목록에 추가
    int insertHeart(int sNo, int mNo);
}

