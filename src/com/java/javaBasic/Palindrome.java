package com.java.javaBasic;

public class Palindrome {
	public static void main(String[] args) {
		
	
	int num=1001;
	int original=num;
	int rem;
	int rev=0;
	
	while(num!=0) 
	{
		rem = num%10;
		rev = rev*10+rem;
		num=num/10;
		
		
	}
	if(rev==original) {
		System.out.println("The given number is palindrom");
	}
	else {
		System.out.println("The given number is not palindrom");
	}

	}
}
