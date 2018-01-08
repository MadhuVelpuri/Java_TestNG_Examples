package tricks;

class Base {

	public String a(String name, String surname) {
		name = "Madhu";
		surname = "VNK";
		String fullname = name + " " + surname;
		System.out.println(fullname);
		return fullname;
	}

	public void b(String n) {

	}
}

class Sub extends Base {

	@Override
	public String a(String name, String surname) {
		int a = 10;
		System.out.println("Hello");
		return "Hello";
	}

	@Override
	public void b(String name) {
		System.out.println("Overloaded");

	}

}

public class OverridingvsOverloading extends B {

	public static void main(String[] args) {

		// Sub s = new Sub();
		Base b = new Sub();

		b.a("Madhu", "Velpuri");
		b.b("Madhu");
	}
}
