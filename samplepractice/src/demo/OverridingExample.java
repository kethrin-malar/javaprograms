package demo;

/*class Shape{
	public void display() {
		System.out.println("Hi shape");
	}
}*/


class InvalidAgeException extends Exception{
	public void InvalidAgeException(String str) {
}
}

class Rectangle{
	 public static  void validate(int age) throws InvalidAgeException{
		 if(age<18) {
			 throw new InvalidAgeException();
		 }else {
			 System.out.println("validate the age");
		 }
		
		System.out.println("Hi rectangle");
	}
}

public class OverridingExample {

	public static void main(String[] args) throws InvalidAgeException {
		
		validate(13);
	}
		// TODO Auto-generated method stub
   /*Rectangle r = new Rectangle();
		   r.display();
		   Shape s = new Rectangle();
		   s.display();
	}*/

	private static void validate(int i) {
		// TODO Auto-generated method stub
		
	}

}
