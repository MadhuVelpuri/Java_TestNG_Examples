package tricks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringInString {

	public static void main(String[] args) {

		String main = "Cat atctaCatCat tta Cat";
		String subStr = "Cat";
		int count_subStr = subStrCount(main, subStr);
		System.out.println("No of Occurences of Cat in String : " + count_subStr);

	}

	private static int subStrCount(String main, String subStr) {

		int count = 0;

		Pattern p = Pattern.compile(subStr);

		Matcher m = p.matcher(main);
		while (m.find()) {
			count++;

		}
		return count;
	}

}
