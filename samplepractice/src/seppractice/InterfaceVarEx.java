package seppractice;


interface A{
	static final int hos_id=123;
	
	void display();
}

class clinic implements A{
	
	public void display() {
		System.out.println("hospital id:"+ hos_id);
	}
	
}

public class InterfaceVarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		clinic h = new clinic();
		h.display();

	}

}
