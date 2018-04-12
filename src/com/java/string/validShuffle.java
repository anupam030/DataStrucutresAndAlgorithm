package com.java.string;

import java.util.Arrays;

public class validShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(validShuffle("abc","def","dabecf"));

	}
	public static boolean validShuffle(String first, String second, String third){
		  boolean status=false;
		  if((first==null || second==null || third==null) || (first.isEmpty()|| second.isEmpty() || third.isEmpty())){
		    status = false;
		  } else if((first.length()+second.length()) !=third.length()){
		    //check if the sum of 2 lengths equals to the third string length
		    status = false;
		  } 
		    char [] c1_2=(first+second).toCharArray();
		    char [] c3 =third.toCharArray();
		    Arrays.sort(c1_2);
		    Arrays.sort(c3);
		    status=Arrays.equals(c1_2, c3);
		  return status;
		}
}
