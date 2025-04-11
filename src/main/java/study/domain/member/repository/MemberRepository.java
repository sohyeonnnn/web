package study.domain.member.repository;

import study.domain.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
	Member save(Member member);
	//Member findById(Long id);
	Optional<Member> findById(Long id);
	Optional<Member> findByName(String name);
	List<Member> findAll();
}
