package tricks;

public class ConstructorChaining {

	public ConstructorChaining() {
		// TODO Auto-generated constructor stub
		System.out.println("Default");

	}

	public ConstructorChaining(int x) {
		this();
		System.out.println(x);
	}

	public ConstructorChaining(int i, int j) {
		// TODO Auto-generated constructor stub
		this(5);
		System.out.println(i * j);
	}

	public static void main(String[] args) {

		new ConstructorChaining(5, 20);
	}

}
