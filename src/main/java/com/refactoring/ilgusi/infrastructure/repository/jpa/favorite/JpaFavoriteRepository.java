package com.refactoring.ilgusi.infrastructure.repository.jpa.favorite;


import com.refactoring.ilgusi.domain.favorite.FavoriteRepository;
import com.refactoring.ilgusi.domain.service.Service;

import java.util.ArrayList;

public class JpaFavoriteRepository implements FavoriteRepository {
    private final SpringDataFavoriteRepository jpaRepository;

    public JpaFavoriteRepository(SpringDataFavoriteRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public ArrayList<Service> selectHeartList(int mNo, String order) {
        return null;
    }

    @Override
    public ArrayList<String> selectBrandName(int mNo, String order) {
        return null;
    }

    @Override
    public int deleteHeart(int sNo, int mNo) {
        return 0;
    }

    @Override
    public int insertHeart(int sNo, int mNo) {
        return 0;
    }
}
