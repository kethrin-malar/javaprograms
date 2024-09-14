package seppractice;

public class VariableEx {
	int a;
	String name;
	
	public VariableEx(int a, String name) {
		this.a=a;
		this.name=name;
		
	}
	
	public void display() {
		System.out.println("a:" + a);
		System.out.println("name:" + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableEx o = new VariableEx(10,"malar");
		o.display();
	}

}
