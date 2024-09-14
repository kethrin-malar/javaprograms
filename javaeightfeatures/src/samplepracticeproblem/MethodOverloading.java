package samplepracticeproblem;

class Example1{
	static int display(int a,int b) {
		return a+b;
	}
	static int display(int a,int b,int c) {
		return a+b+c;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Example1.display(4,7));
		System.out.println(Example1.display(4,5,8));
		
	}

}
