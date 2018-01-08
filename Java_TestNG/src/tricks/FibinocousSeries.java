package tricks;

/*public class Fibbonacci {

	public static void main(String[] args) {
		FibbSeries(7);

	}

	public static void FibbSeries(int num) {
		int n = num, a = 0, b = 1;
		int c = a + b;
		System.out.print(a + " " + b);
		for (int i = 1; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;

			System.out.print(" " + c);
		}

	}

}
*/

public class FibinocousSeries {

	void check(int num) {
		int x = 0;
		int y = 1;
		int z;
		System.out.print(x + " " + y);
		for (int i = 1; i <= num; i++) {
			z = x + y;
			x = y;
			y = z;
			System.out.print(" " + z);

		}
	}

	public static void main(String[] args) {
		int count = 15;
		FibinocousSeries b = new FibinocousSeries();

		b.check(count);

	}
}