package com.java.stringWorks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaxLength {
	public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(LongestWord(s.nextLine())); 
	  }  
	public static String LongestWord(String s) {
		//return Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null).toString();
		String str[]=s.split(" ");
		
		int longIndex=0;
		String longWord=" ";
		
		for(int i=0;i<str.length;i++) {
			if(str[i].length()>longIndex) {
				longWord=str[i];
				longIndex=longWord.length();
			}
			
			
		}
		
		return longWord;
		
		
}
}
