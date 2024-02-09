package com.java.javaBasic;

import java.util.Scanner;

public class PrimeNum1 {
	
	public static void main(String[] args) {
		double num;
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		num= Math.sqrt(n);
		boolean isprime =true;
		for(int i=2;i<=num;i++) {
			if(n%i==0) {
				isprime=false;
				break;
			
		}
	}
		 if (isprime) {
	            System.out.println("The given number is a prime number");
	        } else {
	            System.out.println("The given number is not a prime number");
	        }
}
}
