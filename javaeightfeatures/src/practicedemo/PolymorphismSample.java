package practicedemo;

class VehicleDemo{
	public void display() {
		System.out.println("new model");
	}
	
}

class Bike1 extends VehicleDemo{
public void display() {
	System.out.println("new model car");	
	}
}


class Lorry extends VehicleDemo{
public void display() {
	System.out.println("new model Bike");
	}
}

public class PolymorphismSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleDemo v = new VehicleDemo();
		Bike1 c = new Bike1();
		Lorry l = new Lorry();
		v.display();
		c.display();
	    l.display();
	}

}

