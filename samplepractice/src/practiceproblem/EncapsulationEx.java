package practiceproblem;

class University{
	private int id ;
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
		// TODO Auto-generated method stub
		University u = new University();
		u.setId(1234);
		u.setName("Anna university");
		System.out.println(u.getId()+" "+u.getName());
	}

}
