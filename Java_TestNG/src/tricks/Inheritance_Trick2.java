package tricks;

public class Inheritance_Trick2 {
	public static void main(String[] args) {
		sample3 c = new sample3();

		sample2 c1 = new sample3();

	}

}

class sample1 {
	{
		System.out.println(1);
	}
}

class sample2 extends sample1 {
	{
		System.out.println(2);
	}
}

class sample3 extends sample2 {
	{
		System.out.println(3);
	}
}
