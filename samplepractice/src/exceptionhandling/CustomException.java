package exceptionhandling;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		
	}
}


public class CustomException {
	static void valid(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("not valid for vote");
			
		}else {
			System.out.println("valid for vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			valid(13);
		}catch(InvalidAgeException e) {
			System.out.println("caught the error");
		}
		
		System.out.println("rest of the code");

	}

}
