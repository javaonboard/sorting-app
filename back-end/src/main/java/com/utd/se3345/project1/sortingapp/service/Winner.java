package com.utd.se3345.project1.sortingapp.service;

import java.util.List;
import java.util.PriorityQueue;


import com.utd.se3345.project1.sortingapp.model.SortResponse;
import com.utd.se3345.project1.sortingapp.util.SortType;

public class Winner {
	
	public void findWinner(List<SortResponse> list){
		
	  PriorityQueue<SortResponse> pq = new PriorityQueue<>((a,b)-> b.getPoint()-a.getPoint());
      
	  for(int i=0; i<list.size();i++) {
		  
    	 int point = 0;
    	 SortResponse curr = list.get(i);
    	 for(int j=0;j<list.size();j++) {
    	     if(i==j)continue;
    	     SortResponse temp = list.get(j);
    	     if(curr.getTime()<=temp.getTime())point++;
    	     if(!curr.getSortType().contentEquals(SortType.RADIX.toString()) && curr.getComparisons()<=temp.getComparisons())point++;
    	     if(curr.getMovements()<=temp.getMovements())point++;
    	 }
    	 
         curr.setPoint(point);
         pq.add(curr);
    	  
      }
	    int win = 1;
		while(!pq.isEmpty()) {
			SortResponse curr = pq.poll();
			//System.out.println(curr.getSortType()+" " + curr.getPoint());
			curr.setWinner(String.valueOf(win++));
		}
		
	}

}
