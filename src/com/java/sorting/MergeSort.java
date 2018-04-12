package com.java.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,5,8,23,2,4,56,90,3,21,44,0,-6};
		
		int[] SortedArray=mergesort(arr);
		
		for(int i=0;i<SortedArray.length;i++){
			System.out.print(SortedArray[i]+" ");
		}
	

	}
	
	
	private static int[] mergesort(int[] arr){
		if(arr.length<=1){
			return arr;
		}
		
		int	mid=(arr.length)/2;

		
		int[] leftArray=new int[mid];
		for(int i=0;i<mid;i++){
			leftArray[i]=arr[i];
		}

		int[] rightArray=new int [arr.length-mid];
		int k=0;
		for(int j=mid;j<arr.length;j++){
			rightArray[k]=arr[j];
			k++;
		}

		int[] leftArraySorted=mergesort(leftArray);
		int[] rightArraySorted=mergesort(rightArray);
		
		int[] SortedArray=merge(leftArraySorted,rightArraySorted);

		return SortedArray;
	}


	private static int[] merge(int[] leftArray, int[] rightArray) {

		int[] tempArray=new int[leftArray.length+rightArray.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while(i<leftArray.length && j<rightArray.length) {
			if(leftArray[i]<=rightArray[j]){
				tempArray[k]=leftArray[i];
				i++;
			} else {
				tempArray[k]=rightArray[j];
				j++;
			}
			k++;
		}
        
		if(i<leftArray.length){
			while(i<leftArray.length){
				tempArray[k]=leftArray[i];
				i++;
				k++;
			}
		}
		if(j<rightArray.length){
			while(j<rightArray.length){
				tempArray[k]=rightArray[j];
				j++;
				k++;
			}
		}
		
		return tempArray;                       
	}

	     
	     
	}

 




