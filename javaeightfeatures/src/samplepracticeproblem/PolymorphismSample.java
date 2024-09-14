package samplepracticeproblem;

class Animal{
	public void display() {
		System.out.println("Animal:Make sound...");
	}
}
	
class Pig extends Animal{
	public void display() {
		System.out.println("Pig:wee wee...");	
	}
}
class Cow extends Animal{ 
	public void display() {
		System.out.println("Cow:Maa Maa...");	
	}
}
	

	
public class PolymorphismSample {
	public static void main(String[] args) {
		Animal obj = new Animal();
		Pig obj1 = new Pig();
	    Cow obj2 = new Cow();
	    obj.display();
	    obj1.display();
	    obj2.display();
	}

}
