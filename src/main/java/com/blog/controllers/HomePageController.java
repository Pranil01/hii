package com.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.paylods.UserDto;
import com.blog.services.UserService;

@RestController
//@RequestMapping("/")
public class HomePageController
{
	@Autowired
  public UserService userService;
	
	@GetMapping("/")
	public ResponseEntity<List<UserDto>>getAllUsers()
	{
    return ResponseEntity.ok(this.userService.getAllUsers());
}
}
