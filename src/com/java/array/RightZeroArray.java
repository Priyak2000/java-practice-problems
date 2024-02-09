package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RightZeroArray {
	public static void main(String[] args) {
		int [] arr= {3,5,0,0,4};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		 }
			while(count<arr.length) {
				arr[count++]=0;
			}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ "");

		}
    }
}
