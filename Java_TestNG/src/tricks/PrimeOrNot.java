package tricks;

public class PrimeOrNot {

	public static void main(String[] args) {

		boolean r = PrimeOrNot.isPrime(29);
		System.out.println(r);

	}

	public static boolean isPrime(int num) {
		int n = num, count = 0;
		boolean res = false;

		for (int j = 1; j <= n; j++) {
			if (n % j == 0)
				// res = false;
				count++;
			/*
			 * else res = true;
			 */

		}

		if (count == 2)
			return true;
		else
			return false;

	}
}
