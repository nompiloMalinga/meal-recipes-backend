package com.mealrecipes.backend.controller;


import com.mealrecipes.backend.ResponseDto.CategoriesResponseDto;
import com.mealrecipes.backend.service.MealService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/meals")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {


    private final MealService mealService;

    public CategoryController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/categories")
    public ResponseEntity<CategoriesResponseDto> getCategories(){
       CategoriesResponseDto categories = mealService.getAllCategories();
       if(categories.getCategories().isEmpty()){
           return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(categories);
       }
       return ResponseEntity.ok(categories);
   }



}
