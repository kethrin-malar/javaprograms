package demo;



interface A{
	void display();
}

class B {
	public void display() {
		System.out.println("Hi");
	}
	
}

abstract class C {
	abstract void print(); 
	
}

class Sample extends C{
	public void print() {
		System.out.println("How are you?");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Sample obj = new Sample();
   obj.print();
	}

}
