package com.java.PrevInterviewQstns;

import java.util.Arrays;

public class Anogram {
	public static void main(String[] args) {
		String str="cat";
		String str1="act";
		System.out.println(isAnagram(str1, str1));
		
	}
	public static boolean isAnagram(String str, String str1) {
		if(str.length()!=str1.length())
			return false;
		
		char [] strArr=str.toCharArray();
		char [] str1Arr=str1.toCharArray();
		
		Arrays.sort(strArr);
		Arrays.sort(str1Arr);
		
		Boolean result=Arrays.equals(strArr, str1Arr);
		if(result)
			return true;
		return result;
	
	}

}
