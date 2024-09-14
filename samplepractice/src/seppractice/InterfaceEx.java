package seppractice;


interface CarG{
	void print();
	
}

class Lorry implements CarG{
	public void print() {
		System.out.println("Run the car");
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lorry l = new Lorry();
		l.print();
	}

}
