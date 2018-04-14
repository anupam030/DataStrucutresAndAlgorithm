package com.java.arrays;

public class ExcelColumnTitle {	
	  // Driver program to test above function
    public static void main(String[] args)
    {
        printString(26);
        printString(51);
        printString(52);
        printString(80);
        printString(676);
        printString(702);
        printString(705);
    }
	public static void printString(int ColumnNumber) {
		//columnname
		StringBuilder columnname = new StringBuilder();
		
		while (ColumnNumber>0) {
			
			int rem = ColumnNumber%26;
			
			if(rem==0){
				columnname.append("Z");
				ColumnNumber = (ColumnNumber/26)-1;
			} else {
				columnname.append((char)((rem-1)+'A'));
				ColumnNumber = ColumnNumber / 26;
			}
		}
		
		// Reverse the string and print result
        System.out.println(columnname.reverse());
	}
}
