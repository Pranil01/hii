package com.blog.services;

import java.util.List;

import com.blog.paylods.CategoryDto;

public interface CategoryService {
	
	
	//create
	public CategoryDto createCategory(CategoryDto categoryDto); 
	
	
	//update
	public CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	//delete
	public void deleteCategory(Integer categoryId); 
	
	//get by id
	public CategoryDto getCategory(Integer categoryId);
	
	//get All
     List<CategoryDto >  getCategories();
}
