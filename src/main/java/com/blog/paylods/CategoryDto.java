package com.blog.paylods;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class CategoryDto {
		
	
	private Integer categoryId;
	@NotNull
	@Size(min=4,message="User name at least 4 characters.!!")
	private String categoryTitle;
	@NotNull
	@Size(min=8,message="User name at least 8 characters.!!")
	private String categoryDescription;
	
	
	
	
}
