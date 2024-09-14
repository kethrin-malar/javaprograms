package practiceproblem;

class Shape{
	public void print() {
		System.out.println("draw the shape");
	}
}

class Rectangle extends Shape{
	public void display() {
		System.out.println("The shape is rectangle");
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle();
		r.print();
		r.display();
	}

}
