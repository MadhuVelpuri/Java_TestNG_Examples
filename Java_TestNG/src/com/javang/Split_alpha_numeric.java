package com.javang;

public class Split_alpha_numeric {
	static int num = 0;

	public static void main(String[] args) {
		String s1 = "456Ma2dh2u231";
		String s = s1.replaceAll("[^0-9]", "");
		System.out.println("String after removing characters : " + s + "\n");
		String schar = s1.replaceAll("[^a-zA-Z]", "");
		System.out.println("String after removing numbers is : " + schar + "\n");

		String[] res = new String[s.length()];// Converting a String to array of
												// characters
		for (int i = 0; i < s.length(); i++) {
			res[i] = String.valueOf(s.charAt(i));
			num = num + Integer.parseInt(res[i]);
		}
		System.out.println("Total of numeric digits in the String " + s1 + " are : " + num);
		int sum_digits = Split_alpha_numeric.getNumericSum(s1);
		System.out.println("Using getnumeric() method : " + sum_digits);
	}

	public static int getNumericSum(String str) {
		int total = 0;
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				total += Character.getNumericValue(c);
			}
		}
		return total;
	}

}