package samplepracticeproblem;

//interfaceA obj = new B;
//interfaceA obj1 = new c

interface A{
	
	 void display();
}

class B implements A{
	
	public void display() {
		System.out.println("Hi...");
	}
	
	
}
class C implements A{
	public void display() {
		System.out.println("Hello...");
	}
	

}
public class ExampleInterfaceA{
	public static void main(String[] args) {
		B obj = new B();
		C obj1 = new C();
		
		obj.display();
		obj1.display();
		
		
	}
}

