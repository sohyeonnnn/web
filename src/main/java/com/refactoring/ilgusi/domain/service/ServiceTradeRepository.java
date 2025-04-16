package com.refactoring.ilgusi.domain.service;

import java.util.ArrayList;

public interface ServiceTradeRepository {
    // (문정) 사용자 마이페이지 - 거래내역 불러오기
    ArrayList<ServiceTrade> selectTradeList(int mNo);

    // (문정) 사용자 마이페이지 - 거래에 해당하는 서비스 불러오기
    ArrayList<Service> selectServiceList(int mNo);

    // (문정) 사용자 마이페이지 - 결제시간 불러오기
    ArrayList<String> selectPayDateList(int mNo);

    // (문정) 사용자 마이페이지 - 거래 세부 내용 불러오기
    ServiceTrade serviceTradeView(int tNo);

    // (문정) 사용자 마이페이지 - 거래 세부 내용에 해당하는 서비스 내용 불러오기
    Service selectOneService(int sNo);

    // (영재) 프리랜서 마이페이지 - 거래내역 불러오기
    ArrayList<ServiceTrade> selectTradeList2(int mNo);

    // (영재) 프리랜서 마이페이지 - 거래에 해당하는 서비스 불러오기
    ArrayList<Service> selectServiceList2(int mNo);

    // (영재) 프리랜서 마이페이지 - 결제시간 불러오기
    ArrayList<String> selectPayDateList2(int mNo);

    int updateTStatus(int tNo);

    int updateWarningCount(int mNo);
}
