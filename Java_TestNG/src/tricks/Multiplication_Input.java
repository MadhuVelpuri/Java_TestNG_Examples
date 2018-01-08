package tricks;

import java.util.Scanner;

public class Multiplication_Input {
	public static void main(String a[]) {
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Multiplication_Input.multiply(num);
	}

	public static void multiply(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}
