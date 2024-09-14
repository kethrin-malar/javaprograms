package practicedemo;


interface Shape{
	void draw();
}


class Rectangle implements Shape{
	public void draw() {
		System.out.println("draw Rectangle...");
	}
}
class Round implements Shape{
	public void draw() {
		System.out.println("draw Round...");
	}
	
	
}

public class InterfaceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle();
		Round obj1 = new Round();
		
		obj.draw();
		obj1.draw();
		

	}

}
