package com.java.javaBasic;

import java.util.Scanner;

public class RemoveVow {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str=scan.next();
		String res=" ";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u') {
				res+=str.charAt(i);
			}
		}
		System.out.println(res);
	}

}
