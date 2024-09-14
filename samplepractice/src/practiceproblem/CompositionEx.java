package practiceproblem;

class Engine {
	public void startEngine() {
		System.out.println("start engine");
	}

	public void stopEngine() {
		System.out.println("stop engine");
	}

}

class Car {
	private Engine engine;

	public Car() {
		engine = new Engine();
	}

	public void startCar() {
		System.out.println("start car...");
		engine.startEngine();
	}

	public void stopCar() {
		System.out.println("stop car...");
		engine.stopEngine();

	}
}

public class CompositionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.startCar();
		c.stopCar();
		
	}

}
