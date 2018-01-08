package com.pratice;

public class Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 String str = "1500 miles+$123";
		  String[] temp;
		 String miles="NA";
		  /* delimiter */
		  String delimiter = "miles";
		  /* given string will be split by the argument delimiter provided. */
		  temp = str.split(delimiter);
		  /* print substrings */
		  
		  
		  miles=temp[0]+"miles";
		  String taxes = temp[1];
		  String tax=taxes.substring(1,taxes.length());
		  
		  System.out.println(miles);
		  System.out.println(tax);
		

	}

}
