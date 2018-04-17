package com.java.dynamicprogramming;

public class LongestPalindromeStringDP {

	public static void main(String args[]) {

	}

	public void logestStringPalindrome(String string) {

		char[] charArray = string.toCharArray();

		int start = -1;
		int end = -1;
		int maxStart = -1;
		int maxEnd = -1;
		int i = 0;
		int j = 0;

		boolean table[][] = new boolean[charArray.length - 1][charArray.length - 1];

		for (i = 0; i < charArray.length - 1; i++)
			for (j = 0; j < charArray.length - 1; j++) {
				if(i==j) {
					table[i][j] = true;
				}
				
				if ((j==i+1) && (charArray[i]==charArray[j])) {
					table[i][j] = true;
				}
					
			}
		
		for (i = 0; i < charArray.length - 1; i++) {
			for (j = charArray.length - 1; j >= 0; j--) {
				
				if ((i!=j) && (j!=i+1) && table[i-1][j-1] &&charArray[i]==charArray[j]) {
					table[i][j] = true;
				}
			}
		}
	}

}
