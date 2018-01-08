package tricks;

public class Initialize {

	// int x = 10;

	public static void main(String ao[]) {
		me1(10);
	}

	public static void me1(int y) {
		int x = 0;
		x = y + 5;// local variable x must be initialized else will get an
					// error

		System.out.println(x);
	}

}
