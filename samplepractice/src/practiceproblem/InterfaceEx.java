package practiceproblem;


interface Student{
	static final int a =10;
	void score();
}

class Ram implements Student{
	public void score() {
		System.out.println("Ram is state level score");
	}
}
class Sita implements Student{
	public void score() {
		System.out.println("Sita is School level first");
	}
}


public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ram r = new Ram();
		Sita s = new Sita();
		System.out.println(s.a);
		r.score();
		s.score();
		
	}

}
