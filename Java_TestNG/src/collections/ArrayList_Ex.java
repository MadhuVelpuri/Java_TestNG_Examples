package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList<String> sa = new ArrayList<String>();
			sa.add("Madhu ");
			sa.add("Babu ");
			sa.add(" Loser");

			// Using Iterator

			System.out.print("Using Iterator : ");
			Iterator it = sa.iterator();

			while (it.hasNext()) {
				System.out.print(it.next());
			}
			System.out.println("");

			// Using for

			System.out.print("Using For each loop : ");
			for (String a : sa) {
				System.out.print(a);
			}

			System.out.println("");

			// Using another class obj to store in arraylist

			System.out.println("Using another class(Student) obj to store in arraylist");
			Student s1 = new Student(1, "Madhu", 24);
			Student s2 = new Student(2, "Babu", 25);
			Student s3 = new Student(3, "Velpuri", 26);

			ArrayList<Student> a1 = new ArrayList<Student>();
			a1.add(s1);
			a1.add(s2);
			a1.add(s3);
			Iterator ite = a1.iterator();
			while (ite.hasNext()) {
				Student st = (Student) ite.next();
				System.out.println(st.rollno + " " + st.name + " " + st.age);
			}

			System.out.println("");

			// Using addAll(Collection c) method

			ArrayList<String> sa1 = new ArrayList<String>();
			sa1.add(" Loser");
			sa.addAll(sa1);
			System.out.println("After adding another arralylist to sa : ");
			Iterator it123 = sa.iterator();

			while (it123.hasNext()) {
				System.out.print(it123.next());
			}
			System.out.println("");

			// Using removeAll(Collection c) method

			System.out.println("After removing sa1 from sa list");
			sa.removeAll(sa1);
			Iterator it12 = sa.iterator();
			while (it12.hasNext()) {
				System.out.print(it12.next());
			}

			// Using retainAll(Collection c) method
			ArrayList<String> sa2 = new ArrayList<String>();
			sa2.add("Madhu ");
			sa.retainAll(sa2);
			System.out.println("");
			System.out.println("After retaining the ele of sa1...");
			Iterator site = sa.iterator();
			while (site.hasNext()) {
				System.out.println(site.next());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
