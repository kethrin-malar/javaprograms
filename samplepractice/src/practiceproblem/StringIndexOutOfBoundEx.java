package practiceproblem;

public class StringIndexOutOfBoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s="hi hello";
			System.out.println("result:"+ s.charAt(8));
		}
		catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
					}

	}

}
