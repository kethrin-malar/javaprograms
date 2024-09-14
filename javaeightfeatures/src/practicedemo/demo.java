package practicedemo;

class Vehicle{
	public void run() {
		System.out.println("run...........");
	}
}

class Bike extends Vehicle{
	public void sound() {
		System.out.println("make sound...........");
	}

}



public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.sound();
		b.run();

	}

}
