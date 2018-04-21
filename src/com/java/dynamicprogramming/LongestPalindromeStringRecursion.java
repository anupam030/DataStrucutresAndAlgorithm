package com.java.dynamicprogramming;

public class LongestPalindromeStringRecursion {
	
	public static void main(String args[]) {
		String palindrome="alevlbcgkg";
		System.out.println(
				longestPalindromeString(palindrome, 0, palindrome.length() - 1));
	}

	static boolean set = false;

	public static int longestPalindromeString(String palindrome,int start,int end) {
	
		if(start>end) 
			return 0;
		if(start==end)
			return 1;
		
		if(palindrome.charAt(start)==palindrome.charAt(end)) {
			set= true;
			int sum = longestPalindromeString(palindrome, start + 1, end - 1);
			if(set)
			return sum+2;
		}
		 set=false;
		return Math.max(longestPalindromeString(palindrome, start + 1, end),longestPalindromeString(palindrome, start, end-1));
	}
}