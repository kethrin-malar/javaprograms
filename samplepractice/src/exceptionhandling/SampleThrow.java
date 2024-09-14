package exceptionhandling;

public class SampleThrow {
	static void valid(int age) {
		if(age < 18) {
			throw new ArithmeticException("less than 18 not voted");
		}else {
			System.out.println("you are eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		valid(15);

	}

}
