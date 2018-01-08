package sortings;

/**
 * Here we compare an element with it's all previous elements and do the
 * swapping accordingly
 * 
 * @author madhubabu.velpuri
 *
 */
public class InsertionSort {

	public static void main(String a[]) {
		int arr[] = { -10, 5, -5, 0, 55, 1, 10 };
		InsertionSort ins = new InsertionSort();
		ins.insSort(arr);

	}

	private void insSort(int a[]) {
		// TODO Auto-generated method stub
		int temp;

		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;

				}

			}

		}

		System.out.println("Sorted array is : ");
		for (int a1 : a) {
			System.out.println(a1);
		}
	}

}
