package com.refactoring.ilgusi.infrastructure.repository.jpa.member;

import com.refactoring.ilgusi.domain.chat.ChatContent;
import com.refactoring.ilgusi.domain.member.AdminRepository;
import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.domain.member.MemberRepository;
import com.refactoring.ilgusi.domain.member.MemberViewData;
import com.refactoring.ilgusi.domain.question.Question;
import com.refactoring.ilgusi.domain.service.Service;
import com.refactoring.ilgusi.domain.service.ServiceInfo;
import com.refactoring.ilgusi.domain.service.ServiceViewData;
import com.refactoring.ilgusi.domain.service.TradeHistory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

// 🔸 공통 인터페이스를 구현하고 내부에서 Spring Data JPA를 사용

//@Repository
public class JpaAdminRepository implements AdminRepository {

    private final SpringDataAdminRepository jpaRepository;

    public JpaAdminRepository(SpringDataAdminRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }


    @Override
    public ArrayList<Member> selectAllMember() {
        return null;
    }

    @Override
    public int countHistory(int mNo) {
        return 0;
    }

    @Override
    public ArrayList<ServiceInfo> selectAllService() {
        return null;
    }

    @Override
    public int acceptService(int sNo) {
        return 0;
    }

    @Override
    public ArrayList<ServiceInfo> selectService(int sNo) {
        return null;
    }

    @Override
    public void rejectService(int sNo) {

    }

    @Override
    public void deleteService(int sNo) {

    }

    @Override
    public ArrayList<ChatContent> selectAdminMsg(String mId) {
        return null;
    }

    @Override
    public Member selectOneMember(String freeId) {
        return null;
    }

    @Override
    public ArrayList<TradeHistory> tradeHistory(HashMap<String, Integer> map) {
        return null;
    }

    @Override
    public int selectQuestionCount() {
        return 0;
    }

    @Override
    public int selectQuestionCount(int type, String keyword) {
        return 0;
    }

    @Override
    public List<Question> selectQuestionList(int begin, int end, int type, String keyword) {
        return List.of();
    }

    @Override
    public ArrayList<Member> selectMemberListPaging(int start, int end, MemberViewData mvd) {
        return null;
    }

    @Override
    public int totalMemberCount(String grade, String keyword) {
        return 0;
    }

    @Override
    public ArrayList<ServiceInfo> selectServiceListPaging(int start, int end, ServiceViewData svd) {
        return null;
    }

    @Override
    public int totalServiceCount(String status, String keyword1, String keyword2) {
        return 0;
    }

    @Override
    public ArrayList<Service> selectServiceList(String mId) {
        return null;
    }
}