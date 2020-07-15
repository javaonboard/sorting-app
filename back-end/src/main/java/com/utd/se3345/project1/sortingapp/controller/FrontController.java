package com.utd.se3345.project1.sortingapp.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.utd.se3345.project1.sortingapp.model.SortResponse;
import com.utd.se3345.project1.sortingapp.service.SortService;
import com.utd.se3345.project1.sortingapp.service.SystemInfo;
import com.utd.se3345.project1.sortingapp.util.Order;
import com.utd.se3345.project1.sortingapp.util.SortType;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FrontController {
	
	@Autowired
	SortService sortService;
	
	@GetMapping("/sysinfo")
	public Map<String,String> test() {
		SystemInfo sy = new SystemInfo();
		
		return sy.getsysInfo();
	}
	
	@GetMapping("/sort")
	public List<SortResponse> getSortInfos(@RequestParam Map<String,String> params){
		//if(params.get("SortType")==null)return null;
		
		SortType sEnum = SortType.valueOf(params.get("sortType"));
		Order oEnum = Order.valueOf(params.get("orderType"));
		
		return sortService.getResult(sEnum, Integer.parseInt(params.get("range")), 
										oEnum, Boolean.valueOf(params.get("duplicate")),Boolean.valueOf(params.get("compareAll")));
		
	}


}
