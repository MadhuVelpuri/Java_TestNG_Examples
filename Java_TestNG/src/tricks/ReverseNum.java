package tricks;

public class ReverseNum {

	public int reverse(int num) {
		int reverse = 0;
		while (num != 0) {
			int lastdigit = num % 10;
			num = num / 10;
			reverse = reverse * 10 + lastdigit;

		}

		return reverse;
	}

	public static void main(String[] args) {
		ReverseNum re = new ReverseNum();
		int n = 454;
		int reverseNum = re.reverse(n);
		if (n == reverseNum)
			System.out.println(n + " is Palindrome");
		// System.out.println(reverseNum);

		boolean armStrong = isArmstrong(153);
		System.out.println(153 + " is Armstrong : " + armStrong);

	}

	public static boolean isArmstrong(int num) {
		int digit = 0, arm = 0;
		int temp = num;
		while (num != 0) {
			digit = num % 10;
			num = num / 10;
			arm = arm + (digit * digit * digit);

		}

		if (temp == arm)
			return true;
		else
			return false;
	}

}
