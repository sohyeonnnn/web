package com.refactoring.ilgusi.infrastructure.repository.jpa.favorite;


import com.refactoring.ilgusi.domain.favorite.FavoriteRepository;

public class JpaFavoriteRepository implements FavoriteRepository {
    private final SpringDataFavoriteRepository jpaRepository;

    public JpaFavoriteRepository(SpringDataFavoriteRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }
}
