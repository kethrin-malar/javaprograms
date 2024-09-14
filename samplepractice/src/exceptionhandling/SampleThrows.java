package exceptionhandling;

public class SampleThrows {
	static void validate(int age) throws ArithmeticException{
		if(age<18) {
			throw new ArithmeticException("you are not eligible");
			
		}else {
			System.out.println("eligible for vote");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      validate(18);
	}

}
