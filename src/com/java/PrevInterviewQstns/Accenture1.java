package com.java.PrevInterviewQstns;

/*Write a function CheckPassword(str) which will accept 
 * the string as an argument or parameter and validates the password. 
 * It will return 1 if the conditions are satisfied else it’ll return 0?*/
/*a. It should contain at least 4 characters.
b. At least 1 numeric digit should be present.
c. At least 1 Capital letter should be there.
d. Passwords should not contain space or slash(/).
e. The starting character should not be a number.*/

public class Accenture1 {
	public static boolean checkpassword(String str) {
		boolean isdigit=false, iscaps=false, haveslash=false, start=false;
		if(str.length()<=4) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				isdigit= true;
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				iscaps= true;
			}
			if(str.charAt(i)==' ' ||str.charAt(i)=='/')
				haveslash=true;

			
			
		if(start = (str.charAt(i)>='0' && str.charAt(i)<='9')) {
			start =true;
		}
		}
			
		
	return isdigit && iscaps && !haveslash && !start;
	}
	
	public static void main(String[] args) {
		String str="b19";
		System.out.println(checkpassword(str));
	}

}
