package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Digit_match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("\\d");

		// Java 2 s == Java \\d s - Pass
		// Java2s = Java\\d - fail

		String candidate = "143";
		Matcher m = p.matcher(candidate);

		if (m != null)
			System.out.println("Regex Matching Result is : " + m.find());

	}

}
