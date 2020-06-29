package com.utd.se3345.project1.sortingapp.model;

public class SortResponse {
	
	private int range;
	private String orderType;
	private String sortType;
	private int comparisons;
	private int movements;
	private double time;
	
	public SortResponse() {}
	
	public SortResponse(int num, String dataType, String sortType, int comparisons, int movements, double time) {
		this.range = num;
		this.orderType = dataType;
		this.sortType = sortType;
		this.comparisons = comparisons;
		this.movements = movements;
		this.time = time;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getSortType() {
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public int getComparisons() {
		return comparisons;
	}

	public void setComparisons(int comparisons) {
		this.comparisons = comparisons;
	}

	public int getMovements() {
		return movements;
	}

	public void setMovements(int movements) {
		this.movements = movements;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	
	

}
