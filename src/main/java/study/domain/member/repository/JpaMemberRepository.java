package study.domain.member.repository;

import study.domain.member.Member;

import javax.persistence.EntityManager;
import java.util.*;

//@Repository
public class JpaMemberRepository implements MemberRepository {
	private final EntityManager em;
	public JpaMemberRepository(EntityManager em) {
		this.em = em;
	}
	public Member save(Member member) {
		em.persist(member);
		return member;
	}
	/*public Optional<Member> findById(Long id) {
		Member member = em.find(Member.class, id);
		return Optional.ofNullable(member);
	}*/
	public Member findById(Long id) {
		Member member = em.find(Member.class, id);
		return member;
	}


	public List<Member> findAll() {
		return em.createQuery("select m from Member m", Member.class)
				.getResultList();
	}
	public Optional<Member> findByName(String name) {
		List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
				.setParameter("name", name)
				.getResultList();
		return result.stream().findAny();
	}
}
