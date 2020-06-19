package com.utd.se3345.project1.sortingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
	
	@GetMapping("/sort")
	public String test() {
		return "Hello UTD Students!";
	}

}
