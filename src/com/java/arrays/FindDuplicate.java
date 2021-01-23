package com.java.arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 3, 2, 5,6,6};
		printrepeating(arr);
	}

	
	public static void printrepeating(int[] arr) { 
	        System.out.println("The repeating elements are : ");
	        
	        for(int i=0;i<arr.length;i++){
	        	System.out.print(arr[Math.abs(arr[i])]+"s ");
	        	if(arr[Math.abs(arr[i])]>=0)
	        		arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
	        	else
	        		System.out.print(Math.abs(arr[i]) + " ");
	        }
	}
}
