package com.java.java8works.fuctionalInterface;

public class MainClass {
	public static void main(String[] args) {
		
		//Without Functional Interface
		Demo11 obj=new Demo11();
		obj.display();
		
		Demo2 obj2 = ()->{System.out.println("With Fuctional Interface");};
		obj2.display2();
	}

}
