package tricks;

public class Interface_class implements Driver {

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("This is a demo method of interface implementation");
	}

	public static void main(String a[]) {
		Driver d = new Interface_class();
		d.demo();
	}

}
