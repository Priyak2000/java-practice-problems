package com.java.stringWorks;

import java.util.HashMap;
import java.util.Map;

public class RepeatedNonRepeated {
	public static void main(String[] args) {
		String str="Do the things that bring you happiness";
		Map<Character, Integer> map=new HashMap<>();
		for(char c:str.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		
		}
		//First non repeating character in given string
		for(char c:str.toCharArray()) {
			if(map.get(c)==1) {
				System.out.println("First non repeated character in given string is : " + c);
				break;
			}
		}
		//first repeated character in given string
		for(char c:str.toCharArray()) {
			if(map.get(c)>1){
				System.out.println("First non repeated character in given string is : " + c);
				break;
			}
		}
		
	}

}
