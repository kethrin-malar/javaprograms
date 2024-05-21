package thread;

public class StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java";
//it will throw java.lang.StringIndexOutOfBoundsException because at position 4 no char is not present.
		//System.out.println("Printing the char at position 4  : " + s.charAt(3)); 
		
		System.out.println("Printing the char at position 4  : " + s.charAt(4)); 
	}

}
