
package com.java.javaBasic;
import java.util.Scanner;
public class PrimeNum {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int num=scan.nextInt();
	 
	System.out.println("Entered Number: " + num);

    if (isPrime(num)) {
        System.out.println(num + " is a prime number.");
    } else {
        System.out.println(num + " is not a prime number.");
    }
}
	public static boolean isPrime(int num) {
		if(num<=1)
			return false;
		for(int i=2;i<num;i++) {
			if(num%i==0) 
				return false; // num not prime number bcoz it is divible by other than 1 and itself
		}
			return true;
	}
}
