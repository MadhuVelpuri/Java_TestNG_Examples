package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Digit_SubPattern {

	public static void main(String[] args) {
		// A group of 3 digits followed by 7 digits.
		String regex = "\\b(\\d{4})\\d{6}";

		// Compile the regular expression
		Pattern p = Pattern.compile(regex);

		String source = "9876543210";

		// Get the Matcher object
		Matcher m = p.matcher(source);

		// Start matching and display the found area codes
		while (m.find()) {
			String phone = m.group();
			String areaCode = m.group(1);
			System.out.println("Phone: " + phone + ", Area  Code:  " + areaCode);
		}
	}

}
