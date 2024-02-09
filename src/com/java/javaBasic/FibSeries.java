package com.java.javaBasic;

import java.util.Scanner;

public class FibSeries {
	
	public static int fibnoccie(int num) {
		if(num<=1) {
			return num;
		}
		else {
			return fibnoccie(num-1)+fibnoccie(num-2);
		}
	}
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
	
		for(int i=0;i<num;i++) {
			System.out.println(fibnoccie(i)+ " ");
		}
		
		
		
	}
	

}
