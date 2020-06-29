package com.utd.se3345.project1.sortingapp.random;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Component;


public class RandomGenerator {
	
	private Random ran;
	private int[] arr;
	
	public RandomGenerator(int n) {
		ran = new Random();
		arr = new int[n];
	}
	
	public int[] noDuplicate(){
		Set<Integer> set = new HashSet<>();
		int i = 0;
		while(i<arr.length) {
			int curr = ran.nextInt(arr.length);
			if(set.contains(curr))continue;
			set.add(curr);
			arr[i++] = curr;
		}
		
		return arr;
	}
	
	public int[] duplicate(){
		int i = 0;
		while(i<arr.length) {
			int curr = ran.nextInt(arr.length);
			arr[i++] = curr;
		}
		
		return arr;
	}

}
