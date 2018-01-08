package com.practice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapRead {


		public static void main(String a[]){
       
			HashMap<Integer, String> hm= new HashMap<Integer, String>();
			hm.put(1, "Madhu");
	hm.put(2, "Babu");
	hm.put(3, "Babu1");
	hm.put(2, "Babu");
	
Set<Integer> keys= hm.keySet();

/*for(int i=1;i<keys.size();i++)
{
	System.out.println(hm.get(keys));
	}*/
	
for(int key: keys){
    System.out.println("Value of "+key+" is: "+hm.get(key));
    if(key==2)
    {
    	System.out.println(hm.get(3));
    }
    	
}

			}
		} 