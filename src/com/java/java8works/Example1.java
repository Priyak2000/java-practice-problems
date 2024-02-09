package com.java.java8works;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,3,4,5,6,7,3,9,1,4));
		List<String> listName=Arrays.asList("Priya", "Sree","Abi","Ammu","Muthu");
		List<Integer> list4=List.of(10, 5, 20, 15, 30);
		//List all distinct elements in non-ascending order
		List<Integer> list1=list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list1);
		
		//Count the distinct element in list 
		int count=(int) list.stream().distinct().count();
		System.out.println(count);
		
		// Print name from list whose firstLetter starts with ‘A’.
		List<String> list2=listName.stream().filter(firstletter->firstletter.startsWith("A")).collect(Collectors.toList());
		System.out.println(list2);
		
		//print max and min element in the list
		//int max=list4.stream().max(Integer::toComparable);
		//Print  3rd max element
		Optional<Integer> thirdmax = list4.stream().distinct().sorted().skip(Math.max(0, list4.size()-3)).findFirst();
		thirdmax.ifPresent(value -> System.out.println("Third maximum value: " + value));
		
		
		//Print the frequency of each element in list
		Map<Integer, Long> hm = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
		System.out.println(hm);
		 
		
		
	}

}
