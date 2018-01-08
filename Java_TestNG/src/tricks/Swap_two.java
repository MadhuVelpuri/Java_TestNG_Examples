package tricks;

public class Swap_two {
	public static void main(String a[]) {
		int x = 5, y = 3;
		System.out.println("X and Y before swapping : " + " X=" + x + "; Y=" + y);

		// Using + and -
		x = x + y;
		y = x - y;
		x = x - y;

		// Using * and /
		x = x * y;
		y = x / y;
		x = x / y;

		System.out.println("X and Y after swapping : " + " X=" + x + "; Y=" + y);

	}

	public void swapinaLine(int x, int y) {

	}
}