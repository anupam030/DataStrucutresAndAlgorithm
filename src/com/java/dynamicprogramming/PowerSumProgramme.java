package com.java.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PowerSumProgramme {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("X is ");
		int X=scanner.nextInt();
		System.out.print(" N is ");
		int N=scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();


		for(int i=1;i<=Math.pow(X, 1.0/N);i++) {
			list.add(i);
		}

		System.out.println("Number of ways are "+findpowerSum(list,X, N,0));
	}

	static Map<String,Integer> map = new HashMap<String,Integer>();
	// Complete the powerSum function below.
	static int findpowerSum(List<Integer> list,double X, double N,int index) {

		
		if(X==0) {
			return 1;
		}
		
		if(index>=list.size()) {
			return 0;
		}
		
		String key = X+"-"+index;
		
		if (map.containsKey(key)) 
			return map.get(key);
		
		int ways = findpowerSum(list, X, N, index+1) + findpowerSum(list,X-Math.pow(list.get(index),N),N,index+1);
		           //without using arr index           // with using arr index
		
		map.put(key, ways);
		return ways;
	}

}
