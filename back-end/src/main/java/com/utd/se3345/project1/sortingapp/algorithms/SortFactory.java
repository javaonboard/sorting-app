package com.utd.se3345.project1.sortingapp.algorithms;

import com.utd.se3345.project1.sortingapp.util.SortType;

public class SortFactory {
	
	public Sort factory(SortType st) {
		if(st.equals(SortType.INSERTION))return new InsertionSort();
		else if(st.equals(SortType.SELECTION))return new SelectionSort();
		else if(st.equals(SortType.MERGE))return new MergeSort();
		else if(st.equals(SortType.HEAP))return new HeapSort();
		else if(st.equals(SortType.QUICK))return new QuickSort();
		else return new RadixSort();
	}

}
