package com.java.javaBasic;

//Factorial of 5
public class fact2 {
	public static void main(String[] args) {
		int n=5;
		int fact=1;
		for(int i=1; i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

}
