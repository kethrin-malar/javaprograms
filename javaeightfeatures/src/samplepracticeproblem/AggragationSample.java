package samplepracticeproblem;

public class AggragationSample {
	int id;
	String name;
	Address address;

	public AggragationSample(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.place + " " + address.doorno);
	}

	public static void main(String[] args) {
		Address obj = new Address("Chennai", 4);
		Address obj1 = new Address("Madurai", 2);

		AggragationSample emp = new AggragationSample(21, "Malar", obj);
		AggragationSample emp1 = new AggragationSample(22, "reena", obj1);
		emp.display();
		emp1.display();

	}

}
