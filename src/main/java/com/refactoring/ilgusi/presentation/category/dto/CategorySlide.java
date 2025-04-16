package com.refactoring.ilgusi.presentation.category.dto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CategorySlide {
    String categoryName;
    int categoryNo;
    String imageUrl;

    public CategorySlide(String categoryName, int categoryNo, String imageUrl) {
        this.categoryName = categoryName;
        this.categoryNo = categoryNo;
        this.imageUrl = imageUrl;
    }
}
