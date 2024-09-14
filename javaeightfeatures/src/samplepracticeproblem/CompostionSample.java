package samplepracticeproblem;

class Engine {
	public void start() {
		System.out.println("start the car");
	}

	public void stop() {
		System.out.println("Stop the car");

	}
}

class Car {
	private Engine engine;

	Car() {
		engine = new Engine();

	}

	public void startcar() {
		System.out.println("running...");
		engine.start();

	}

	public void stopcar() {
		System.out.println("stop...");
		engine.stop();

	}
}

public class CompostionSample {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.startcar();
		obj.stopcar();

	}
}
