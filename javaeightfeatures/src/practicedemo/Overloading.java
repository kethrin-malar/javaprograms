package practicedemo;

public class Overloading {
	
	 static int display(int a,int b) {
		return a+b;
	}
	
	 static int display(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Overloading.display(2,6));
		System.out.println(Overloading.display(2,6,9));
	}

}
