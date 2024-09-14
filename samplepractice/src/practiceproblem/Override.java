package practiceproblem;

class Animal{
	public void makeSound() {
		System.out.println("make sound");
	}
	
}

class Pig extends Animal{
	public void makeSound() {
		System.out.println("wee wee");
	}
	
}
class Cow extends Animal{
	public void makeSound() {
		System.out.println("Maa Maa");
	}
	
}


public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		
		Pig p = new Pig();
		
		Cow c = new Cow();
		
		a.makeSound();
		p.makeSound();
		c.makeSound();
		

	}

}
