package com.refactoring.ilgusi.domain.member;

import com.refactoring.ilgusi.domain.chat.ChatContent;
import com.refactoring.ilgusi.domain.question.Question;
import com.refactoring.ilgusi.domain.service.Service;
import com.refactoring.ilgusi.domain.service.ServiceInfo;
import com.refactoring.ilgusi.domain.service.ServiceViewData;
import com.refactoring.ilgusi.domain.service.TradeHistory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

// 🔸 모든 DB 기술에서 공통으로 사용할 비즈니스 인터페이스
public interface AdminRepository {
    // (소현)관리자-전체회원조회
    ArrayList<Member> selectAllMember();

    // (소현)회원별 서비스 이용횟수
    int countHistory(int mNo);

    // (소현)관리자-전체서비스불러오기
    ArrayList<ServiceInfo> selectAllService();

    // (소현)서비스 승인
    int acceptService(int sNo);

    // (소현)관리자-서비스거절창에 서비스정보보내기
    ArrayList<ServiceInfo> selectService(int sNo);

    // (소현)서비스 등록 거절
    void rejectService(int sNo);

    // (소현)서비스 삭제
    void deleteService(int sNo);

    // (소현)관리자가 회원에게 보낸 메세지 리스트
    ArrayList<ChatContent> selectAdminMsg(String mId);

    // (소현)아이디로 회원 불러오기
    Member selectOneMember(String freeId);

    // (소현)작업내역조회
    ArrayList<TradeHistory> tradeHistory(HashMap<String, Integer> map);

    int selectQuestionCount();

    int selectQuestionCount(int type, String keyword);

    List<Question> selectQuestionList(int begin, int end, int type, String keyword);

    // (소현)조건에 만족하는 회원리스트 불러오기 - 페이징 전
    /*
     * ArrayList<Member> selectAllMember2(MemberViewData mvd);
     */

    // (소현)회원리스트 페이징
    ArrayList<Member> selectMemberListPaging(int start, int end, MemberViewData mvd);

    // (소현) member totalCount
    int totalMemberCount(String grade, String keyword);

    // (소현)관리자-서비스리스트 페이징추가
    ArrayList<ServiceInfo> selectServiceListPaging(int start, int end, ServiceViewData svd);

    // (소현)service total count
    int totalServiceCount(String status, String keyword1, String keyword2);

    // 회원의 서비스개수 구하기
    ArrayList<Service> selectServiceList(String mId);
}
