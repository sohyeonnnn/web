package com.refactoring.ilgusi.application.category;

import com.refactoring.ilgusi.common.ResultData;
import com.refactoring.ilgusi.domain.category.Category;
import com.refactoring.ilgusi.domain.category.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public ResultData<List<Category>> selectCategoryList() {
       /* List<Category> categoryList = categoryRepository.findAll();
        if (!categoryList.isEmpty()) {
            return ResultData.success(categoryList, null);
        } else {
            return ResultData.fail(null, "카테고리없음");
        }*/
        return null;
    }

}
