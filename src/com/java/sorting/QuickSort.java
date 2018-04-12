package com.java.sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] numbers={5,4,3,12,11,15,8,9};
		quickSort(numbers,0,numbers.length-1);

		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}
	}

	private static void quickSort(int[] arr,int start , int end) {
		// Get the pivot element from the middle of the list
		int mid = (start+(end-start)/2);

		int pivot = arr[mid];

		int i = start;
		int j = end;
		 // Divide into two lists
		while(i<=j){
			 // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
			while(arr[i]<pivot){
				i++;
			}
			// If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
			while(arr[j]>pivot){
				j--;
			}
			// If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j

			if(i<=j){
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		
		if (start < j)
			quickSort(arr,start, j);
		if (i < end)
			quickSort(arr,i, end);
	}
}
