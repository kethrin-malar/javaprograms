package basicprogram;

abstract class Bike {
	abstract void run();
}

class AbstractSample extends Bike {
	void run() {
		System.out.println("running safely");
	}
 
	public static void main(String args[]) {
		AbstractSample obj = new AbstractSample();
		obj.run();
	}
}
