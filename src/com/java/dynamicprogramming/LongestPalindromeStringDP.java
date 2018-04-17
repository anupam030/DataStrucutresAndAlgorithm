package com.java.dynamicprogramming;

public class LongestPalindromeStringDP {

	public static void main(String args[]) {
		logestStringPalindrome("level");
	}

	public static void logestStringPalindrome(String string) {

		char[] charArray = string.toCharArray();

		int maxStart = -1;
		int maxEnd = -1;
		int i = 0;
		int j = 0;

		boolean table[][] = new boolean[charArray.length - 1][charArray.length - 1];

		for (i = 0; i < charArray.length - 1; i++) {
			for (j = i; j < charArray.length - 1; j++) {
				if(i==j) {
					table[i][j] = true;
				} else if ((j==i+1) && (charArray[i]==charArray[j])) {
					table[i][j] = true;
				} else if ((i!=j) && (j!=i+1) && table[i+1][j-1] && charArray[i]==charArray[j]) {
					table[i][j] = true;
					if (maxStart != -1 && maxEnd != -1) {
						if ((j-i)>(maxEnd-maxStart) ) {
							maxStart = i;
							maxEnd = j;
						}
					} else {
						maxStart = i;
						maxEnd = j;
					}
				}
					
			}
		}
		
		if ((maxStart == -1 && maxEnd == -1)) {
			System.out.println("There is no palindrome in the given string");
		} else {
			System.out.println("The Longest given subString is :");
			for (int k = maxStart; k <= maxEnd; k++) {
				System.out.print(charArray[k]);
			}
		}
		
/*		for (i = 0; i < charArray.length - 1; i++) {
			for (j = charArray.length - 1; j >= 0; j--) {
				
		
			}
		}*/
	}

}
