package com.java.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*For this problem, we have  types of queries you can perform on a List:
Insert  at index :
Insert
x y
Delete the element at index :
Delete
x
Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.
Input Format
The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:
If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value
 must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from */

public class Question2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// size of the list
		int n=scan.nextInt();
		
		//Get the list element one by one from user
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(scan.nextInt());
			
		}
		//no. of operation perforemd
		int q=scan.nextInt();
		
		//Process the query
		
		String queryType=scan.next();
		
		//loop the process until given no .of operation reached
		for(int i=0;i<q;i++) {
			if(queryType.equals("insert")) {
				int index=scan.nextInt();
				int value=scan.nextInt();
				list.add(index, value);
			}
			else if(queryType.equals("delete")) {
				int index=scan.nextInt();
				list.remove(index);
				
			}
		}
		//print updated list
		
		for(Integer list1 : list) {
			System.out.print(list1 + " ");
		}
		
		
	}
	

}
