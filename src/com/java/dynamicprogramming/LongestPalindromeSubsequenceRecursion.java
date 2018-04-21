package com.java.dynamicprogramming;

public class LongestPalindromeSubsequenceRecursion {

	public static void main(String args[]) {
		String palindrome="alevlbcgekkfg";
		System.out.println(
				LongestPalindromeRecursionString(palindrome.toCharArray(), 0, palindrome.length() - 1));
	}

	public static int LongestPalindromeRecursionString(char[] arr, int start, int end) {

		if (start > end)
			return 0;
		if (start == end) {
			return 1;
		}
		if (arr[start] == arr[end]) {
			return LongestPalindromeRecursionString(arr, start + 1, end - 1)+2;
		}

		return Math.max(LongestPalindromeRecursionString(arr, start + 1, end),
				LongestPalindromeRecursionString(arr, start, end - 1));

	}

}
