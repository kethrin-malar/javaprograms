package basicprogram;

class Student {
	int rollno;
	String name;
	float fee;

	Student(int rollno, String name, float fee) { // parameterized constructor
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	
	Student(int rollno) { // constructor overloading
		this.rollno = rollno;
		
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class Constructorsample {
	public static void main(String args[]) {
		Student s1 = new Student(111, "ankit", 5000f);
		Student s2 = new Student(112, "sumit", 6000f);
		Student s3 = new Student(112);
		s1.display();
		s2.display();
		s3.display();
	}
}