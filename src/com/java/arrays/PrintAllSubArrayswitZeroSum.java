package com.java.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrintAllSubArrayswitZeroSum {

	public static void main(String args[]) {

		int arr[] = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		/* int arr[] = {1, 4, -2, -2, 5, -4, 3}; */
		/* int arr[] = {-3, 2, 3, 1, 6}; */

		printAllSubArrayWithZeroSum(arr);
	}

	public static void printAllSubArrayWithZeroSum(int[] arr) {
		HashMap<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

			if (arr[i] == 0) {
				printResult(i,i);
			}

			if (sum == 0) {
				printResult(0,i);
			}

			if (hashMap.containsKey(sum)) {
				List<Integer> indexList = hashMap.get(sum);
				for (int j  : indexList) {
					printResult(j+1,i);
				}
				
				indexList.add(i);
				hashMap.put(sum, indexList);
			} else {
				List<Integer> indexList = new ArrayList<Integer>();
				indexList.add(i);
				hashMap.put(sum, indexList);
			}
		}
		
		

	}

	public static void printResult(int key ,int value ) {
		
		System.out.println("subArray exist from " + key + " to " +value);

		

	}
}
