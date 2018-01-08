package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex {

	public static void main(String a[]) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "One");
		hmap.put(1, "One");
		hmap.put(2, "Two");
		hmap.put(3, "Three");

		// Using Map.Entry interface
		for (Map.Entry m : hmap.entrySet()) {
			System.out.println(m.getKey() + "\t" + m.getValue());
		}

	}

}
