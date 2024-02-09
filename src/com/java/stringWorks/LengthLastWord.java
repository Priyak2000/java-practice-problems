package com.java.stringWorks;

public class LengthLastWord {
	public static void main(String[] args) {
		String str= "Do the things, that bring you happiness";
		String str1[]=str.split(" ");
		
		int lenOfLastWord = str1[str1.length-1].length();
		System.out.println(lenOfLastWord);
	}

}
