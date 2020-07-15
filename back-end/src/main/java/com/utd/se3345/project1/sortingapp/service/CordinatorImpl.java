package com.utd.se3345.project1.sortingapp.service;


import org.springframework.stereotype.Service;
import com.utd.se3345.project1.sortingapp.random.RandomEngine;
import com.utd.se3345.project1.sortingapp.random.RandomGenerator;
import com.utd.se3345.project1.sortingapp.util.Order;

@Service
public class CordinatorImpl implements Cordinator {
	

	@Override
	public RandomGenerator generateData(int n) {
		RandomGenerator randomGenerator = new RandomGenerator(n);
		return randomGenerator;
	}

	@Override
	public int[] orderData(RandomGenerator randInstnace, Order type, boolean duplicate) {
		RandomEngine randomEngine = new RandomEngine();
		return randomEngine.callForData(randInstnace, type, duplicate);
	}


}
