package samplepracticeproblem;


abstract class Shape{
	abstract void draw();
}


class Circle extends Shape{
	void draw(){
		System.out.println("Hello......Circle");
		
	}
}
class Rectangle extends Shape{
		void draw(){
			System.out.println("Hello......Rectangle");
			
		}
}

public class AbstractExample {
	public static void main(String[] arg) {
		Shape obj = new Circle();
		Shape obj1 = new Rectangle();
		obj.draw();
		obj1.draw();
	}
		
	
}




