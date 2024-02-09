package com.java.java8works;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Basics {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Priya", "Manu","Joe","chutki","isha");
		
		//Get the length of each word
		
		Map<String, Integer> map= list.stream().collect(Collectors.toMap(word->word, String::length));
		System.out.println(map);
		
		//get the lenght of the priya
		
		int wordLength=list.stream().filter(word->word.equals("Priya")).mapToInt(String::length).findFirst().orElse(0);
		System.out.println("Length of priya :" + wordLength);
		
	}

}
