package basicprogram;

abstract class Person {
	abstract void eat();
}

public class AnanymousInnerclass {
	public static void main(String args[]) {
		Person p = new Person() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}
}
