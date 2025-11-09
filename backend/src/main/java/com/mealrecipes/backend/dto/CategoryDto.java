package com.mealrecipes.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryDto {
     @JsonProperty("idCategory")
    private String idCategory;

     @JsonProperty("strCategory")
    private String strCategory;

     @JsonProperty("strCategoryThumb")
    private String strCategoryThumb;


    @JsonProperty("strCategoryDescription")
    private String strCategoryDescription;

    public CategoryDto(){

    }
    public CategoryDto(String idCategory, String strCategory, String strCategoryThumb, String strCategoryDescription) {
        this.idCategory = idCategory;
        this.strCategory = strCategory;
        this.strCategoryThumb = strCategoryThumb;
        this.strCategoryDescription = strCategoryDescription;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getStrCategoryThumb() {
        return strCategoryThumb;
    }

    public void setStrCategoryThumb(String strCategoryThumb) {
        this.strCategoryThumb = strCategoryThumb;
    }

    public String getStrCategoryDescription() {
        return strCategoryDescription;
    }

    public void setStrCategoryDescription(String strCategoryDescription) {
        this.strCategoryDescription = strCategoryDescription;
    }



}
