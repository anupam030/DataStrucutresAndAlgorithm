package com.java.arrays;

import java.util.Arrays;

/*You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once.

Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] */
public class Seggeregate0and1inArray {

	// driver function
	public static void main(String[] args) {
		int arr[] = new int[] { 0, 1, 0, 1, 1, 1 };
		print(arr);
		System.out.println();
		//segregate0and1(arr);
		segeregate0and1index(arr);
		print(arr);

	}

	private static void print(int[] arr) {
		Arrays.stream(arr).forEach(i -> System.out.print(i + ","));
	}

	// takes 2 passes while traversing
	private static void segregate0and1(int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (i == 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			arr[i] = 0;
		}
		for (int i = count; i < arr.length; i++) {
			arr[i] = 1;
		}
	}

	// takes single traversal
	private static int[] segeregate0and1index(int[] arr) {
		int leftindex = 0;
		int rightindex = arr.length - 1;

        while(leftindex<rightindex) {
        	
        	while(arr[leftindex]==0 && leftindex<rightindex)
        		leftindex++;
        	while(arr[rightindex]==1 && leftindex<rightindex)
        		rightindex--;

            if(arr[leftindex]>arr[rightindex]) {
            	int temp= arr[leftindex];
            	arr[leftindex]=arr[rightindex];
            	arr[rightindex]=temp;
            	leftindex++;
            	rightindex--;
            }
        }
		return arr;
	}

}
