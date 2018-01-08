package com.pratice;

import java.util.Map;

public class EnvDemo {

	public static void main(String[] args) {

		      //getting username using System.getProperty in Java
		       String user = System.getProperty("user.name") ;
		       System.out.println("Username using system property: "  + user);
		    
		     //getting username as environment variable in java, only works in windows
		       String userWindows = System.getenv("USERNAME");
		       System.out.println("Username using environment variable in windows : "  + userWindows);
		    
		      
		     //name and value of all environment variable in Java  program
		      Map<String, String> env = System.getenv();
		        for (String envName : env.keySet()) {
		            System.out.format("%s=%s%n", envName, env.get(envName));
		        }

//		Read more: http://javarevisited.blogspot.com/2012/08/how-to-get-environment-variables-in.html#ixzz3ejrwyqTg
	}

}
