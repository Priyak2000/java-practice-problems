package com.java.stringWorks;

public class ReverseString1 {
	public static void main(String[] args) {
		String s="Java Programing languge";
		//reverse the entire string
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);	
		}
		System.out.println(reverse.toString());
		
		//reverse the words from the string
		String [] strArr=s.split(" ");
		String rev=" ";
		for(int j=strArr.length-1;j>=0;j--) {
			rev+=strArr[j]+ " ";	
		}
		System.out.println( rev );
		
		//count the length of last word of the given string
		System.out.println("length of the last word :" + strArr[strArr.length-1].length());
	}

}
