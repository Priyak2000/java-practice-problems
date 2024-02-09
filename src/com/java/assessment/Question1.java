package com.java.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*create single dimentional array convert into list add some duplicate and remove duplicates element 
and sort store in array also*/

public class Question1 {
	public static void main(String[] args) {
		int [] arr= {1,2,5,12,1,2,7,6};
		System.out.println("Given Array : " + Arrays.toString(arr));
		List<Integer> list=new ArrayList<>();
		for(Integer ch:arr) {
			list.add(ch);
		}
		System.out.println("Array to List :" + list);
		
		list.add(2);
		list.add(1);
		Set<Integer> removeDup= new HashSet<>();
		removeDup.addAll(list);
		List<Integer> list1=new ArrayList<>(removeDup);
		Collections.sort( list1);
		
		System.out.println("After remove dublicate and sorted list :" + list1);
		
	}

}
