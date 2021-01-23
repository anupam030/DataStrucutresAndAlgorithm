package com.java.arrays;

public class MaximumSum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 4,6, 8, 10, 12, 14};
		System.out.println("The mximum sum with no adjaacent   element is "+ FindMaxSum(arr));

	}
	
	static /*Function to return max sum such that no two elements
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
		 System.out.println("Elements are as follows -incl :"+incl+" excl :"+excl+"excl_new :"+excl_new);
	  }
	  
	  return excl_new=Math.max(incl, excl);
  }
}
