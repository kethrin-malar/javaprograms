package seppractice;


class Hospital{
	int number;
	String dept;
	

public Hospital(int number,String dept) {
	this.number=number;
	this.dept=dept;
	
}
public Hospital(Hospital h) {
	this.number=h.number;
	this.dept=h.dept;
}

void print() {
	System.out.println(number + " "+dept);
}
}

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital h = new Hospital(1234,"Hardiology");
		Hospital h2 = new Hospital(h);
		h.print();
		h2.print();
		
	}

}
