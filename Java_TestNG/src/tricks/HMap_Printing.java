package tricks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HMap_Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a hash map

		// Put elements to the map

		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("Zara", new Double(123.22));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));

		// Get a set of the entries
		Set<?> set = hm.entrySet();

		// Get an iterator
		Iterator<?> i = set.iterator();

		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

		// Deposit 1000 into Zara's account
		double balance = hm.get("Zara").doubleValue();
		hm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " + hm.get("Zara"));
	}
}