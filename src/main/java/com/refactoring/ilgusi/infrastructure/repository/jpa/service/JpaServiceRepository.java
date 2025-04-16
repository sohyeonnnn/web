package com.refactoring.ilgusi.infrastructure.repository.jpa.service;


import com.refactoring.ilgusi.domain.service.ServiceRepository;


public class JpaServiceRepository implements ServiceRepository {
    private final SpringDataServiceRepository jpaRepository;

    public JpaServiceRepository(SpringDataServiceRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }
}
