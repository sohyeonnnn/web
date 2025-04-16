package com.refactoring.ilgusi.application.favorite;

import com.refactoring.ilgusi.domain.favorite.FavoriteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class FavoriteService {
    private final FavoriteRepository favoriteRepository;


}
