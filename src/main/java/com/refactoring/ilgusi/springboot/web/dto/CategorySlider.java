package com.refactoring.ilgusi.springboot.web.dto;

import java.util.List;

public class CategorySlider {
    String categoryName;
    List<CategorySlide> categorySlideList;

    public CategorySlider(String categoryName, List<CategorySlide> categorySlideList) {
        this.categoryName = categoryName;
        this.categorySlideList = categorySlideList;
    }
}
