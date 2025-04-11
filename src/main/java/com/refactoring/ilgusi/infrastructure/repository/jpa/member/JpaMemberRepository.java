package com.refactoring.ilgusi.infrastructure.repository.jpa.member;

import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.domain.member.MemberRepository;

// 🔸 공통 인터페이스를 구현하고 내부에서 Spring Data JPA를 사용

//@Repository
public class JpaMemberRepository  implements MemberRepository {

    private final SpringDataMemberRepository jpaRepository;

    public JpaMemberRepository(SpringDataMemberRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }


   /* @Override
    public Member findById(Long id) {
        return null;
    }

    @Override
    public List<Member> findByName(String name) {
        return Collections.emptyList();
    }
*/
    @Override
    public Member save(Member member) {
        return jpaRepository.save(member);
    }
}