package com.utd.se3345.project1.sortingapp.algorithms;

public class SelectionSort implements Sort {

	@Override
	public void sort(int[] list) 
	{
		for(int i=0; i<list.length -1; i++)
		{
			int currentMin = list[i];
			int currentMinIndex = i;
			
		
		
			for(int j= i + 1; j < list.length; j++)
			{
				if(currentMin> list[j])
				{
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i)
			{
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

}
