package com.java.string;

public class ContainsSubString {

	public static void main(String[] args) {

		System.out.println(isSubString("Apanupam","pamm"));
	}

	private static boolean isSubString(String parent, String child) {
		
		int i=0;
		int j=0;
		
		boolean substring=false;
		
		while(i<parent.length() && j<child.length()){
			if(parent.charAt(i)==child.charAt(j)){
				substring=true;
				i++;
				j++;
			} else{
				substring=false;
				j=0;
				i++;
			}
		}
		
		if(j<child.length())
			substring=false;
		
		return substring;
	}

}
