package com.java.javacollectionworks;

import java.util.HashMap;
import java.util.Map;

public class Example {
public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<>();
	map.put(1,"priya");
	map.put(2,"Abi");
	map.put(3,"Sjalu");
	map.put(4,"Jeni");
	map.put(5,"Ammu");
	
	for(Map.Entry<Integer, String> entry: map.entrySet()) {
		System.out.println(entry.getKey() + entry.getValue());
	}
}
}
