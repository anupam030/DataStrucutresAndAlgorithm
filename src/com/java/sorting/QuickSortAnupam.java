package com.java.sorting;

import java.util.Arrays;

public class QuickSortAnupam {
	
	public static void main(String args[]) {
		int arr[] = {10,5,8,23,2,4,56,90,3,21,44,0,-6};
		
		
		
		Arrays.stream(quickSort(arr,0,arr.length-1)).forEach(t->System.out.print(t+" "));
	}

	public static int[] quickSort(int[] arr,int start,int end) {
		if(start<end) {
		
		int mid = start+(end-start)/2;
		int pivot = arr[mid];
		
		int i = start;
		int j = end;
		
		while(i<mid && j> mid) {
		    if(arr[i]<=pivot) {
		    	i++;
		    	continue;
		    	
		    }
		    
		    if(arr[j]>=pivot) {
		    	j--;
		    	continue;
		    }
		    swap(arr,i,j);
		}
		
		while(i<mid){
			if(arr[i]>pivot){
				swap(arr,i,mid);
				pivot = arr[mid];
			}
			i++;
		}

		while(j>mid){
			if(arr[j]<pivot){
				swap(arr,j,mid);
				pivot = arr[mid];
			}
			j--;
		}
	
	    quickSort(arr,start,mid);
		quickSort(arr,mid+1,end);
		}
		
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]= temp;		
	}
}
