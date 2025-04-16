package com.refactoring.ilgusi.infrastructure.repository.jpa.member;

import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.domain.member.MemberRepository;

import java.util.Optional;

// 🔸 공통 인터페이스를 구현하고 내부에서 Spring Data JPA를 사용

//@Repository
public class JpaMemberRepository  implements MemberRepository {

    private final SpringDataMemberRepository jpaRepository;

    public JpaMemberRepository(SpringDataMemberRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

   @Override
   public void save(Member member) {
       jpaRepository.save(member);
   }

    @Override
    public Optional<Member> findBymId(String mId) {
        return jpaRepository.findBymId(mId);
    }

    @Override
    public int selectBuyingCount(int mNo) {
        return 0;
    }

    @Override
    public int selectSellingCount(String mId) {
        return 0;
    }

    @Override
    public Member loginMember(String id, String pw) {
        return null;
    }

    @Override
    public int registerMember(Member m) {
        return 0;
    }

    @Override
    public Member checkId(String id) {
        return null;
    }

    @Override
    public Member searchIdPw(Member m) {
        return null;
    }

    @Override
    public int changePw(Member m) {
        return 0;
    }

    @Override
    public int changeMypage(String mId, String data, String object) {
        return 0;
    }

    @Override
    public int deleteMember(String mId) {
        return 0;
    }

    @Override
    public int changeGrade(String mId, int grade) {
        return 0;
    }

    @Override
    public int settingMemberGrade(Member m) {
        return 0;
    }

    @Override
    public int tradeStatus(int mNo) {
        return 0;
    }

    @Override
    public int setDeleteStatusY(String mId) {
        return 0;
    }


}