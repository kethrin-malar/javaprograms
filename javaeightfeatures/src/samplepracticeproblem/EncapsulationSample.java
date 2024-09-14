package samplepracticeproblem;

class College {
	private int id;
	private String studentname;
	private String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
public class EncapsulationSample {
	public static void main(String[] args) {
		College c = new College();
		c.setId(2);
		c.setStudentname("Malar");
		c.setDept("ECE");
		System.out.println(c.getId()+" "+c.getStudentname()+" "+c.getDept());
	}

}