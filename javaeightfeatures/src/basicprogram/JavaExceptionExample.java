package basicprogram;

public class JavaExceptionExample {
	public static void main(String args[]) {
		try {
			// code that may raise exception
			int data = 100 / 10;
			
			//int data = 100 / 0;//arithmeticException error
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		// rest code of the program
		System.out.println("rest of the code...");
	}
}
