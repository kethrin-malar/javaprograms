package practicedemo;

class Engine {

	public void start() {
		System.out.println("Running the engine");
	}

	public void stop() {
		System.out.println("Running the engine");
	}

}

class car {
	private Engine engine;

	public car() {
		engine = new Engine();
	}

	public void startCar() {
		System.out.println("start the car");
		engine.start();
	}

	public void stopCar() {
		System.out.println("stop the car");
		engine.stop();
	}

}

public class Compostion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj = new car();
		obj.startCar();
		obj.stopCar();
	}

}
