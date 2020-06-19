package com.utd.se3345.project1.sortingapp.algorithms;

public class InsertionSort implements Sort {

	@Override
	public void sort(int[] arr) {
		
		for(int i = 1; i < arr.length;i++) {
			
			int currentElement = arr[i];
			int k;
			
			for(k = i -1; k >=0 && arr[k] > currentElement; k--) {
				arr[k+1] = arr[k];
			}
			arr[k +1] = currentElement;
		}
		
	}



}
