package practiceproblem;

public class NullpointerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;
			System.out.println("Result:"+ s.charAt(0));
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}

	}

}
