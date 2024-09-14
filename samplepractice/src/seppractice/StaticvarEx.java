package seppractice;


public class StaticvarEx {
	int a;
	String name;
	
	static String dept="CSE";
	
	public StaticvarEx(int a, String name) {
		this.a=a;
		this.name=name;
		
		
	}
	
	public void display() {
		System.out.println("a:" + a);
		System.out.println("name:" + name);
		System.out.println("dept:" + dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticvarEx o = new StaticvarEx(10,"malar");
		
		//Modify static variable
		//StaticvarEx.dept="ECS";
		
		o.display();
	}

}
