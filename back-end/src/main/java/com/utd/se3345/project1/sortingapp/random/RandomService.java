package com.utd.se3345.project1.sortingapp.random;

import org.springframework.stereotype.Service;

import com.utd.se3345.project1.sortingapp.util.Order;

@Service
public interface RandomService {
	
	int[] callForData(RandomGenerator rand,Order order, boolean duplicate);

}
