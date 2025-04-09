package com.refactoring.ilgusi.springboot.web.dto;

import jdk.nashorn.internal.objects.annotations.Constructor;
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
