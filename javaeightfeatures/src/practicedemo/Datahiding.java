package practicedemo;



class College1{
	//private int id;
	//private String collegename;
	
	int id;
	String collegename;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	
}
public class Datahiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 College1 c = new College1();
 
 //c.setId(1);
 //c.setCollegename("Psna");
 
 c.id=1;
 c.collegename="Psna";
 
 System.out.println(c.getId()+" "+c.getCollegename());
 
 
	}

}
