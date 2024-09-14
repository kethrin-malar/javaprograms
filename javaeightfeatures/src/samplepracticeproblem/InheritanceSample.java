package samplepracticeproblem;



class Electronics{
	public void display() {
		System.out.println("Electronic items...");
	}
	
}

class Laptop extends Electronics{
	public void open() {
		System.out.println("open the laptop...");
	}
}

public class InheritanceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop obj = new Laptop();
		obj.open();
		obj.display();

	}

}
