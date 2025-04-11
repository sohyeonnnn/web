package com.refactoring.ilgusi.infrastructure.repository.jpa.home;

import com.refactoring.ilgusi.domain.category.CategoryRepository;

// 🔸 공통 인터페이스를 구현하고 내부에서 Spring Data JPA를 사용

//@Repository
public class JpaCategoryRepository implements CategoryRepository {

    private final SpringDataCategoryRepository jpaRepository;

    public JpaCategoryRepository(SpringDataCategoryRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

}