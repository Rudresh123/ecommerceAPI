package com.example.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dto.CategoryDto;
import com.example.ecommerce.model.Category;
import com.example.ecommerce.repository.CategoryRepo;

@Service
public class CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    public void createCategory(Category category) {
        categoryRepo.save(category);
    }

    public List<Category> listCategory() {
        return categoryRepo.findAll();
    }
    
    public void editCategory(CategoryDto categoryDto, Integer categoryId) throws Exception{
    	
        Optional<Category> optionalCatgory = categoryRepo.findById(categoryId);
        // throw an exception if product does not exists
        if (!optionalCatgory.isPresent()) {
            throw new Exception("Category is not present");
        }
        
        Category category = optionalCatgory.get();
        category.setCategoryName(categoryDto.getCategoryName());
        category.setDescription(categoryDto.getDescription());
        category.setImageUrl(categoryDto.getImageUrl());
        categoryRepo.save(category);
        
    }



}
