package exceptionhandling;

public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("rest of the program");
		}

	}

}
