package com.refactoring.ilgusi.presentation.home;

import com.refactoring.ilgusi.application.home.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequiredArgsConstructor
@Controller
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categoryLoad")
    @ResponseBody
    public String categoryLoad(/*HttpServletResponse resp*/) {
        /*Gson gson = new Gson();
        List<Category> list = categoryService.selectCategoryList();
        String json = gson.toJson(list);
        return json;*/
        return null;
    }


}

