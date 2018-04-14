package com.java.arrays;

import java.util.Arrays;

public class ZigzagArray {

	public static void main(String args[]) {
		int arr[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };
		zigzag(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void zigzag(int[] arr) {

		// Flag true indicates relation "<" is expected,
		// else ">" is expected. The first expected relation
		// is "<"
		boolean flag = true;

		for (int i = 0; i < arr.length - 2; i++) {
			if (flag) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} else {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			flag = !flag;
		}
	}
}
