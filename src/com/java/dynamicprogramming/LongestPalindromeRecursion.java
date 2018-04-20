package com.java.dynamicprogramming;

public class LongestPalindromeRecursion {

	public static void main(String args[]) {
		System.out.println(
				LongestPalindromeRecursionString("alevlbcgeksfg".toCharArray(), 0, "alevlbcgeksfg".length() - 1));
	}

	public static int LongestPalindromeRecursionString(char[] arr, int start, int end) {

		if (start > end)
			return 0;
		if (start == end) {
			return 1;
		}
		if (arr[start] == arr[end]) {
			return 2 + LongestPalindromeRecursionString(arr, start + 1, end - 1);
		}

		return Math.max(LongestPalindromeRecursionString(arr, start + 1, end),
				LongestPalindromeRecursionString(arr, start, end - 1));

	}

}
