package com.java.stringWorks;

public class Palindrom {
	
	public boolean isPalindrom(String s) {
		int end=s.length()-1;
		int start=0;
		while(start<end) {
			if(s.charAt(end)!=s.charAt(start))
				return false;
			
			start++;
			end--;
		}
		return true;
		
	}
	public static void main(String[] args) {
				String s="Amma".toLowerCase();

				Palindrom obj=new Palindrom();
				System.out.println(obj.isPalindrom(s));

}
}