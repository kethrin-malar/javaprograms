package practiceproblem;

class Calculator{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	
}

public class OverloadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Calculator.add(1, 3));
System.out.println(Calculator.add(1, 3,6));
	}

}
