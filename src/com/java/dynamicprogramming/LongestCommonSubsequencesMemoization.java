package com.java.dynamicprogramming;

import java.util.Scanner;

public class LongestCommonSubsequencesMemoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestCommonSubsequencesMemoization lcs = new LongestCommonSubsequencesMemoization();
		/*		Scanner sc = new Scanner (System.in);

		char[] x= sc.next().toCharArray();
		char[] y= sc.next().toCharArray();*/

		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";

		char[] x= s1.toCharArray();
		char[] y= s2.toCharArray();

		System.out.println("The lcs of the given two strings is "+lcs.lcs(x,y,x.length,y.length));


	}


	private int lcs(char[] x, char [] y,int m,int n) {
		int L[][] = new int[m+1][n+1];
		for (int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if ((i==0) || (j==0))
					L[i][j]=0;
				else if(x[i-1]==y[j-1])
					L[i][j] = L[i-1][j-1] + 1;
				else
					L[i][j] = max(L[i-1][j], L[i][j-1]);
			}
		}
		return L[m][n];
	}

	private  int max(int a ,int b){
		return (a>b)?a:b;
	}

}
