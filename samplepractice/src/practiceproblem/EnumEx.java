package practiceproblem;

enum Colour {
	BLACK, RED, WHITE;
}

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colour c = Colour.WHITE;

		switch (c) {
		case WHITE:
			System.out.println("WHITE colour");
			break;
		case RED:
			System.out.println("RED colour");
            
	    default: 
	    	System.out.println("other colour");
		}
	}

}
