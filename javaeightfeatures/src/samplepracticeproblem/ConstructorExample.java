package samplepracticeproblem;

class Example {

	String name;
	int age;

	/*public Example(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Example(String name) {
		this.name = name;
		
	}

	public Example(Example e) {
		this.name = e.name;
		this.age = e.age;
	}*/
	

	void display() {
		System.out.println(name + " " + age);

	}
}
  public class ConstructorExample{
	  public static void main(String args[]) {
  
		/*Example obj1 = new Example("Malar", 12);
		Example obj2 = new Example(obj1);
		Example obj = new  Example("Malar");
		Example obj3 = new Example(obj);
		obj1.display();
		obj2.display();
		obj.display();
		obj3.display();*/
		  
		Example obj1 = new Example();
		  obj1.display();


	}
}
  

