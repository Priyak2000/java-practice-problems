package com.java.PrevInterviewQstns;

import java.util.Scanner;

//Check max no.of character btw the two same character
public class Zoho1 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String input = obj.next(); //babcddc
		System.out.println(MaxNumber(input));
		
	}
	public static int MaxNumber(String input) {
		String temp="";
		int big_length=0;
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<input.length();j++) {
				if(input.charAt(i)==input.charAt(j)) {
					if(big_length<input.substring(i+1, j).length()) {
						temp=input.substring(i+1,j);
						big_length=temp.length();
						i=j-1;
						
					}
					
				}
			}
		}
		return big_length;
		
	}

}
