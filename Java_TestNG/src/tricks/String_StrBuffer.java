package tricks;

public class String_StrBuffer {

	public static void main(String a[]) {
		String s1 = "madhu";
		String s2 = s1;
		String s4 = new String("MADHU");
		String s6 = new String("MADHU");

		s1 = s1 + "d";
		System.out.println(s1 + " " + s2 + " " + (s1 == s2));
		System.out.println(s1.equals(s2));

		System.out.println("S4 and s6: " + s4 + s1); // res? - false
														// because of case
														// sensitive

		StringBuffer s3 = new StringBuffer("abc");// s3 object will be redefined
		// after appending d
		StringBuffer s5 = s3;
		s3.append("d");
		System.out.println(s3 + " " + s5 + " " + (s3 == s5));

	}
}
