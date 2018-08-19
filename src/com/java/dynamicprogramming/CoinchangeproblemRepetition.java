package com.java.dynamicprogramming;

/*1) Optimal Substructure
To count the total number of solutions, we can divide all set solutions into two sets.
1) Solutions that do not contain mth coin (or Sm).
2) Solutions that contain at least one Sm.
Let count(S[], m, n) be the function to count the number of solutions, then it can be written as sum of count(S[], m-1, n) and 
count(S[], m, n-Sm).

Therefore, the problem has optimal substructure property as the problem can be solved using solutions to subproblems.*/


public class CoinchangeproblemRepetition {

	static int dp[] = new int[100];
	public static void main(String args[]) {
		for (int i:dp) {
			dp[i]=-1;
		}
		System.out.println(Change(4, new int[] { 1,2,3 },3));
	}

	public static int Change(int amount, int[] arr,int m) {

		 // base case
		  if (amount < 0)  
		      return 0;
		  if (amount == 0)  
		      return 1;
		 

		    // If there are no coins and amount 
		    // is greater than 0, then no
		    // solution exist
		    if (m <=0 && amount >= 1)
		        return 0;
		 
		  // storing the result and returning
            return Change(amount,arr,m-1)+Change(amount-arr[m-1],arr,m);	
	}
}
