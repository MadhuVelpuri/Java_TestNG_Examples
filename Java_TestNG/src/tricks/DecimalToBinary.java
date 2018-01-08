package tricks;

public class DecimalToBinary {

	public static int[] deciamltobinary(int num) {
		int arr[] = new int[40];
		int index = 0;

		while (num > 0) {
			arr[index++] = num % 2;
			num = num / 2;

		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

		return arr;

	}

	public static int binaryToDecimal(int[] num) {
		int number = 0, p = 0;

		for (int n : num) {
			number += ((n % 10) * Math.pow(2, p));
			n = n / 10;
			p++;

		}
		System.out.println("");
		System.out.println(number);
		return number;

	}

	public static void main(String a[]) {
		System.out.println("Binary value for 50 is : ");
		DecimalToBinary.deciamltobinary(50);
		int[] arr = { 1, 0, 1, 1 };
		DecimalToBinary.binaryToDecimal(arr);

	}

}
