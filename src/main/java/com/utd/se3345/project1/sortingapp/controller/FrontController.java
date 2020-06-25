package com.utd.se3345.project1.sortingapp.controller;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.utd.se3345.project1.sortingapp.model.SortRequest;
import com.utd.se3345.project1.sortingapp.model.SortResponse;

@RestController
public class FrontController {
	
	@GetMapping("/sort")
	public String test() {
		return "Hello UTD Students!";
	}
	
	@PostMapping("/sort")
	public List<SortResponse> getSortInfos(@RequestBody SortRequest sortReq){
		
		return new ArrayList<SortResponse>();
		
	}
=======
public class FrontController {
>>>>>>> 6caf08354e10a9ec69fefec494a86615ffe1ed73

}
