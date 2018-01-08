package tricks;

import java.util.HashMap;

public class char_Count_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Java is Java again and java is java";
		charCount(input);

	}

	public static void charCount(String input) {
		char inp[] = input.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (char c : inp) {
			if (hmap.containsKey(c))
				hmap.put(c, hmap.get(c) + 1);
			else
				hmap.put(c, 1);
		}

		System.out.println(hmap);
	}

}
