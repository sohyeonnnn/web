package com.refactoring.ilgusi.presentation.home;

import com.refactoring.ilgusi.application.home.CategoryService;
import com.refactoring.ilgusi.domain.category.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequiredArgsConstructor
@Controller
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categoryLoad")
    @ResponseBody
    public List<Category> categoryLoad(/*HttpServletResponse resp*/) {
        return categoryService.selectCategoryList();
    }


}

