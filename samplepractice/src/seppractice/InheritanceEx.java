package seppractice;


class Department{
	public void activityDep() {
		System.out.println("Hi");
	}
}

class CSE extends Department{
	public void staffActivity() {
		System.out.println("heloo");
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  CSE c = new CSE();
  c.staffActivity();
  c.activityDep();
	}

}
