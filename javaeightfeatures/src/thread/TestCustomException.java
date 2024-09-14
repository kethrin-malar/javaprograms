package thread;

//package thread;

class InvalidAgeException extends Exception{
	public InvalidAgeException (String str) {
		
	}
}

public class TestCustomException{
	static void validate(int age ) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("not eligible for vote");
		}
		else {
			System.out.println("eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(13);
			
		}
		catch(InvalidAgeException ex) {
			System.out.println("caught Exception ");
			
		}
		System.out.println("Rest of the code");

	}

}
