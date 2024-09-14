package exceptionsample;

public class NumberFormatEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = Integer.parseInt("akki");
			System.out.println(a);
		}catch(NullPointerException e) {
			System.out.println();
		}

	}

}
