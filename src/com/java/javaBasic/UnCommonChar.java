package com.java.javaBasic;

import java.util.HashSet;
import java.util.Set;

public class UnCommonChar {
public static Set<Character> uncommon(String str1, String str2) {
	Set<Character> uncommoncharcter=new HashSet<>();
	for(char ch:str1.toCharArray()) {
		if(!str2.contains(String.valueOf(ch))) {
			uncommoncharcter.add(ch);
		}
	}
	for(char ch:str2.toCharArray()) {
		if(!str1.contains(String.valueOf(ch))) {
			uncommoncharcter.add(ch);
		}
	}
	return uncommoncharcter;
	
	
	
}
public static void main(String[] args) {
	String str1="Priya";
	String str2="Diya";
	Set<Character> result = uncommon(str1, str2);
	if(result.isEmpty()) {
        System.out.println("No uncommon characters found.");
    } else {
        System.out.println("Uncommon characters: " + result);
    }

	}
}

