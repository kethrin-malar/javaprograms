package exceptionsample;

public class StringIndexEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		String s ="hi how are you";
		char a = s.charAt(15);
       System.out.println(a);
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println(" StringIndexOutOfBoundsException");
	}

	}
}
