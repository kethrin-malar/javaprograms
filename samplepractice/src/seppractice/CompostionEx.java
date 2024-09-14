package seppractice;

class Engine{
	public void startEngine(){
		System.out.println("start Engine");
	}
    public void stopEngine(){
    	System.out.println("stop Engine");
	}
}

class Car extends Engine{
	private Engine engine;
	
	public Car() {
	engine= new Engine();
	}
	
	public void startCar(){
		System.out.println("start Car");
		engine.startEngine();
	}
    public void stopCar(){
    	System.out.println("stop Car");
    	engine.stopEngine();
	}
	
}

public class CompostionEx {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.startCar();
		obj.stopCar();
	}
}
