package tricks;

public class NumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input String");
		java.util.Scanner sc = new java.util.Scanner(System.in);

		String input = sc.next();
		boolean res = numberornot(input);
		if (res)
			System.out.println("Entered string is Number");
		else
			System.out.println("Entered string is String");

	}

	public static boolean numberornot(String input) {
		try {
			Integer.parseInt(input);
		} catch (Exception e) {
			return false;
		}

		return true;
	}

}
