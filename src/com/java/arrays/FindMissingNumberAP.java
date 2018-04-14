package com.java.arrays;

public class FindMissingNumberAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 4, 8, 10, 12, 14};
		System.out.println("The missing element is "+find(arr));

	}
	
	private static int find(int[] arr) {
		 // If exactly one element is missing, then we can find
	    // difference of arithmetic progression using following
	    // formula.  Example, 2, 4, 6, 10, diff = (10-2)/4 = 2.
	    // The assumption in formula is that the difference is
	    // an integer.
	    int diff = (arr[arr.length-1] - arr[0])/arr.length;
		return findmissing(arr, 0, arr.length-1, diff);
	}

	public  static int findmissing(int[] arr,int low,int high,int diff) {

		if(high<low) {
			return 0;
		}
		
		int mid =low+(high - low)/2;
		
		if(arr[mid+1]!=(arr[mid]+diff))
			return (arr[mid]+diff);
		if(arr[mid-1]!=(arr[mid]-diff))
			return (arr[mid]-diff);
		
		if(arr[mid]==diff*mid) 
			return findmissing(arr, mid+1, high, diff);
		return findmissing(arr, low, mid-1, diff);
		
	}

}
