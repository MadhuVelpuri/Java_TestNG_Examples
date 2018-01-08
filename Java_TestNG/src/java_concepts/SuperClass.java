package java_concepts;

public class SuperClass extends Static_Instance {

	SuperClass(int a, int b) {
		// System.out.println("This is 1st stmt in constructor");
		this(); // must be first statement in the constructor
		// super(); // must be first statement in the constructor

	}

	public SuperClass() {
		// TODO Auto-generated constructor stub

		System.out.println("Sample default constructor to call in this() ");
	}

	public void metod1() {
		System.out.println("Method1");

	}

	public void method2() {
		System.out.println("");
		int b = 10;
		this.metod1();
		super.a = 10;
		super.b = 3000;
		// assigning the value to super class variable and using
		// it.
		System.out.println("Super class a: " + a);
		System.out.println("Super class b: " + b);

	}

	public static void main(String a[]) {

		/*
		 * this. // can't use this in static method/blocks super.
		 */// can't use super in static methods/blocks

		SuperClass s = new SuperClass(3, 5);
		s.method2();
	}

}
