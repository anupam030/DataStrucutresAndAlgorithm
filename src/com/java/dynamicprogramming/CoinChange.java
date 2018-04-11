package com.java.dynamicprogramming;

/*Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? 
The order of coins doesn’t matter.

For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4. For N = 10 and S = {2, 5, 3, 6}, there are 
five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.*/

public class CoinChange {

	public static void main(String args[]) {
		System.out.println(Change(4, new int[] { 1,2,3 }));
	}

	public static int Change(int amount, int[] arr) {
		int combination[] = new int[amount + 1];
		combination[0] = 1;
		for (int coin : arr) {
			for (int currentamount = 0; currentamount < combination.length; currentamount++) {
				if (currentamount >= coin)
					combination[currentamount] += combination[currentamount - coin];
				printAmount(combination);
			}		
		}
		return combination[amount];
	}
	
	public static void printAmount(int [] arr){
		for(int i =0 ; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
