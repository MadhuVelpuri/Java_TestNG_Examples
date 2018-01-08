package com.pratice;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class RemovedupsList {

	
	
		  public static <T> void removeDuplicate(List <T> list) {
		    HashSet <T> h = new HashSet<T>(list);// Covnverting List to HashSet
		    
		    list.clear();
		    list.addAll(h);
		  }

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    ArrayList<String> list = new ArrayList<String>();
		    list.add("Bart");
		    list.add("Lisa");
		    list.add("Marge");
		    list.add("Marge");
		    list.add("Barney");
		    list.add("Homer");
		    list.add("Maggie");
		    System.out.println(list);
		    // output : [Bart, Lisa, Marge, Marge, Barney, Homer, Maggie]
		    RemovedupsList.removeDuplicate(list);
		    System.out.println(list);
		    // output : [Bart, Lisa, Maggie, Homer, Barney, Marge]
		  
		

	}

}
