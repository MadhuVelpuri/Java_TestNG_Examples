package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find_Start_End {

	public static void main(String[] args) {
		String regex = "[^a-z]@.";
		Pattern p = Pattern.compile(regex);
		String str = "abc@yahoo.com,123@cnn.com,abc@google.com";
		Matcher m = p.matcher(str);

		if (m.find()) {
			String foundStr = str.substring(m.start(), m.end());
			System.out.println("Found string  is:" + foundStr);
			System.out.println("Matched  Text:" + m.group() + ", Start:" + m.start() + ", " + "End:" + m.end());
		}

	}

}
