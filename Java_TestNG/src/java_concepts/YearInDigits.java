package java_concepts;

import java.util.Scanner;

public class YearInDigits {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		Scanner scan = new Scanner(System.in);

		int year = sc.nextInt();
		int s = scan.nextInt();

		if (year >= 1980 && year <= 2020) {
			String str[] = yearDigits(year);

			for (int i = str.length - 1; i >= 0; i--) {
				if (i == 0)
					System.out.print(str[i]);
				else
					System.out.print(str[i] + " ");

			}

		} else
			System.out.println("Out of Range");
	}

	public static String[] yearDigits(int year) {

		int len = String.valueOf(year).length();

		String[] str = new String[len];
		int temp = 0, rem = 0;

		while (year != 0) {
			rem = year % 10;
			year = year / 10;

			String s = isText(rem);
			str[temp] = s;
			temp++;

		}

		return str;

	}

	private static String isText(int rem) {
		// TODO Auto-generated method stub

		String text = "";

		switch (rem) {
		case 0:
			text = "Zero";
			break;
		case 1:
			text = "One";
			break;
		case 2:
			text = "Two";
			break;
		case 3:
			text = "Three";
			break;
		case 4:
			text = "Four";
			break;
		case 5:
			text = "Five";
			break;
		case 6:
			text = "Six";
			break;
		case 7:
			text = "Seven";
			break;
		case 8:
			text = "Eight";
			break;
		case 9:
			text = "Nine";
			break;

		}

		return text;
	}
}
