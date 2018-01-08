package tricks;

public class StringCompare {

	public static void main(String[] args) {

		String s = "Madhu";
		String s2 = "Madhu";
		String s3 = new String("madhu");
		String s4 = new String("madhu");

		System.out.println(s == s2);
		System.out.println(s3 == s4);

		System.out.println(s.equals(s2));
		System.out.println(s3.equals(s4));

		/*
		 * String s1 = new String("Madhu");
		 * 
		 * System.out.println(s.equals(s1)); System.out.println(s == s1);
		 * 
		 * String s3 = "Madhu"; String s4 = "abc"; s4 = s4 + "madhu";
		 * System.out.println(s4); System.out.println(s3.compareTo(s4));
		 */
	}

}
