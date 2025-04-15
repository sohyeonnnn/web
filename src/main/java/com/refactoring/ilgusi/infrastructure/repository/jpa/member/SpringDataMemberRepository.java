package com.refactoring.ilgusi.infrastructure.repository.jpa.member;

import com.refactoring.ilgusi.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 🔸 기술 전용 인터페이스, Spring이 구현체를 자동 생성해줌
// MemberRepository를 extends하지 않음
public interface SpringDataMemberRepository extends JpaRepository<Member, Integer>{
    Optional<Member> findBymId(String mId);


}
