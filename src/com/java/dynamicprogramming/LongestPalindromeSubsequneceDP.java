package com.java.dynamicprogramming;

public class LongestPalindromeSubsequneceDP {

	public static void main(String args[]) {
		String palindrome = "alevlbcgeksfg";
		System.out.println(longestPalindromeSubsequence(palindrome));
	}
	
	public static void printarrray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int longestPalindromeSubsequence(String palindrome) {
        
		int maxlength =0;
		int length = palindrome.length();
		int L[][] = new int[length][length];

		//storing result for length 1 string;
		for (int i=0;i<length;i++)
			L[i][i]=1;

		// Base case for string length 2
		for (int j = 0; j < length - 1; j++) {
			if (palindrome.charAt(j) == palindrome.charAt(j + 1)) {
				L[j][j + 1] = 2;
			} else 
				L[j][j + 1] = 1;
		}
		
		
		// Now we will fill values for remaining string till length n
		for (int k = 3; k <= length; k++) {
			// fix the starting index
			for (int i = 0; i < length - k + 1; i++) {
				int j = i + k - 1; // fixng the end index

				if (palindrome.charAt(i) == palindrome.charAt(j)) {
					L[i][j] = L[i + 1][j - 1]+2;
				} else 
					L[i][j] = Math.max(L[i + 1][j], L[i][j - 1]);
				
				if(L[i][j]>maxlength) 
					maxlength = L[i][j];
			}
		}
		
		printarrray(L);
		return L[0][length-1];

	}

}
