package seppractice;

public class OverloadEx {
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(OverloadEx.add(5, 3));
		System.out.println(OverloadEx.add(5, 5, 5));
		

	}

}
