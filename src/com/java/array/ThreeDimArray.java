package com.java.array;

import java.util.Arrays;

public class ThreeDimArray {
	public static void main(String[] args) {
		int [][][] threeArr= new int[2][4][2];
		System.out.println(Arrays.toString(threeArr));
		
		for(int i=0;i<threeArr.length;i++) {
			for(int j=0;j<threeArr[i].length;j++) {
				for(int k=0;k<threeArr[j].length;k++) {
					System.out.print(threeArr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
