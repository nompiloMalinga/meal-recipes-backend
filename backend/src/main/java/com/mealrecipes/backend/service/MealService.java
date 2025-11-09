package com.mealrecipes.backend.service;

import com.mealrecipes.backend.ResponseDto.CategoriesResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class MealService {

    private static final String BASE_URL = "https://www.themealdb.com/api/json/v1/1";
    public  final Logger logger = LoggerFactory.getLogger(MealService.class);

    @Autowired
    private final RestTemplate restTemplate;

    public MealService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CategoriesResponseDto getAllCategories(){
        String url = BASE_URL +"/categories.php";

        try{

            ResponseEntity<CategoriesResponseDto> response = restTemplate.getForEntity(url, CategoriesResponseDto.class);

            return Optional.ofNullable(response.getBody())
                            .orElse(new CategoriesResponseDto(new ArrayList<>()));

        } catch (Exception e) {
            logger.error("Failed to fetch categories from MealDB API:",e);
            return new CategoriesResponseDto(new ArrayList<>());
        }

    }
}
