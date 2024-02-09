package com.java.javacollectionworks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExam {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("priya", 20);
		System.out.println(map);
		
		//Add 3 to priya using merge
		 
		map.merge("priya", 3, Integer::sum);
		System.out.println(map);
		
		//Get the value of priya
		System.out.println(map.get("priya"));
/*-----------------------------------------------------------------------------------------------*/
		List<String> names=Arrays.asList("Priya", "Sree","Abi","Priya","Saji","Shammu", "Ammu", "Shammu", "Shammu");
		Map<String , Integer> nameoccurance = new HashMap<>();
		
		//creating hashmap with name and occurrence
		
		names.forEach(name -> nameoccurance.merge(name,1, Integer:: sum));
		System.out.println(nameoccurance);
		System.out.println(nameoccurance.getOrDefault("Priya", 0));
/*----------------------------------------------------------------------------------------------*/
		
		Map<String, Integer> map1=new HashMap<>();
		map1.put("Appu", 30);
		map1.put("Akshay",25);
		
		Map<String, Integer> map2=new HashMap<>();
		map2.put("Appu", 10);
		map2.put("Abishek",25);
		
		//Merge the map with merge()
		 
		 map2.forEach((key, value) -> map1.merge(key, value, Integer::sum));
	     System.out.println(map1);
	     
	     
		
		
		
	
	}

}
