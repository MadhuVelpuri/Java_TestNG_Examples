package tricks;

public class CharCountInString {

	public int count;

	public CharCountInString() {

		count = 0;

	}

	public static void main(String[] args) {

		CharCountInString CCS = new CharCountInString();
		int countofChar = CCS.charCount("Madhu Babu Velpuri", 'u');
		System.out.println("Cout of character is : " + countofChar);

		int countloop = CCS.charCountwithoutLoop("Madhu Babu Velpuri", "u");
		System.out.println("Cout of character is : " + countloop);

	}

	public int charCount(String str, char c) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				count++;

		}
		return count;

	}

	public int charCountwithoutLoop(String str, String c) {

		count = str.length() - str.replaceAll(c, "").length();

		return count;

	}

}
