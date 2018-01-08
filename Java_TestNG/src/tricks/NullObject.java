package tricks;

public class NullObject {

	// "" or null - it'll call String method

	public void Strobjnull(String s) {
		System.out.println("String");
	}

	public void Strobjnull(Object o) {
		System.out.println("Object");
	}

	/*
	 * public void Strobjnull(Integer i) { System.out.println("Integer"); }
	 */

	//
	public static void main(String a[]) {
		Object a1 = null;
		NullObject no = new NullObject();
		no.Strobjnull("");
		no.Strobjnull(null);
		no.Strobjnull(a1); // Calling a method by passing null value - Sting
							// or
							// Object
	}

}
