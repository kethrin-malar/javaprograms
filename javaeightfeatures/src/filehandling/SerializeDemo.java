package filehandling;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;
//memory dump from ram to rom when ram goes down we transfer to rom for cache 
class EmployeeSer implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private int id;
	private double salary;

	public EmployeeSer(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", id=" + id + ", salary=" + salary + '}';
	}
}

public class SerializeDemo {
	public static void main(String[] args) {

		// to Serialiser

//		 EmployeeSer employee = new EmployeeSer("Karthick", 12345, 75000.0);
//		 String filePath = "D:Serialize.ser";
//		
//		 try (FileOutputStream fileOut = new FileOutputStream(filePath);
//		 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
//		 out.writeObject(employee);
//		 System.out.println("Serialized data is saved in Serialize.ser");
//		 } catch (IOException i) {
//		 i.printStackTrace();
//		 }
//		 }
//		 

		// to DeSerialiser

		
        EmployeeSer employee = null;
		String filePath = "D:Serialize.ser";

		try (FileInputStream fileIn = new FileInputStream(filePath);
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			employee = (EmployeeSer) in.readObject();
		} catch (IOException | ClassNotFoundException i) {
			i.printStackTrace();
		}

		if (employee != null) {
			System.out.println("Deserialized Employee...");
			System.out.println("Name: " + employee.getName());
			System.out.println("ID: " + employee.getId());
			System.out.println("Salary: " + employee.getSalary());
		}
	}
}
