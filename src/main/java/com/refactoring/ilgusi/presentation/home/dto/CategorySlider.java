package com.refactoring.ilgusi.presentation.home.dto;

import java.util.List;

public class CategorySlider {
    String categoryName;
    List<CategorySlide> categorySlideList;

    public CategorySlider(String categoryName, List<CategorySlide> categorySlideList) {
        this.categoryName = categoryName;
        this.categorySlideList = categorySlideList;
    }
}
