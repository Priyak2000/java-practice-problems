package com.java.stringWorks;

public class InterchangeTwoString {
	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		
		System.out.println("Before Interchange s1=" + s1);
		System.out.println("Before Interchange S2=" + s2);
		
		s1=s1+s2; 
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("Strings after swapping: " + s1);
		System.out.println("Strings after swapping: " + s2);
	}
}
