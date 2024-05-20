package basicprogram;

class Program {
	public void displayInfo() {
		System.out.println("I am a basic programmer.");
	}
}

class Python extends Program {
	@Override
	public void displayInfo() {
		System.out.println("I am learning python.");
	}
}

public class AnnotationExample {

	public static void main(String[] args) {
		Python p1 = new Python();
		p1.displayInfo();
	}
}