package practiceproblem;

public class ArithmeticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			int s = a / b;
			System.out.println("ArithmeticEx:" + s);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		}
	}

}
