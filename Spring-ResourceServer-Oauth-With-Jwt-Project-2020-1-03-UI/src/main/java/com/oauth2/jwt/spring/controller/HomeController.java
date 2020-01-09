package com.oauth2.jwt.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String getPublic(){
		return "This is for all";
	}
	
	@RequestMapping("/private")
	public String getPrivate(){
		return "This is private properties";
	}
	
	@RequestMapping("/add")
	public String getInfo(){
		int x=3;
		int y=6;
		int sum=x+y;
		return "Sum of X and Y is: "+sum;
	}
}
