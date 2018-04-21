package com.java.dynamicprogramming;

public class LongestPalindromeStringDP {

	public static void main(String args[]) {
		logestStringPalindrome("alevelkzfdjklfzlf");
	}

	public static void logestStringPalindrome(String string) {

		int maxStart = -1;
		int maxEnd = -1;
		// Bottom up
		int length = string.length();
		boolean L[][] = new boolean[length][length];

		// Base case for string length 1
		for (int i = 0; i < length; i++)
			L[i][i] = true;

		// Base case for string length 2
		for (int j = 0; j < length - 1; j++) {
			if (string.charAt(j) == string.charAt(j + 1)) {
				L[j][j + 1] = true;
			}
		}

		// Now we will fill values for remaining string till length n
		for (int k = 3; k <= length; k++) {
			// fix the starting index
			for (int i = 0; i < length - k + 1; i++) {
				
				int j = i + k - 1; // fixng the end index

				if (string.charAt(i) == string.charAt(j) && L[i + 1][j - 1]) {
					L[i][j] = true;
					if (maxStart != -1 && maxEnd != -1) {
						if ((j - i) > (maxEnd - maxStart)) {
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
				System.out.print(string.substring(maxStart, maxEnd+1));
		}
	}
}
