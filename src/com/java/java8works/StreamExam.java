package com.java.java8works;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamExam {
	public static void main(String[] args) {
		
		int [] arr= {1,2,5,7,9,5,15};
		
		//max element in the list
		
		int max=Arrays.stream(arr).max().orElseThrow();
	
			System.out.println(max);
			
			//get odd numbers from the given array
			
			List<Integer> odd=Arrays.stream(arr)
					.filter(num->num%2!=0)
					.boxed()
					.collect(Collectors.toList());
			System.out.println(odd);
		
		
		
	}

}
