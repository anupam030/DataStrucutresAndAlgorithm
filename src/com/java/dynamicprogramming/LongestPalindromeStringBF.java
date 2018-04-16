package com.java.dynamicprogramming;

public class LongestPalindromeStringBF {

	public static void main(String args[]) {
		longestPalindromeString("alevelbcgeeksfskeeg");
	}

	public static void longestPalindromeString(String string) {

		char[] charArray = string.toCharArray();

		int start = -1;
		int end = -1;
		int maxStart = -1;
		int maxEnd = -1;
		for (int i = 0; i < charArray.length - 1; i++) {
			for (int j = charArray.length - 1; j >= 0; j--) {
				start = i;
				end = j;

				while (start <= end) {
					if ((charArray[start] == charArray[end])) {
						if ((start == end) || (start == end + 1)) {
							break;
						} else {
							start++;
							end--;
						}
					} else {
						start = -1;
						end = -1;
						break;
					}
				}

				if (start != -1 && end != -1) {
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
	}
}
