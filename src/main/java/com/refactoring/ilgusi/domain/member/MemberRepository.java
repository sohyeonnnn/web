package com.refactoring.ilgusi.domain.member;

import java.util.Optional;

// 🔸 모든 DB 기술에서 공통으로 사용할 비즈니스 인터페이스
public interface MemberRepository  {
    // 여기서 필요한 커스터마이징 기능 추가
    void save(Member member);
    //Optional<Member> findByMId(String mId);






    //Optional<Member> findById(Integer id);
    //Member saveAndReturn(Member member);

    /*custom*/
   // Member getByIdOrThrow(Integer id);
}
