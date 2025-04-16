package com.refactoring.ilgusi.infrastructure.repository.jpa.request;

import com.refactoring.ilgusi.domain.request.Request;
import com.refactoring.ilgusi.domain.request.RequestRepository;
import com.refactoring.ilgusi.domain.service.Service;

import java.util.ArrayList;

public class JpaRequestRepository implements RequestRepository {
    private final SpringDataRequestRepository jpaRepository;

    public JpaRequestRepository(SpringDataRequestRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public int requestInsert(Request req) {
        return 0;
    }

    @Override
    public int totalCount(String subject, String keyword) {
        return 0;
    }

    @Override
    public ArrayList<Request> selectRequestList(int start, int end, String order, String subject, String keyword) {
        return null;
    }

    @Override
    public Request selectOneRequest(int reqNo) {
        return null;
    }

    @Override
    public int requestUpdate(Request req) {
        return 0;
    }

    @Override
    public int requestDeleteOne(int reqNo) {
        return 0;
    }

    @Override
    public ArrayList<Service> selectList(String freeId) {
        return null;
    }
}
