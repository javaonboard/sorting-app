package com.utd.se3345.project1.sortingapp.service;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utd.se3345.project1.sortingapp.algorithms.Sort;
import com.utd.se3345.project1.sortingapp.algorithms.SortFactory;
import com.utd.se3345.project1.sortingapp.model.SortResponse;
import com.utd.se3345.project1.sortingapp.util.Order;
import com.utd.se3345.project1.sortingapp.util.SortType;

@Service
public class SortService {
	
	@Autowired
	CordinatorImpl cord;
	int[] data;
	

		
		
	public List<SortResponse> getResult(SortType sType,int n,Order oType, boolean duplicate,boolean compareAll) {
		
	    
		List<SortResponse> results = new ArrayList<>();
		
		if(compareAll) {
			SortType[] all = SortType.values();
			for(SortType s: all) {
				prepareData(n,oType,duplicate);
				SortResponse curr = callSortMethod(s);
				curr.setOrderType(oType.toString());
				curr.setRange(n);
				results.add(curr);
			}
		}else {
			
			prepareData(n,oType,duplicate);
			SortResponse curr = callSortMethod(sType);
			curr.setOrderType(oType.toString());
			curr.setRange(n);
			results.add(curr);
	
		}
		
		return results;
	}
	
	public SortResponse getResponse(SortType sType,int n,Order oType, boolean duplicate) {
		prepareData(n,oType,duplicate);
		return callSortMethod(sType);
	}
	
	public void prepareData(int n,Order oType, boolean duplicate) {	
		data = cord.orderData(cord.generateData(n), oType, duplicate);	
	}
	
	public SortResponse callSortMethod(SortType sType) {
		SortResponse sr = new SortResponse();
		

		
		SortFactory sf = new SortFactory();
		
		Sort sortAlgo = sf.factory(sType);
		
		Instant start = Instant.now();
		sortAlgo.sort(data);
		Instant finish = Instant.now();
		
		long timeElapsed = Duration.between(start, finish).toMillis();
		
		sr.setTime(timeElapsed);
        sr.setComparisons(sortAlgo.getComparisons());
        sr.setMovements(sortAlgo.getMovements());
        sr.setSortType(sType.toString());
        
		return sr;
	}
	

}
