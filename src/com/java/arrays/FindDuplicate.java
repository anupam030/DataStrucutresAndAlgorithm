package com.java.arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public void printrepeating(int[] arr) { 
	        System.out.println("The repeating elements are : ");
	        
	        for(int i=0;i<arr.length;i++){
	        	if(arr[Math.abs(arr[i])]>=0)
	        		arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
	        	else
	        		System.out.print(Math.abs(arr[i]) + " ");
	        }
	}
}
