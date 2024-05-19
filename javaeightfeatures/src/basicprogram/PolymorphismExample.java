package basicprogram;


class AnimalFamily {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends AnimalFamily {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Lion extends AnimalFamily {
	  public void animalSound() {
	    System.out.println("The Lion says: chuffs chuffs");
	  }
	}

	public class PolymorphismExample {
	  public static void main(String[] args) {
		  AnimalFamily myAnimal = new AnimalFamily();  // Create a Animal object
		  Pig myPig = new Pig();  // Create a Pig object
		  Lion myLion = new Lion();  // Create a Dog object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myLion.animalSound();
	  }
}


