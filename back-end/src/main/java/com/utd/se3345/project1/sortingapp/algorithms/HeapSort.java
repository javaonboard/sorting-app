package com.utd.se3345.project1.sortingapp.algorithms;


public class HeapSort implements Sort 
{

	Heap heap;
	
	@Override
	public void sort(int arr[]) 
    { 
		 heap = new Heap();
		for(int i=0; i<arr.length;i++)heap.add(arr[i]);
		
		for(int i=arr.length-1;i>=0;i--)arr[i] = heap.remove();
    }

	public int getMovements() {
		return heap.getMovements();
	}

	public int getComparisons() {
		return heap.getComparisons();
	}  	
    	
    	
    	
    	
}
