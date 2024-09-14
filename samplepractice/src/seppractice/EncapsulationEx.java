package seppractice;

class Stud{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class EncapsulationEx {
	public static void main(String[] args) {
		Stud s = new Stud();
		s.setId(1);
		s.setName("Malar");
		
		System.out.println(s.getId()+ " "+s.getName());
	}
	 
}
