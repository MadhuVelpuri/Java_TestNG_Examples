package tricks;

public class Iinertitance_trick1 {

	public static void main(String[] args) {
		try {

			Ex e = new Ex2();

			e.test();
			/*
			 * Ex2 e1 = new Ex2(); e1.test();
			 */

			// System.out.println(e.i + " " + e.j);// e.j is an error as there
			// is
			// no j
			// in Ex class
			// System.out.println(e1.i);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
	}

}

class Ex {
	int i = 10;

	public void test() {
		System.out.println("Ex Base class");
	}

}

class Ex2 extends Ex {
	int i = 20;
	int j = 30;
	/*
	 * @Override public void test() { System.out.println("Ex1 sub class"); }
	 */
}