package study.domain.member.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.member.Member;

import java.util.List;
import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member,Long>, MemberRepository  {
	Optional<Member> findByName(String name);

	@Override
	default List<Member> findAll() {
		return List.of();
	}

	@Override
	default List<Member> findAll(Sort sort) {
		return List.of();
	}

	@Override
	default Page<Member> findAll(Pageable pageable) {
		return null;
	}

	@Override
	default List<Member> findAllById(Iterable<Long> longs) {
		return List.of();
	}

	@Override
	default long count() {
		return 0;
	}

	@Override
	default void deleteById(Long aLong) {

	}

	@Override
	default void delete(Member entity) {

	}

	@Override
	default void deleteAll(Iterable<? extends Member> entities) {

	}

	@Override
	default void deleteAll() {

	}

	@Override
	default <S extends Member> S save(S entity) {
		return null;
	}

	@Override
	default <S extends Member> List<S> saveAll(Iterable<S> entities) {
		return List.of();
	}

	@Override
	default Member save(Member member) {
		return null;
	}

	@Override
	default Optional<Member> findById(Long aLong) {
		return Optional.empty();
	}

	@Override
	default boolean existsById(Long aLong) {
		return false;
	}

	@Override
	default void flush() {

	}

	@Override
	default <S extends Member> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	default void deleteInBatch(Iterable<Member> entities) {

	}

	@Override
	default void deleteAllInBatch() {

	}

	@Override
	default Member getOne(Long aLong) {
		return null;
	}

	@Override
	default <S extends Member> Optional<S> findOne(Example<S> example) {
		return Optional.empty();
	}

	@Override
	default <S extends Member> List<S> findAll(Example<S> example) {
		return List.of();
	}

	@Override
	default <S extends Member> List<S> findAll(Example<S> example, Sort sort) {
		return List.of();
	}

	@Override
	default <S extends Member> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	default <S extends Member> long count(Example<S> example) {
		return 0;
	}

	@Override
	default <S extends Member> boolean exists(Example<S> example) {
		return false;
	}
}
