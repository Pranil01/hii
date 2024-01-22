package com.blog.paylods;


import lombok.Getter;

import lombok.Setter;

public class ApiResponse {

	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Getter
	@Setter

	private String message;
	private boolean sucess;
	public ApiResponse(String message, boolean sucess) {
		super();
		this.message = message;
		this.sucess = sucess;
	}
	
	
}
