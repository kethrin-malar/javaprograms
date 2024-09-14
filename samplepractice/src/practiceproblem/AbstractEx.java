package practiceproblem;

abstract class College{
	abstract void printClgName();
}

class College1 extends College{
	public void printClgName() {
		System.out.println("PSNA");
	}
}


class College2 extends College{
	public void printClgName() {
		System.out.println("SRM");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College1 c1 = new College1();
		College2 c2 = new College2();
		c1.printClgName();
		c2.printClgName();
	}

}
