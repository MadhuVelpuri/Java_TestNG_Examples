package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap_Ex2 {

	public static void main(String a[]) {
		HashMap hmap1 = new HashMap();
		hmap1.put(1, "ONE");
		hmap1.put(2, "TWO");
		hmap1.put(3, "THREE");

		Set st = hmap1.entrySet();// Converting to Set so that we can traverse
		Iterator ite = st.iterator();
		while (ite.hasNext()) {
			Map.Entry m = (Map.Entry) ite.next();//Converting to Map.Entry so that we can get key and value separately
			System.out.println(m.getKey() + "\t" + m.getValue());

		}

	}
}
