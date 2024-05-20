package basicprogram;

public class Finalvariable {

	 final int speedlimit=0;// final variable

	void run() {
		int speedlimit=70;  
		  System.out.println(speedlimit);  
		
	}

	public static void main(String args[]) {
		Finalvariable obj = new Finalvariable();
		obj.run();
	}
}
