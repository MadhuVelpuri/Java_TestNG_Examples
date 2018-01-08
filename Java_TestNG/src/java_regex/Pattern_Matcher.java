package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_Matcher {

	public static void main(String args[]) {
		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

		String candidateString = "Java. java JAVA jAVA";

		Matcher matcher = p.matcher(candidateString);

		// display the earlier match
		System.out.println(candidateString);
		matcher.find(6);
		System.out.println(matcher.group());

		matcher.find(11);
		System.out.println(matcher.group());

	}

}
