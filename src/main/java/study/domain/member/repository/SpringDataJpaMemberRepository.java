package study.domain.member.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.domain.member.Member;

@Repository
@Primary
public interface SpringDataJpaMemberRepository extends JpaRepository<Member,Long>, MemberRepository  {
}
