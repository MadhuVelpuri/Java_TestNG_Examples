package tricks;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int[] a = new int[10];
			for (int i = 1; i <= a.length; i++) {
				a[i] = a[i] / 10;
			}
		}

		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
