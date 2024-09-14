package practiceproblem;

public class NumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=Integer.parseInt("hi");
			System.out.println(a);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
