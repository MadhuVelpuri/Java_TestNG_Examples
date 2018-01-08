package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Ex {

	public static void main(String a[]) {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		Set<Integer> set = new HashSet<Integer>();
		try {
			for (int i = 0; i < 5; i++) {
				set.add(count[i]);
			}
			System.out.println("Hash Set Result is : " + set);

			TreeSet sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is:");
			System.out.println(sortedSet);

			System.out.println("The First element of the HashSet is: " + sortedSet.first());
			System.out.println("The last element of the TreeSet is: " + sortedSet.last());
		} catch (Exception e) {
		}
	}

}
