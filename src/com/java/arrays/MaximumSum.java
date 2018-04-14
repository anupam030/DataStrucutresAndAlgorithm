package com.java.arrays;

public class MaximumSum {
	/*Function to return max sum such that no two elements
    are adjacent */
  int FindMaxSum(int arr[])
  {
	  int incl = arr[0];
	  int excl = 0;
	  int excl_new;
	  
	  for(int i =1;i<arr.length;i++) {
		 excl_new=Math.max(incl, excl);
		 incl= incl+arr[i];
		 excl = excl_new;
	  }
	  
	  return excl_new=Math.max(incl, excl);
  }
}
