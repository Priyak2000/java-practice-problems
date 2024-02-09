package com.java.array;

//Find a peak element which is not smaller than its neighbors

public class PeakElmt {
	
	public static void main(String[] args) 
	{
		int [] arr = {5, 10, 20, 15};
		int n = arr.length;
		peakElement(arr,n);
	}
	
		
		static void peakElement(int arr[], int n) 
		{
			int peak = arr[0];
			for(int i=1;i<arr.length-1;i++) {
				if(arr[i]>arr[0]&&arr[i]>arr[i+1]) {
					peak=arr[i];
				}
			}
			System.out.println(peak);
			
			
		}
	}


