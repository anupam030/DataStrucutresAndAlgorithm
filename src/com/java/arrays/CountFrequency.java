package com.java.arrays;

/*Count frequencies of all elements in array in O(1) extra space and O(n) time
Given an unsorted array of n integers which can contain integers from 1 to n. Some elements can
be repeated multiple times and some other elements can be absent from the array. Count frequency
of all elements that are present and print the missing elements.*/
/*Examples:

Input: arr[] = {2, 3, 3, 2, 5}
Output: Below are frequencies of all elements
        1 -> 0
        2 -> 2
        3 -> 2
        4 -> 0
        5 -> 1

Input: arr[] = {4, 4, 4, 4}
Output: Below are frequencies of all elements
        1 -> 0
        2 -> 0
        3 -> 0
        4 -> 4*/
public class CountFrequency {
	
	public static void main(String args[]) {
		int arr[] = {2, 3, 3, 2, 5};
		countFrequency(arr);
	}

	public static void countFrequency(int[] arr) {

		int i = 0;
		while (i < arr.length) {
			// already processed
			if (arr[i] <= 0) {
				i++;
				continue;
			}
			
			int elementindex = arr[i]-1;
			// element is not processed
			if(arr[elementindex]>0) {
				///store the lement in array
				arr[i]=arr[elementindex];
				// After storing arr[elementIndex], change it
                // to store initial count of 'arr[i]'
                arr[elementindex] = -1;
				
			} else{ // element has been seen again
				
				arr[elementindex]--;
				
				//initialize arr[i]=0 as means have not been seen sofar;
				arr[i]=0;
				i++;
			}
			
		}
		System.out.println("Below are counts of all elements");
        for (int j = 0; j < arr.length; j++)
            System.out.println(j+1 + "->" + Math.abs(arr[j]));
	}

}
