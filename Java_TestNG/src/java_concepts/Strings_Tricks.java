package java_concepts;

public class Strings_Tricks {

	public static void main(String[] args) {

		/*
		 * String s = "Madhu"; String s1 = "Madhu";
		 * 
		 * String ss = "Velpuri";
		 * 
		 * String s2 = new String("Madhu"); String s3 = new String("Madhu");
		 * 
		 * System.out.println(s = ss);
		 * 
		 * System.out.println(s == s1); System.out.println(s2 == s3);
		 * 
		 * System.out.println(s1.equals(s1)); System.out.println(s2.equals(s3));
		 * 
		 * System.out.println(s.charAt(0) < ss.charAt(0));
		 * 
		 * System.out.println(ss.substring(1, 3));
		 */

		String test = "a1b2c3";
		String[] tokens = test.split("\\d");
		for (String s : tokens)
			System.out.print(s);

	}

}
