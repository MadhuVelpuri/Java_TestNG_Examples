package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex_Final {

	public static void main(String a[]) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Madhu");
		hmap.put(2, "Babu");
		hmap.put(3, "Velpuri");
		hmap.remove(2);

		for (Map.Entry m : hmap.entrySet()) {
			System.out.println(m.getKey() + "\t" + m.getValue());
		}
		HashMap<Integer, Student> hsmap = new HashMap<Integer, Student>();
		// Using another class object to insert into HashMap
		System.out.println("Using another class(Student) obj to store in HashMap");
		Student s1 = new Student(1, "Madhu");
		Student s2 = new Student(2, "Babu");
		Student s3 = new Student(3, "Velpuri");
		hsmap.put(1, s1);
		hsmap.put(2, s2);
		hsmap.put(3, s3);

		for (Map.Entry<Integer, Student> m : hsmap.entrySet()) {
			int key = m.getKey();
			Student s = m.getValue();
			System.out.println(s.rollno + "\t" + s.name);

		}

	}
}
