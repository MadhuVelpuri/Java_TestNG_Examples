package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreMap_Ex {

	public static void main(String a[]) {
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "Madhu");
		tmap.put(3, "Velpuri");
		tmap.put(2, "Babu");
		// We get the result with ascending order
		// tmap.remove(2);
		System.out.println("Sorted Result of TreeMap");
		for (Map.Entry m : tmap.entrySet()) {
			System.out.println(m.getKey() + "\t" + m.getValue());
		}
		TreeMap<Integer, Student> tsmap = new TreeMap<Integer, Student>();
		// Using another class object to insert into Hastmap
		System.out.println("Using another class(Student) obj to store in Treemap");
		System.out.println("Sorted Result of TreeMap");
		Student s1 = new Student(1, "Madhu");
		Student s3 = new Student(3, "Velpuri");
		Student s2 = new Student(2, "Babu");
		// We get the result with ascending order

		tsmap.put(1, s1);
		tsmap.put(2, s2);
		tsmap.put(3, s3);

		for (Map.Entry<Integer, Student> m : tsmap.entrySet()) {
			int key = m.getKey();
			Student s = m.getValue();
			System.out.println(s.rollno + "\t" + s.name);

		}

	}

}
