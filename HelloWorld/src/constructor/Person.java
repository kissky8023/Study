package constructor;

public class Person {
	String name;
	int age;
	public Person() {
		super();
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
