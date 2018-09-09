package com.java.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*Given and integer x and n 
Find the number of ways they can be represented as  
x = c1^n+c2^n+c3^n+.......+cp^n
where c = {c1,c2,...,cn} are set of unique natural numbers 
Find the number of ways that a given integer, X, can be expressed as the sum of the Nth powers of unique natural numbers.
Repetitions or negative numbers are not alllowed.
For example , if X=13 and N=2 we have to find all combinations of unique squares ading up to 13.he only solution is 2^2+3^2.
X=100,N=2 
100=10^2
100=6^2+8^2
100=1^2+3^2+4^2+5^2+7^2
Total three ways possible
Solution -
Since we need to make powers in n so the number range will always be stituated till nthroot of x.
the solution lies between {1,nthroot of 2,3,...,nthroot of x}.if nth root of x is not a natural number then solution
will lie between {1,.....,to the nth root of uniuque natural number which is nearest to the nth root of x value}
Here n is 2 and x is 100.
so here there the solution will lie bwtween {1,2,3,...,root of 100} which will be {1,2...,10}.
Lets look at another example where x is 10.Here the solution will lie between 
{1 ,2 ,to the nth root of uniuque natural number which is nearest to the root of 10} which will be {1,2,3}
so we can create a function for second case like findpowsum({1,2,3},10).
we have two possible case either include 1 or not include 1 so it will be -
                                                    findpowsum({1,2,3},10)
                                                    
                                          0                               included 1 (solution will be 1^2)
                                      findpowsum({2,3},10)              findpowsum({2,3},9)
                                      
                                                                   0                      included 2 (solution will be 2^2)
                                                           findpowsum({3},9)              findpowsum({3},5)
                                                              
                                                               included 3(solution will be 3^2)
                                                               findpowsum({0},0)
                                                               so the solution will be (1^2+3^2)
                                                               
                                                               
this is recursive algorithms sop there are lots of excess calculations. if we draw the tree for X=100 case then we will be able to find
many cases overlapping.   */                                                       
                                      
public class PowerSumProgramme {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("X is ");
		int X=scanner.nextInt();
		System.out.print(" N is ");
		int N=scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();


		for(int i=1;i<=Math.pow(X, 1.0/N);i++) {//in list we will pass tunique natural number till nth root of x
			list.add(i);
		}

		System.out.println("Number of ways are "+findpowerSum(list,X, N,0));
	}

	static Map<String,Integer> map = new HashMap<String,Integer>(); // In the hashmap we will store the precomputes solution for the given amount
	                                                                // and given index.index will denote the subarray for which solution is already computed before. 
	// Complete the powerSum function below.
	static int findpowerSum(List<Integer> list,double X, double N,int index) {

		
		if(X==0) { // case where the x becomes 0 it means we reached the solutiona and return 1
			return 1;
		}
		
		if(index>=list.size()) {
			return 0;
		}
		
		String key = X+"-"+index; // here we will make thkey for storing the solution by giving the maount and adding index as key
		
		if (map.containsKey(key)) 
			return map.get(key);
		
		int ways = findpowerSum(list, X, N, index+1) + findpowerSum(list,X-Math.pow(list.get(index),N),N,index+1);
		           //without using arr index           // with using arr index
		
		map.put(key, ways); // here we will store the ways
		return ways;
	}

}
