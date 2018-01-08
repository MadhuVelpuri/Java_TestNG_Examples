package com.pratice;

public class String_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java String to String Array Example";
		String_Array strObj= new String_Array();
		strObj.strToArray(str);
		//strObj.strToChararray(str);
		
		
	}
	
		public void strToChararray(String str)
		{
		   
		    char[] stringArray;
		   
		    //convert string into array using toCharArray() method of string class
		    stringArray = str.toCharArray();
		   
		    //display the array
		    System.out.println("String converted to Character Array");
		    for(int index=0; index < stringArray.length; index++)
		      System.out.print(stringArray[index]+"\n");
		
		}
		
		
public void strToArray(String str)
{

       String strArray[] = str.split(" ");
      
       System.out.println("String converted to String array");
      
       //print elements of String array
       for(int i=0; i < strArray.length; i++){
               System.out.println(strArray[i]+"\n");
       }
}

			  	 
			

	}