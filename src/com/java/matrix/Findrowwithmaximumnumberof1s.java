package com.java.matrices;

public class Findrowwithmaximumnumberof1s {

	// Function that returns index of row
	// with maximum number of 1s.
	static int rowWithMax1s(int mat[][]) {
		// Initialize max values
		int max_row_index = 0, max = -1;
		// Traverse for each row and count number of
		// 1s by finding the index of first 1
		int i, index;
		for (i = 0; i < mat.length; i++) {
			int C = mat[i].length;
			index = findmaximumindex(mat[i], 0, C - 1);

			if (index != -1 && C - index > max) {
				max = C - index;
				max_row_index = i;
			}
		}

		return max_row_index;
	}

	static int findmaximumindex(int[] arr, int low, int high) {

		while (low <= high) {
			int mid = low + (high - low) / 2;
			// Check if the element at middle index is first 1
			if ((mid == 0 || (arr[mid - 1] == 0)) && arr[mid] == 1)
				return mid;
			else if (arr[mid] == 0)
				low = mid + 1;
			else
				high = high - 1;
		}
		return -1;
	}
	
	 // Driver Code
    public static void main(String[] args)
    {
        int mat[][] = { { 0, 0, 0, 1 },
                        { 0, 1, 1, 1 },
                        { 1, 1, 1, 1 },
                        { 0, 0, 0, 0 } };
        System.out.println("Index of row with maximum 1s is "
                                            + rowWithMax1s(mat));
    }
}
