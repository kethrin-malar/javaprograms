package practicedemo;



class Employee{
	int id;
	String name;
	Address address;
	
	public Employee(int id,String name,Address address) {
		this.id = id;
		this.name = name;
		this.address=address;
		
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.doorno+" "+address.place);
	}
}

public class AggregationSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a = new Address(12,"Dindigul");
		Address a1 = new Address(16,"Chennai");
		
		
		Employee e = new Employee(1,"malar",a);
		Employee e1 = new Employee(2,"Reena",a1);
		e.display();
		e1.display();
		

	}

}
