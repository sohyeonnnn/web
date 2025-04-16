package com.refactoring.ilgusi.infrastructure.repository.jpa.service;


import com.refactoring.ilgusi.domain.service.Service;
import com.refactoring.ilgusi.domain.service.ServiceTrade;
import com.refactoring.ilgusi.domain.service.ServiceTradeRepository;

import java.util.ArrayList;


public class JpaServiceTradeRepository implements ServiceTradeRepository {
    private final SpringDataServiceTradeRepository jpaRepository;

    public JpaServiceTradeRepository(SpringDataServiceTradeRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }


    @Override
    public ArrayList<ServiceTrade> selectTradeList(int mNo) {
        return null;
    }

    @Override
    public ArrayList<Service> selectServiceList(int mNo) {
        return null;
    }

    @Override
    public ArrayList<String> selectPayDateList(int mNo) {
        return null;
    }

    @Override
    public ServiceTrade serviceTradeView(int tNo) {
        return null;
    }

    @Override
    public Service selectOneService(int sNo) {
        return null;
    }

    @Override
    public ArrayList<ServiceTrade> selectTradeList2(int mNo) {
        return null;
    }

    @Override
    public ArrayList<Service> selectServiceList2(int mNo) {
        return null;
    }

    @Override
    public ArrayList<String> selectPayDateList2(int mNo) {
        return null;
    }

    @Override
    public int updateTStatus(int tNo) {
        return 0;
    }

    @Override
    public int updateWarningCount(int mNo) {
        return 0;
    }
}
