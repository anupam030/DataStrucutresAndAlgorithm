package com.java.matrix;

public class MatrixSpiralForm {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3,4 }, 
				      { 4, 5, 6,5 }, 
				      { 7, 8, 9,6 }, 
				      { 10, 11, 12,7 },
				      { 13, 14, 15,16 } }; // sample
																				// 4x3
																				// matrix
		printMatrixSpiralform(a);

	}

	public static void printMatrixSpiralform(int[][] mat) {

		int startrowlength = 0;
		int startcolumnlength=0;
		int rowLength = mat.length;
		int columnLength = mat[0].length;
		int count = rowLength * columnLength;


		int i = 0;
		int j = 0;
		int k = 0;

		while (k <count) {
			while (j < columnLength - 1) {
				if (mat[i][j] == -1) {
					i++;
					j++;
					continue;
				}
				System.out.print(mat[i][j] + " ");
				mat[i][j] = -1;
				j++;
				k++;
			}

			while (i < rowLength - 1) {
				System.out.print(mat[i][j] + " ");
				mat[i][j] = -1;
				i++;
				k++;
			}
			
			columnLength--;
			rowLength--;

			while (j > startcolumnlength) {
				System.out.print(mat[i][j] + " ");
				mat[i][j] = -1;
				j--;
				k++;
			}

			while (i > startrowlength) {
				System.out.print(mat[i][j] + " ");
				mat[i][j] = -1;
				i--;
				k++;
			}
			startrowlength++;
			startcolumnlength++;
		}
	}

}
