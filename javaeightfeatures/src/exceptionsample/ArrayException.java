package exceptionsample;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  int[] a = new int[10];
    	  a[9]=10;
      }catch(ArrayIndexOutOfBoundsException e) {
    	  System.out.println("error");
      }
	}

}
