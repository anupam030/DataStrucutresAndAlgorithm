package com.java.dynamicprogramming;

import java.util.Scanner;

public class LongestCommonSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestCommonSubsequences lcs = new LongestCommonSubsequences();
		Scanner sc = new Scanner (System.in);
		
		/*char[] x= sc.next().toCharArray();
		char[] y= sc.next().toCharArray();*/
		
		String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	    
		char[] x= s1.toCharArray();
		char[] y= s2.toCharArray();
		
		System.out.println("The lcs of the given two strings is "+lcs.lcs(x,y,x.length,y.length));
		

	}
	
	
	private int lcs(char[] x, char [] y,int m,int n) {
		
		if ((m==0) || (n==0)){
			return 0;
		}
		
		if (x[m-1]==y[n-1])
			return 1 + lcs (x,y,m-1,n-1);
		else
			return  max (lcs(x,y,m,n-1),lcs(x,y,m-1,n));
	}
	
	private  int max(int a ,int b){
		return (a>b)?a:b;
	}

}
