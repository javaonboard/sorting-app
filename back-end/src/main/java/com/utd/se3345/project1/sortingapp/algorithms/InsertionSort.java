package com.utd.se3345.project1.sortingapp.algorithms;

public class InsertionSort implements Sort {
	
	private int comparisons;
	private int movements;

	@Override
	public void sort(int[] arr) {
		
		for(int i = 1; i < arr.length;i++) {
			
			int currentElement = arr[i];
			int k;
			
			for(k = i -1; k >=0 && arr[k] > currentElement; k--) {
				comparisons++;
				arr[k+1] = arr[k];
				movements++;
			}
			   movements++;
			arr[k +1] = currentElement;
		}
		
	}

	public int getComparisons() {
		return comparisons;
	}

	public int getMovements() {
		return movements;
	}



}
