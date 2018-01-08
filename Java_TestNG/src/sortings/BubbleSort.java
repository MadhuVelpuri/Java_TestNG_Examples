package sortings;

public class BubbleSort {

	public static void main(String a[]) {
		int arr[] = { 5, 3, 7, 2, 1 };

		BubbleSort bs = new BubbleSort();
		bs.sort(arr);

	}

	public void sort(int a[]) {

		int j;
		for (int n = a.length; n >= 0; n--) {
			for (int i = 0; i < (n - 1); i++) {
				j = i + 1;
				if (a[j] < a[i]) {
					swap(i, j, a);

				}
			}
		}
		System.out.println("Sorted array is : ");
		for (int i1 = 0; i1 < a.length; i1++) {
			System.out.println(a[i1]);
		}

	}

	private static void swap(int i, int j, int[] a) {
		// TODO Auto-generated method stub

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
