package com.java.dynamicprogramming;

/*There are n stairs, a person standing at the bottom wants to reach the top. 
The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.*/

/*Input: n = 1
Output: 1
There is only one way to climb 1 stair

Input: n = 2
Output: 2
There are two ways: (1, 1) and (2)

Input: n = 4
Output: 5
(1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)*/

/*n can be genralized as well*/
public class ClimbStairsProblem {
	
	public static void main(String arg[]){
		
		System.out.println(countWays(4,1));
		
	}
	// Java program to count number of ways to reach S't stair when
	// a person can climb 1, 2, ..m stairs at a time

	public static int countWays(int S,int m) {
	 
		int combination[] = new int[S+1];
		
		combination[0] = 1;combination[1] = 1;
		
		for(int i =1 ;i<=m;i++) {
			for(int j=2;j>=i && j<=i;j++) {
				combination[j]+=combination[j-i];
			}
		}
		return combination[S];
	}
   

}
