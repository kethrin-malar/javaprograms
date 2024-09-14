package advancedconcept;


enum Days{
  	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,FRIDAY,SATURDAY;
}

public class Enumsample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Days obj = Days.MONDAY;
		//System.out.println(obj);
		
		switch(obj) {
		
		case SUNDAY:
			System.out.println("sunday");
			break;
		}
		
		Default:
			System.out.println("no days");
			

	}

}
