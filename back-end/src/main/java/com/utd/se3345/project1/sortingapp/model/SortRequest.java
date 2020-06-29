package com.utd.se3345.project1.sortingapp.model;

public class SortRequest {

	private String sortType;
	private int range;
	private String orderType;
	private boolean duplicate;
	
	public SortRequest() {}
	
	public SortRequest(String algorithm, int size, String order,boolean dup) {
		this.sortType = algorithm;
		this.range = size;
		this.orderType = order;
		this.duplicate = dup;
	}
	


	public boolean isDuplicate() {
		return duplicate;
	}

	public void setDuplicate(boolean duplicate) {
		this.duplicate = duplicate;
	}
	
	
}
