package Prac.com;

public class Human {
	String name;
	int age;

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return "Human [name=" + name + ", age=" + age + "]";
//	}

	
}
 class student extends Human
 {
	 int rollno;

	public student(String name, int age, int rollno) {
		super(name, age);
		this.rollno = rollno;
	}

//	@Override
//	public String toString() {
//		return "student [rollno=" + rollno + "]";
//	}
 }
