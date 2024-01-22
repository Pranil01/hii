package com.blog.services;

import org.springframework.stereotype.Service;

//import com.blog.entities.Comment;
import com.blog.paylods.CommentDto;

//@Service
public interface CommentService
{

	
	CommentDto createComment(CommentDto commentDto,Integer postId);
	  void deleteCommenet(Integer commentId);
}
