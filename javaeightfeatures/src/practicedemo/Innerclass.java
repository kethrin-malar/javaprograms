package practicedemo;


abstract class A{
	abstract void display();
}

public class Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A() {
			void display() {
				System.out.println("some messages....");
			}
		};
		obj.display();

	}

}
