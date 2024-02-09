package com.java.javaBasic;

public class TwoDimArr1 {
	public static void main(String[] args) {
		
		//Using for loop
		
		int [][] arr1= new int[3][2];	
		for(int i=0; i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
	}

}
