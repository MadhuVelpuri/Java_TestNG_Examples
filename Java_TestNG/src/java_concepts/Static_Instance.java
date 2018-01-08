package java_concepts;

public class Static_Instance {

	Static_Instance() {
		System.out.println("Default Constructor...");
	}

	int a = 1;
	static int b = 3;

	public static void print() {
		// System.out.println("instance variable inside static method : " + a);
		// // We
		// can't
		// access
		// the
		// non-static
		// members
		// in
		// static
		// methods

	}

	public void printInstance() {

		System.out.println("Static variable in instance method : " + b);
	}

	public static void main(String[] args) {

		Static_Instance s = new Static_Instance();

	}

}
