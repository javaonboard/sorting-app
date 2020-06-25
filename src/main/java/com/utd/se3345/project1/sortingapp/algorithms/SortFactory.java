package com.utd.se3345.project1.sortingapp.algorithms;

import com.utd.se3345.project1.sortingapp.util.SortType;

public class SortFactory {
	
	public Sort factory(String sortType) {
		
		switch(sortType) {
		case SortType.   :return new InsertionSort();break;
		}
	}

}
