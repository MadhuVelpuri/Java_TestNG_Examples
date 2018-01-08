package tricks;

public class ArrayOrderofElements {

	public static void main(String[] args) {

		int a[] = { 1, 0, 1, 0, 1, 0, 3, 1, 4, 2, 3 };
		int n = a.length, temp;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ",");
		}

	}

}