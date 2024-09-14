package practicedemo;

//argument constructor
class College{
	public int id;
	public String collegename;
	
	public College(int id,String collegename) {
	  this.id = id;
	  this.collegename= collegename;
	}
	
	//copy costructor
	public College(College c) {
		  this.id = c.id;
		  this.collegename= c.collegename;
		}
	
	
	void display() {
		System.out.println(id+" "+collegename);
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College(21,"psna");
		College c1 = new College(c);
		c.display();
		c1.display();
		
		
	}

}

/*Default constructor
class College{
	int id;
	String collegename;
	
	
	void display() {
		System.out.println(id+" "+collegename);
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College();
		c.display();
		
		
	}

}*/
