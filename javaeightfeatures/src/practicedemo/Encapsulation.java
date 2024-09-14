package practicedemo;

public class Encapsulation {
	
	private int id;
	private String dept;
	private String Collegename;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCollegename() {
		return Collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	




public static void main(String[] args) {
	Encapsulation e = new Encapsulation();
	e.setId(1);
	e.setDept("CSE");
	e.setCollegename("psna");
	
	System.out.println(e.getId()+" "+e.getDept()+" "+e.getCollegename());
}
	
}
