package com.blog.paylods;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.blog.entities.Comment;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

	private Integer postId;
	@NotEmpty
	@Size(min=4,message="title should be atleast 4 characters.!!")
	private String title;
	@NotEmpty
	@Size(min=10,message="Content should be atleast 10 characters.!!")
	private String  content;
	
	private String imageName;
	private Date addedDate;
	
	
	private CategoryDto category;
    
	private UserDto user;
	
	private Set<Comment> comments=new HashSet<>();
}
