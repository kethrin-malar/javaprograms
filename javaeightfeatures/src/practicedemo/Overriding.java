package practicedemo;


class Animal{
	public void display() {
		System.out.println(" hunry.......");
	}
	
}

class Pig extends Animal{
	public void display() {
		System.out.println(" wee wee.......");
	}
	
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pig obj = new Pig();
		obj.display();

	}

}
