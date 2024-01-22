package com.blog.services;

import java.util.List;



import com.blog.paylods.PostDto;
import com.blog.paylods.PostResponse;

public interface PostService 
{
  //create 
	public PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	public PostDto updatePost(PostDto postDto,Integer postId);
	
	
	//delete
	public void deletePost(Integer postId);
	
	//get by id
	public PostDto  getPostById(Integer postId);
	
	
	
	//get All post
	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
	
	
	//get all posts  by cat
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	
	//get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPosts(String kwyword);
	
	
}
