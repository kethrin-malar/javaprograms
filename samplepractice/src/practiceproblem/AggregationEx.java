package practiceproblem;

class Employee{
	String Empname;
	int Empid;
	Address address;
	
	public Employee(String Empname,int Empid,Address address) {
		this.Empname = Empname;
		this.Empid =Empid;
		this.address =address;
	}
	
	
	void display() {
		System.out.println(Empname+" "+Empid);
		System.out.println(address.housenumber+" "+address.place);

	}
}

public class AggregationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a = new Address(12,"Dindigul");
		Address a1 = new Address(13,"Madurai");
		
		Employee e = new Employee("Malar",1234,a);
		Employee e1 = new Employee("Priya",5678,a1);
		
		e.display();
		e1.display();
		

	}

}
