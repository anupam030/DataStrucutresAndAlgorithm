package com.java.arrays;

public class MinumumDistance {
	
	 /* Driver program to test above functions */
    public static void main(String[] args) {
        MinumumDistance min = new MinumumDistance();
        int arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int n = arr.length;
        int x = 3;
        int y = 6;
 
        System.out.println("Minimum distance between " + x + " and " + y
                + " is " + min.minDist(arr, n, x, y));
    }

	int minDist(int arr[], int n, int x, int y) 
    {
		int mindist=0;
		int prev= 0;
		int i=0;
		
		for(i=0;i<n;i++) {
			if(arr[i]==x||arr[i]==y) {
				prev=i;
				break;
			}
		}
		
		for(;i<n;i++) {
			if (arr[i]==x||arr[i]==y) {
			if((arr[i]!=prev) && (i-prev)>mindist){
				mindist = i-prev;
				prev=i;
			} else {
				prev=i;
			}
			}
		}
		return mindist;
				
    }

}
