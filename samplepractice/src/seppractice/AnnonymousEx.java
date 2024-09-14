package seppractice;


abstract class Phone{
	abstract void show();
}



public class AnnonymousEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone() {
			public void show() {
				System.out.println("hi");
		}
	};
	p.show();
}

}
