package seppractice;



abstract class Birds{
	abstract void print();
	
}

class Kuyil extends Birds{
	public void print() {
		System.out.println("Hi");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kuyil k = new Kuyil();
		k.print();
		
	}

}
