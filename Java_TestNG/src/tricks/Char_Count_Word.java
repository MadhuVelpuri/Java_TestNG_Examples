package tricks;

//Counting occurrence of character in a string without using any loop.
public class Char_Count_Word {

	public static void main(String a[]) {
		String input = "My name is Madhu Babu Velpuri";
		char c = 'a';
		int a_count = input.length() - (input.replace("a", "")).length();
		System.out.println("Character 'a' Count in " + input + " is: " + a_count);
		/*
		 * String s = ""; System.out.println(s.length());
		 */
	}

}
