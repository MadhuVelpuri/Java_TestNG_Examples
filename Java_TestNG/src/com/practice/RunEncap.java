package com.practice;


public class RunEncap{
       static int i=1;
	   public static void main(String args[]){
	      EncapTest encap = new EncapTest();
	      encap.setName("James");
	     // encap.setAge(20);
	      encap.setIdNum("12343ms");
	      
	      for(i=1;i<=4;i++)
	      {
	    	 encap.setAge(i);
	    	 System.out.println("Age: "+encap.getAge());
	      }

	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	    }
}	