package practicedemo;


abstract class AnimalGang{
	abstract void sound();
}

class Lion extends AnimalGang{
	public void sound() {
		System.out.println("urr urrr");
	}
}
class Cat extends AnimalGang{
	public void sound() {
		System.out.println("Meewww");
	}
}


public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l = new Lion();
		Cat c = new Cat();
		l.sound();
		c.sound();
	}

}
