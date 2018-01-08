package java_concepts;

class Person {
	public void talk() {
		System.out.print("I am a Person");
	}
}

class Student extends Person {

	@Override
	public void talk() {
		System.out.print("I am a Student");
	}
}

public class InheritanceStatic_Ex {
	public static void main(String args[]) {
		Person p = new Student();
		// Student p = new Person();
		p.talk();
	}

}
