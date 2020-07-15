package com.utd.se3345.project1.sortingapp.algorithms;

public class MergeSort implements Sort 
{
	
	private long comparisons;
	private long movements;
	
	@Override
	public void sort(int[] arr) {
		sortHelper(arr);
	} 
	
	public void sortHelper(int[] arr) 
    { 
       if(arr.length > 1) {
    	   int [] firstHalf = new int[arr.length /2];
    	   System.arraycopy(arr, 0, firstHalf, 0, arr.length/2);
    	   sortHelper(firstHalf);
    	   
    	   int secondHalfLength = arr.length - arr.length /2;
    	   int [] secondHalf = new int[secondHalfLength];
    	   System.arraycopy(arr,  arr.length/2,  secondHalf, 0, secondHalfLength);
    	   sortHelper(secondHalf);
    	   merge(firstHalf, secondHalf, arr);
       }
    } 
	
	public void merge(int[] list1, int[] list2, int[] temp) 
    {        
       int current1 = 0;
       int current2 = 0;
       int current3 = 0;
       
       while(current1 < list1.length && current2 < list2.length) {
    	   comparisons++;
    	   movements++;
    	   if (list1[current1]< list2[current2])
    		   temp[current3++] = list1[current1++];
    	   else
    		   temp[current3++] = list2[current2++];
       }
       
       while(current1 < list1.length) {temp[current3++] = list1[current1++];movements++;comparisons++;}
       while(current2 < list2.length) {temp[current3++] = list2[current2++];movements++;comparisons++;}
    }

	public long getComparisons() {
		return comparisons;
	}

	public long getMovements() {
		return movements;
	}


  
    
    
  



	
    
}
