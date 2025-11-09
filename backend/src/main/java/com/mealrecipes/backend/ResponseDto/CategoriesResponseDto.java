package com.mealrecipes.backend.ResponseDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mealrecipes.backend.dto.CategoryDto;

import java.util.List;

public class CategoriesResponseDto {


    @JsonProperty("categories")
    private List<CategoryDto>categories;

    public CategoriesResponseDto(List<CategoryDto> categories) {
        this.categories = categories;
    }


    public List<CategoryDto> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDto> categories) {
        this.categories = categories;
    }
}
