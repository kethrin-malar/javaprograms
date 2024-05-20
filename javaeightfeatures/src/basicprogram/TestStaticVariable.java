package basicprogram;

class CSEStudent {
	int rollno;// instance variable
	String name;
	static String college = "ITS";// static variable
	
	
	// constructor
	CSEStudent(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

public class TestStaticVariable {

	public static void main(String args[]) {
		CSEStudent s1 = new CSEStudent(111, "Karan");
		CSEStudent s2 = new CSEStudent(222, "Aryan");
		// we can change the college of all objects by the single line of code
		// Student.college="BBDIT";
		s1.display();
		s2.display();
	}

}
