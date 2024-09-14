package samplepracticeproblem;

public class CarInstance {
	int id;
	String name;
	static String model = "BMW";
	
	void display() {
		System.out.println(id+" "+name+" "+" "+model);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarInstance obj = new CarInstance();
		obj.id=21;
		obj.name="car";
		
		CarInstance obj1 = new CarInstance();
		obj1.id=212;
		obj1.name="cars";
		
		
		
		obj.display();
		obj1.display();
	}

}
