package com.java.javaBasic;

public class TwoDimArr2 {
	public static void main(String[] args) {
		
		int [][] arr1= {{1,2,3},{1,5},{2,6,9}};
		
		//Using for-each loop
		
		for(int [] arr2:arr1) {
			
			for(int arr3:arr2) {
				
			
			System.out.print(arr3+" ");
			
		}
		System.out.println();
	}

}
}
