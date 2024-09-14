package practicedemo;

public class SampleVariable {
	int id;
	String dept;
	static String college = "psna";
	
	
	void display() {
		System.out.println(id+" "+dept+" "+college);
	}



	public static void main(String[] args) {
		SampleVariable obj = new SampleVariable();
		obj.id = 10;
		obj.dept="CSE";
		
		
		SampleVariable obj1 = new SampleVariable();
		obj1.id = 11;
		obj1.dept="ECE";
		
		
		
		obj.display();
		obj1.display();
		
		

		
	}

}
