package com.refactoring.ilgusi.domain.category;

import com.refactoring.ilgusi.domain.member.Member;

import java.util.List;

// 🔸 모든 DB 기술에서 공통으로 사용할 비즈니스 인터페이스
public interface CategoryRepository {
    // 여기서 필요한 커스터마이징 기능 추가
    /*Member findById(Long id);
    List<Member> findByName(String name);*/
   // Member save(Member member);
    List<Category> selectCategoryList();
    List<CategoryRank> selectCategoryRankList();
}
