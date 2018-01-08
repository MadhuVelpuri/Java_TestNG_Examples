package tricks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuplicateIn1toN {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		for (int i = 1; i <= 30; i++) {
			num.add(i);
		}

		System.out.println("Adding duplicate : " + num.add(12));

		Iterator ite = num.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		DuplicateIn1toN dup = new DuplicateIn1toN();
		int duplicate = dup.finDup(num);
		System.out.println("\nDuplicate number is : " + duplicate);
	}

	private int finDup(List<Integer> num) {
		int lastDigit = num.size() - 1;
		int total = sum(num);
		int dup = total - (lastDigit * (lastDigit + 1) / 2);
		return dup;

	}

	private int sum(List<Integer> num) {
		int sum = 0;
		for (int n : num) {
			sum = sum + n;

		}
		return sum;
	}
	/*
	 * public void stringImmute() {
	 * 
	 * String a = "stack"; System.out.println(a);// prints stack
	 * a.setValue("overflow"); System.out.println(a);
	 * 
	 * }
	 */
}
