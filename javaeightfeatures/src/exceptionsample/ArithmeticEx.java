package exceptionsample;

public class ArithmeticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("result:" +c);
		}catch(ArithmeticException e) {
			
			System.out.println("caught error");
		}

	}

}
