package hackerRank;

import org.apache.commons.lang3.StringUtils;

public class String_Caps {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String A = "java";
		String B = "java";

		/*
		 * // Scanner sc = new Scanner(System.in);
		 * 
		 * String A = sc.next(); String B = sc.next();
		 * 
		 * System.out.println(A.length() + B.length());
		 * System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		 * System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) +
		 * " " + B.substring(0, 1).toUpperCase() + B.substring(1));
		 */

		char[] aaa = A.toCharArray();
		char[] bbb = B.toCharArray();
		System.out.println(A.length() + B.length());
		for (int i = 0; i <= aaa.length; i++) {
			for (int j = 0; j <= bbb.length; j++) {
				if (aaa[i] > bbb[j]) {
					System.out.println("Yes");//
					break;
				}
				// StringUtils.capitalize(BooleanUtils.toStringYesNo(aaa[i] //
				// >bbb[j])));
				else {
					System.out.println("No");
					break;
				}

			}
			break;

		}

		System.out.println(StringUtils.capitalize(A) + " " + StringUtils.capitalize(B));

	}
}
