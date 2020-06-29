package com.utd.se3345.project1.sortingapp.algorithms;

public class QuickSort implements Sort {
	private int comparisons;
	private int movements;

	@Override
	public void sort(int[] arr) {
		sortHelper(arr, 0, arr.length - 1);

	}

	public int partition(int arr[], int first, int last) {
		int pivot = arr[first];
		int low = first +1;
		int high = last;
        
		while(high > low) {
			
			while(low <= high && arr[low] <= pivot) {low++;comparisons++;}
			while(low <= high && arr[high]>pivot) {high--;comparisons++;}
		    if(high > low) {
		    	int temp = arr[high];
		    	arr[high] = arr [low];
		    	arr[low] = temp;
		    	movements+=2;
		    }
		}
		
		while(high > first && arr[high] >= pivot) { high--;comparisons++;}
		if(pivot > arr[high]) {
			arr[first] = arr[high];
			arr[high] = pivot;
			movements+=2;
			return high;
		}else return first;
	}

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be sorted,
	 * low --> Starting index, high --> Ending index
	 */
	void sortHelper(int[] list, int first, int last) {
		if(last>first) {
			int pivotIndex = partition(list, first, last);
			sortHelper(list,first,pivotIndex-1);
			sortHelper(list, pivotIndex+1, last);
		}
		
		
	}

	public int getComparisons() {
		return comparisons;
	}

	public int getMovements() {
		return movements;
	}

}
