package com.java.PrevInterviewQstns;

/*Write a function FindMaxInArray, which will find the greatest number
 *  from an array with its desired index? 
 * The greatest number and its desired index should be printed in separate lines.
 */
public class Accenture2 {
	public static int findMaxValIndex(int[] arr) {
		int index=0;
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(max<arr[i]) {
				max=arr[i];
				index=i;
			}	
		}
		System.out.println("Greatest Number: " + max);
        System.out.println("Desired Index: " + index);
		return index;
		}
	public static void main(String[] args) {
		int [] arr= {2,3,6,7,4,3,9,2};
		System.out.println(findMaxValIndex(arr));
		
	}

}

