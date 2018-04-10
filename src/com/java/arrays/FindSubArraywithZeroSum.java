package com.java.arrays;

import java.util.HashSet;

public class FindSubArraywithZeroSum {
	
	public static void main(String args[]) {
		
		
		
		 int arr[] = {1, 4, -2, -2, 5, -4, 3};
		
	      /*int arr[] = {-3, 2, 3, 1, 6};*/
		
	       if (subArrayExist(arr))
	            System.out.println("Found a subarray with 0 sum");
	        else
	            System.out.println("No Such Sub Array Exists!");
		
	}

	
	public static boolean subArrayExist(int[] arr){
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		int sum = 0;
		for (int i =0; i <arr.length;i++) {
			sum= sum+arr[i];
			
			if (arr[i]==0 || sum==0 || hashset.contains(sum)) {
				return true;
			}
			
			hashset.add(sum);
		}
		return false;
	}
}
