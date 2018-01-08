package java_regex;

import java.util.regex.Pattern;

public class Qunatifier {

	public static void quantifier() {
		String regex = "Mu{6,10}";
		String value = "Muuuuuuu";
		Pattern pattern = Pattern.compile(regex);
		boolean mat = pattern.matches(regex, value);
		System.out.println("Result is : " + mat);

	}

	public static void main(String a[]) {
		Qunatifier.quantifier();
	}

}
