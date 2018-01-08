package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Ex {

	public static void main(String a[]) {
		// Set<String> s = new Set<String>(); This will give u error as Set
		// can't be instantiated as it's an interface

		Set<String> hset = new HashSet<String>();
		hset.add("Madhu");
		hset.add("Babu");
		hset.add("Velpuri");
		hset.add("Madhu");// it won't get added as set doesn't allow duplicates
		Iterator ite = hset.iterator();

		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		// Using another class object to insert in HashSet

		Set<Student> hstu = new HashSet<Student>();
		Student sobj = new Student(1, "Madhu", 24);
		Student sobj1 = new Student(2, "Babu", 25);
		Student sobj2 = new Student(3, "Velpuri", 24);
		hstu.add(sobj);
		hstu.add(sobj1);
		hstu.add(sobj2);
		Iterator ite1 = hstu.iterator();
		while (ite1.hasNext()) {
			Student ste = (Student) ite1.next();
			System.out.print(ste.rollno + " " + ste.name + " " + ste.age + "\n");
		}
	}

}
