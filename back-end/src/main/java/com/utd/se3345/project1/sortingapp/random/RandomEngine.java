package com.utd.se3345.project1.sortingapp.random;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.stereotype.Component;

import com.utd.se3345.project1.sortingapp.util.Order;

@Component
public class RandomEngine implements RandomService {
	

	@Override
	public int[] callForData(RandomGenerator rand,Order type, boolean duplicate) {
		int[] result;
		
		if(duplicate) result = rand.duplicate();
		else result = rand.noDuplicate();
		
		
		if(type.equals(Order.RANDOM)) {
			return result;
		}
		
		else if(type.equals(Order.REVERSE_ORDER)) {
			result = Arrays.stream(result).boxed()
			.sorted(Collections.reverseOrder())
			.mapToInt(Integer::intValue)
			.toArray();
			
		}
		
		else if(type.equals(Order.IN_ORDER)) {
			Arrays.sort(result);	
		}
		
		else if(type.equals(Order.ALMOST_ORDER)) {
			int n1 = (int) ((int) (result.length * 20) * 0.01);
			int n2 = result.length - n1;
	
			int [] eighty = new int[n2];
	
			eighty = Arrays.copyOfRange(result, 0, eighty.length);
			
			Arrays.sort(eighty);
		    
			for(int i=0;i<eighty.length;i++)result[i]=eighty[i];
				
		}
		
		return result;
		
	}
	

}
