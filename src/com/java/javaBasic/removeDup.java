package com.java.javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Write a program to remove duplicate elements from an array in Java
public class removeDup {
	public static void main(String[] args) {
		int [] arr= {1,2,2,1,4,3,3,6,7,8,0};
		Set<Integer> set= new HashSet<>();
		for(Integer i:arr) {
			set.add(i);
		}
		Integer [] result=set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(result));
		
		//Using java 8
		
		List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> removeDupList =list1.stream()
							.distinct()
							.collect(Collectors.toList());
		System.out.println(removeDupList);
		
		
		
		
	}
	

}
