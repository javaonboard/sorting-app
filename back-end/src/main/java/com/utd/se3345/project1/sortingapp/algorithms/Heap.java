package com.utd.se3345.project1.sortingapp.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Heap {
	
	private long movements;
	private long comparisons;
	
	List<Integer> list = new ArrayList<>();
	
	public Heap(int[] arr) {
		for(int i =0; i< arr.length;i++) {
			add(arr[i]);
		}
	}
	public Heap() {
	
	}
	
	public void add(int num) {
		list.add(num);
		int currentIndex = list.size() -1;
		
		while(currentIndex>0) {
			
			int parentIndex = (currentIndex -1) /2;
			if(list.get(currentIndex) > list.get(parentIndex)) {
				comparisons++;
				int temp = list.get(currentIndex);
				list.set(currentIndex,  list.get(parentIndex));
				list.set(parentIndex,  temp);
				movements+=2;
			}else break;
			
			currentIndex = parentIndex;
		}
	}
	
	public int remove() {
		
		if(list.size()==0)return 0;
		int removedInt = list.get(0);
		list.set(0,  list.get(list.size()-1));
		list.remove(list.size()-1);
		int currentIndex =0;
		while(currentIndex < list.size()) {
			comparisons++;
			int leftChildIndex = 2*currentIndex +1;
			int rightChildIndex = 2* currentIndex +2;
			if(leftChildIndex >= list.size())break;
			int maxIndex = leftChildIndex;
			if(rightChildIndex < list.size()) {
				if(list.get(maxIndex) < list.get(rightChildIndex)) {
					maxIndex = rightChildIndex;
				}
			}
			
			if(list.get(currentIndex) < list.get(maxIndex)) {
				int temp = list.get(maxIndex);
				list.set(maxIndex,  list.get(currentIndex));
				list.set(currentIndex, temp);
				movements+=2;
				currentIndex = maxIndex;
			}else break;
		}
		
		return removedInt;
	}
	public long getMovements() {
		return movements;
	}
	public long getComparisons() {
		return comparisons;
	}


}
