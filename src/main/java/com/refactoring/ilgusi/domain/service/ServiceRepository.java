package com.refactoring.ilgusi.domain.service;

import com.refactoring.ilgusi.domain.category.Category;
import com.refactoring.ilgusi.domain.favorite.Favorite;
import com.refactoring.ilgusi.domain.member.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface ServiceRepository {
    Join selectOneMember(String mId);

    int insertService(Join join);

    // 프리랜서 마이페이지 정보 수정
    int updateFreelancer(Member m);

    Member selectOneMember(int MNO); // 프리랜서 한명의 개인페이지 가져오는거

    List<ReviewJoin> selectReviewList(String mId, int start, int end);

    int selectServiceNo();

    int insertServiceFile(int serviceNo, String filename, String filepath);

    List<Service> serviceList(String mId);

    int totalCount(String mId);

    // (문정) 마이페이지 - 서비스 후기 등록
    int serviceReviewInsert(ServiceReview sr);

    // (문정) 마이페이지에서 후기 등록하면 tStatus 바꿔줌(리뷰 작성완료로 : 3)
    int serviceReviewSuccess(int tNo);

    // (문정) 마이페이지 - 거래 후기 작성한거 확인
    ServiceReview serviceReviewView(ServiceReview data);

    // (문정) 거래 후기 수정
    int serviceReviewUpdate(ServiceReview review);

    // (문정) 거래 삭제
    int serviceReviewDelete(int rNo);

    // (문정) 거래 삭제했을때 tStatus 수정
    int serviceTradeStatusUpdate(int tNo);

    // (다솜) 서비스 리스트 - 카테고리 불러오기
    ArrayList<Category> categoryList(int cNo);

    // (다솜)서비스 리스트 페이징
    ArrayList<Service> selectServiceList(HashMap<String, Object> map);

    // (다솜)서비스 토탈 카운트
    int serviceTotalCount(HashMap<String, Object> map);

    // (다솜)서비스 상세보기
    Service selectServiceView(int sNo);

    // (다솜)서비스 리뷰 불러오기
    ArrayList<ServiceReview> serviceViewReviewList(int sNo, int start, int end);

    // (다솜) 리뷰 페이징을 위한 토탈카운트
    int totalReviewCount(int sNo);

    // (다솜) 전문가 정보 불러오기
    Member selectMemberName(String memberId);

    // (다솜) 다른 서비스 불러오기
    ArrayList<Service> userService(String memberId);

    // (다솜) 서비스파일 리스트
    ArrayList<ServiceFile> fileList(int sNo);

    // (영재)review총 갯수 구하기
    List<ServiceReview> reviewListSize(String mId);

    float sRateAVG(String mId);

    // (문정) 결제 진행
    int insertServicePay(ServicePay pay);

    // (문정) tradeStatus 변경
    int updateTradeStatus(int tNo);

    // (도현) search service
    List<Service> searchService(int begin, int end, String keyword);

    // (도현) search serviceCount
    int selectServiceCount(String keyword);

    // 프리랜서마이페이지 서비스 삭제
    int deleteService(int sNo);

    ArrayList<Service> selectServiceList(String mId, String order);

    // (문정) 리뷰 작성하면 서비스테이블 s_rate에 평점 넣어줌
    int serviceUpdateSRate(int sNo);

    // (문정) 프리랜서가 등록한 총 서비스 개수
    int selectFreeServiceCount(String mId);

    Favorite searchFavorite(int mNo, int sNo);
}
