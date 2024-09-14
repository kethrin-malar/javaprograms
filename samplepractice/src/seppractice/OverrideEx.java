package seppractice;


class Animal{
	public void makeSound() {
		System.out.println("Hi");
	}
}

class Pig extends Animal{
	public void makeSound() {
		System.out.println("Hello");
	}
}

public class OverrideEx {
	public static void main(String[] args) {
		Pig obj = new Pig();
		obj.makeSound();
	}

}
