package com.utd.se3345.project1.sortingapp.service;


import org.springframework.stereotype.Service;

import com.utd.se3345.project1.sortingapp.random.RandomGenerator;
import com.utd.se3345.project1.sortingapp.util.Order;

@Service
public interface Cordinator {
	
	RandomGenerator generateData(int n);
	int[] orderData(RandomGenerator randInstnace, Order type, boolean duplicate);


}
