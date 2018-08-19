package com.java.dynamicprogramming;

/*Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? 
The order of coins doesn’t matter.

For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4. For N = 10 and S = {2, 5, 3, 6}, there are 
five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.*/

/*he only way to solve a DP problem is first by breaking it into a recursive problem and then transforming the recursive state into 
 * DP state.
 */


/*Coin change problem breakdown -

1.Checked the solution from recursive approach.
2.Overlapping problem exist.Therefore,will apply dynamic programming approach.
3.Take the combination array till the amount.Given amount here is 4 so we will take array which will store values possible with these given 
  coin till 4.We will also consider a base case of 0 when amount is 0.So total length of the array will be 5.Amount 0,1,2,3,4 will be covered.
4.Now As per the Approach we will make the state by referring to recursive algorithm.Amount will refer to a state.For every amount 
the given solution will be to include the coin(Here we will iterate the coin from coin array) in the solution and to not include the 
coin in the solution as per the recursive algorithm.
5.What is happening here is for every amount we are first building the solution with single coin.After that we are adding the other coin
which will add the solution in the previously computed solution from the previously iterated coin.

1 0 0 0 0 - Amount 0 - coin 1 - solution ( One solution i.e. no coin should be utilized .it will be the base case)
1 1 0 0 0 - Amount 1 - coin 1 - solution ({1}) 
1 1 1 0 0 - Amount 2 - coin 1 - solution ({1,1}) 
1 1 1 1 0 - Amount 3 - coin 1 - solution ({1,1,1})  
1 1 1 1 1 - Amount 4 - coin 1 - solution ({1,1,1,1})  
1 1 1 1 1 - Amount 0 - coin 2 - solution ( One solution i.e. no coin should be utilized .it will be the base case)
1 1 1 1 1 - Amount 1 - coin 2 - solution ( No solution as you can not form amount 1 with 2 denomination) 
1 1 2 1 1 - Amount 2 - coin 2 - solution ({2})   
1 1 2 2 1 - Amount 3 - coin 2 - solution ({1,2})   
1 1 2 2 3 - Amount 4 - coin 2 - solution ({1,1,2},{2,2})  
1 1 2 2 3 - Amount 0 - coin 3 - solution ( One solution i.e. no coin should be utilized .it will be the base case)  
1 1 2 2 3 - Amount 1 - coin 3 - solution ( No solution as you can not form amount 1 with 3 denomination)   
1 1 2 2 3 - Amount 2 - coin 3 - solution ( No solution as you can not form amount 2 with 3 denomination)   
1 1 2 3 3 - Amount 3 - coin 3 - solution ({3})   
1 1 2 3 4 - Amount 4 - coin 3 - solution ({1,3})   
4
*/

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
