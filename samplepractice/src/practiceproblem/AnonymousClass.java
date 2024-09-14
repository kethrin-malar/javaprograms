package practiceproblem;

abstract class Dept{
	abstract void print();
}

public class AnonymousClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d = new Dept() {
			public void print() {
				System.out.println("welcome to CSE dept");
			}
		};
		d.print();
	}

}
