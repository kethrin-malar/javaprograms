package practiceproblem;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] a = new int[5];
			a[5]=10;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

}
