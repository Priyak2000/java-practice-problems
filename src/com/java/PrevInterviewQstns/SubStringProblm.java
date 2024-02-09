package com.java.PrevInterviewQstns;

public class SubStringProblm {
	public static void main(String[] args) {
        // Example usage
        String[] strArr1 = {"aaabaaddae", "aed"};
        System.out.println(MinWindowSubstring(strArr1)); // Output: "dae"

        String[] strArr2 = {"aabdccdbcacd", "aad"};
        System.out.println(MinWindowSubstring(strArr2)); // Output: "aabd"
    }
	public static String MinWindowSubstring(String [] strArr) {
		String N= strArr[0];
		String K= strArr[1];
		return K;
		
		
	}
	

}
