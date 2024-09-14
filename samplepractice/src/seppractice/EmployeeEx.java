package seppractice;

class Emp {
	int id;
	String empName;
	Address address;

	public Emp(int id,String empName,
	Address address) {
		this.id = id;
		this.empName = empName;
		this.address = address;

	}

	void display() {
		System.out.println(id +" "+ empName);
		
		System.out.println(address.doorno+ " "+ address.streetName);
	}
}

public class EmployeeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address(47,"velachery");
		Address a1 = new Address(46,"chennai");
		
		Emp e = new Emp(1,"rohit",a);
		Emp e1 = new Emp(2,"john",a1);
		
		e.display();
		e1.display();
	}

}
