package advancedconcept;


 interface A{
	void play();
	
	default void run() {
		System.out.println("Running the car");
	}
}

class Car1 implements A{
	public void play() {
		System.out.println("playinggg...");
	}
}


public class DefaultExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 obj = new Car1();
		obj.play();
		obj.run();
	}

}
