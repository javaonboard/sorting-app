package com.utd.se3345.project1.sortingapp.model;

public class SortResponse {
	
	private int num;
	private String dataType;
	private String sortType;
	private int comparisons;
	private int movements;
	private double time;
	
	public SortResponse() {}
	
	public SortResponse(int num, String dataType, String sortType, int comparisons, int movements, double time) {
		this.num = num;
		this.dataType = dataType;
		this.sortType = sortType;
		this.comparisons = comparisons;
		this.movements = movements;
		this.time = time;
	}
	
	public int getNum() { return num; }
	public void setNum(int newNum) { num = newNum; }
	
	public String getDataType() { return dataType; }
	public void setDataType(String newDataType) { dataType = newDataType; }
	
	public String getSortType() { return sortType; }
	public void setSortType(String newSortType) { sortType = newSortType; }
	
	public int getComparison() { return comparisons; }
	public void setNumComparisons(int newComparisons) { comparisons = newComparisons; }
	
	public int getMovements() { return movements; }
	public void setNumMovements(int newMovements) { movements = newMovements; }
	
	public double getTime() { return time; }
	public void setTime(int newTime) { time = newTime; }
}
