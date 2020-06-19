package com.utd.se3345.project1.sortingapp.model;

public class SortRequest {

	private String algorithmType;
	private int itemSize;
	private String orderType;
	
	public SortRequest() {}
	
	public SortRequest(String algorithm, int size, String order) {
		algorithmType = algorithm;
		itemSize = size;
		orderType = order;
	}
	
	public String getAlgorithmType() { return algorithmType; }
	public void changeAlgorithmType(String newType) { algorithmType = newType; }
	
	public int getItemSize() { return itemSize; }
	public void changeItemSize(int newSize) { itemSize = newSize; }
	
	public String getOrderType() { return orderType; }
	public void changeOrderType(String newOrder) { orderType = newOrder; }
}
