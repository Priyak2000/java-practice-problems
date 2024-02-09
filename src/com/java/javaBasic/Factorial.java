package com.java.javaBasic;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		System.out.print(fact( n));
	}
	public static int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}

}
}
