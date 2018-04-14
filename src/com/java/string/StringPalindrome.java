package com.java.string;

public class StringPalindrome {

	public static void main(String args[]) {
   
		System.out.println("String is palindrome: "+palindrome("abcdcba"));
		System.out.println("String is palindrome: "+palindrome("Anupam"));
	}

	public static boolean palindrome(String string) {

		char[] array = string.toCharArray();
		boolean palindrome = false;

		int leftindex = 0;
		int rightindex = array.length - 1;

		while (leftindex < rightindex) {
			if (array[leftindex] == array[rightindex])
				palindrome = true;
			else
				palindrome = false;
              leftindex++;
              rightindex--;
		}
		return palindrome;
	}
}
