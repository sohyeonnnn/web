package com.refactoring.ilgusi.infrastructure.repository.jpa.member;

import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.domain.member.MemberRepository;

import javax.persistence.EntityNotFoundException;
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

    /*public Optional<Member> findByMId(String mId) {
        return jpaRepository.findByMId(mId);
    }
*/


    /*custom*/
  /*  @Override
    public Member getByIdOrThrow(Integer id) {
        return jpaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("회원 없음"));
    }
*/


}