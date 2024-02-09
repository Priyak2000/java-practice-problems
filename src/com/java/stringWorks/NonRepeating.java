package com.java.stringWorks;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class NonRepeating {
	public static void main(String[] args) {
		String s="Software Developer";
		
		//print first non repeating character in given string
		char ch= ' ';
		
		for(char c:s.toCharArray()) {
			if(s.indexOf(c)==s.lastIndexOf(c)) {
				ch=c;
				break;
			}
			
		}
		System.out.println(ch);
		
	}

}


