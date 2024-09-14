package practiceproblem;

class Dog{
	int dogid;
	String dogname;
	
	static String ownername ="malar";
	
	public Dog(int dogid,String dogname ) {
		this.dogid=dogid;
		this.dogname=dogname;
	}
	
	void display() {
		System.out.println(dogid+" "+dogname+" "+ownername);
	}
	
	
}

public class VariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog(123,"Rogu");
		d.display();
		Dog d1 = new Dog(12345,"jimmi");
		d1.display();

	}

}
