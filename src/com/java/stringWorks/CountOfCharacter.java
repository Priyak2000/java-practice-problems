package com.java.stringWorks;

public class CountOfCharacter {
	public static void main(String[] args) {
		String s="Development";
		char Search = 'p';
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==Search) {
			count++;
			}
		}
		System.out.println(count);
	}

}
