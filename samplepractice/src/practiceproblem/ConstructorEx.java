package practiceproblem;

class Flower{
	String Flowername;
	String Gardenname;


public Flower(String Flowername,String Gardenname) {
	this.Flowername=Flowername;
	this.Gardenname=Gardenname;
}


public Flower(Flower f) {
	this.Flowername=f.Flowername;
	this.Gardenname=f.Gardenname;
}

void display() { 
	System.out.println(Flowername+" "+Gardenname);
} 
}

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f = new Flower("Rose","ooty");
		f.display();
		Flower f1 = new Flower(f);
		f1.display();
		
	}

}
