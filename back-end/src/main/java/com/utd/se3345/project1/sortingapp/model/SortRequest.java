package com.utd.se3345.project1.sortingapp.model;

public class SortRequest {

	private String algorithmType;
	private int itemSize;
	private String orderType;
	private boolean duplicate;
	
	public SortRequest() {}
	
	public SortRequest(String algorithm, int size, String order,boolean dup) {
		this.algorithmType = algorithm;
		this.itemSize = size;
		this.orderType = order;
		this.duplicate = dup;
	}
	
	public String getAlgorithmType() { return algorithmType; }
	public void setAlgorithmType(String newType) { algorithmType = newType; }
	
	public int getItemSize() { return itemSize; }
	public void setItemSize(int newSize) { itemSize = newSize; }
	
	public String getOrderType() { return orderType; }
	public void setOrderType(String newOrder) { orderType = newOrder; }

	public boolean isDuplicate() {
		return duplicate;
	}

	public void setDuplicate(boolean duplicate) {
		this.duplicate = duplicate;
	}
	
	
}
