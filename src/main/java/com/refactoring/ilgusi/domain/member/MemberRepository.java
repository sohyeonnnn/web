package com.refactoring.ilgusi.domain.member;

import java.util.Optional;

// 🔸 모든 DB 기술에서 공통으로 사용할 비즈니스 인터페이스
public interface MemberRepository  {
    // 여기서 필요한 커스터마이징 기능 추가
    void save(Member member);
    Optional<Member> findBymId(String mId);

    // (도현)메인페이지에 판매진행,구매진행중 정보 전달
    int selectBuyingCount(int mNo);
    int selectSellingCount(String mId);

    // (도현) 로그인 기능
    Member loginMember(String id, String pw);

    // (도현) 회원가입 기능
    int registerMember(Member m);

    // (도현) 아이디 중복검사 기능
    Member checkId(String id);

    // (도현) 아이디/비밀번호 찾기 기능
    Member searchIdPw(Member m);

    // (도현)비밀번호 찾기 후 - 비밀번호 변경
    int changePw(Member m);

    // (문정)사용자 마이페이지-이메일, 폰번호, 비번 변경
    int changeMypage(String mId, String data, String object);

    // (문정)사용자 마이페이지-회원탈퇴
    int deleteMember(String mId);

    // (문정) 마이페이지에서 사용자-프리랜서 전환
    int changeGrade(String mId, int grade);

    // (문정) 로그인하면 grade를 1로 셋팅
    int settingMemberGrade(Member m);

    // (문정) 거래중인 서비스가 있는지 확인
    int tradeStatus(int mNo);

    // (문정)탈퇴하기전 delete_status = 'y' 셋팅
    int setDeleteStatusY(String mId);
}
