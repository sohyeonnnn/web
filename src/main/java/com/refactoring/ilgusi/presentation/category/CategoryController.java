package com.refactoring.ilgusi.presentation.category;

import com.refactoring.ilgusi.application.category.CategoryService;
import com.refactoring.ilgusi.common.ResultData;
import com.refactoring.ilgusi.domain.category.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.text.DecimalFormat;
import java.util.List;


@RequiredArgsConstructor
@Controller
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categoryLoad")
    @ResponseBody
    public ResultData<List<Category>> categoryLoad(/*HttpServletResponse resp*/) {
        return categoryService.selectCategoryList();
    }

    // 카테고리별 프리랜서랭킹 ajax로 불러오는거
    @GetMapping(value = "/rankAjax")
    @ResponseBody
    // cateNum : 랭킹 조회할 메인 카테고리의 번호
    public String rankAjax(int cateNum) {

        return null;
    }

}

