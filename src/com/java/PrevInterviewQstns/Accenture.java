package com.java.PrevInterviewQstns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*Write a function SmallLargeSum(array) which accepts 
the array as an argument or parameter, that performs the addition of 
the second largest element from the even location with the second largest element 
from an odd location?*/

public class Accenture {
	public static int smallLargestSum(int [] arr) {
	List<Integer> evenlist  =new ArrayList<>();
	List<Integer> oddlist =new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			evenlist.add(arr[i]);
		}
		else {
			oddlist.add(arr[i]);
		}
	}
	Collections.sort(evenlist);
	Collections.sort(oddlist);
	int secondlargestEven=evenlist.get(evenlist.size()-2);
	int secondlargestOdd=oddlist.get(oddlist.size()-2);
	int sum =secondlargestEven+secondlargestOdd;
	return sum;
	}
	public static void main(String[] args) {
		int [] arr= {3, 2, 1, 7 ,5, 4};
		System.out.println(smallLargestSum(arr));
	}

}
