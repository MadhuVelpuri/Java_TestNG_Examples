package tricks;

import java.util.Scanner;

public class ArmStrong {

	int y;

	public int getData() {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		return x;

	}

	public String formula(int x) {

		int rem = 0, z = 0;
		int temp = x;
		while (x != 0) {
			rem = x % 10;
			x = x / 10;
			z = z + (rem * rem * rem);

		}

		if (temp == z)
			return "Amstrong";

		else
			return "Not Amstrong";

	}

	public static void main(String[] args) {

		ArmStrong a = new ArmStrong();
		int no = a.getData();
		String res = a.formula(no);

		System.out.println("Given number " + no + " is : " + res);

	}
}
