package com.java.assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*You are given a phone book that consists of people's names and their phone number. After that you will be given some 
 person's name as query. For each query, print the phone number of that person.
-----------------Input Format------------------------
The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: 
a name and the corresponding phone number.
After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
-------------------Constraints----------------------
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' 
or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
-------------------Output Format---------------------
For each case, print "Not found" if the person has no entry in the phone book. Otherwise, 
print the person's name and phone number. See sample output for the exact format.
To make the problem easier, we provided a portion of the code in the editor. You can either 
complete that code or write completely on your own.
*/
public class Question3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Map<String, Integer> phonebook=new HashMap<>();
		for(int i=0;i<n;i++) {
			String name=scan.next().toLowerCase();
			int num=scan.nextInt();
			phonebook.put(name, num);
								}
		while(scan.hasNext()) {
			
			String newName=scan.next().toLowerCase();
			
			if(phonebook.containsKey(newName)) {
				System.out.println(newName + " = " + phonebook.get(newName));
			}
			else {
				System.out.println("not found");
			}
		}
	}

}
