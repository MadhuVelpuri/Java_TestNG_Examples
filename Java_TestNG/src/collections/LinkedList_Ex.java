package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Ex {

	public static void main(String a[]) {
		LinkedList<String> lsample = new LinkedList<String>();
		lsample.add("Zee ");
		lsample.add("Saregamapa");
		lsample.add(" : Tanya Tiwari");
		System.out.println("Simple Linked List with Iterator:");
		for (String a1 : lsample) {
			System.out.print(a1);
		}

		// Using another class object to add in LinkedList]
		System.out.println("");

		System.out.println("Using another class(Student) obj to store in LinkedList");
		Student s1 = new Student(1, "Madhu", 24);
		Student s2 = new Student(2, "Babu", 25);
		Student s3 = new Student(3, "Velpuri", 26);
		LinkedList<Student> lstu = new LinkedList<Student>();
		lstu.add(s1);
		lstu.add(s2);
		lstu.add(s3);
		ListIterator lite = lstu.listIterator();

		while (lite.hasNext()) {
			Student st = (Student) lite.next();
			System.out.print(st.name + " " + st.age + " " + st.rollno);
			System.out.println("");
		}
	}
}
