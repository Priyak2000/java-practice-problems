package com.java.javaBasic;

//Fib Series of first 10 numbers
public class FibSeries2 {
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1 + " ");
		System.out.print(n2 + " ");
		
		
		for(int i=0;i<8;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print( n3+ " ");
		}
	}

}
