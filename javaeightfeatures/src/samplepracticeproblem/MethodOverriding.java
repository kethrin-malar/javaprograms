package samplepracticeproblem;



class Flower{
	public void display() {
		System.out.println("hi Flower...");
	}
	
}
class Rose extends  Flower{
	public void display() {
		System.out.println("hello Rose...");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose obj = new Rose();
		obj.display();
		
	}

}
