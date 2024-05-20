package datetimeapi;

import java.time.*;  

public class MonthDayExample {
	public static void main(String[] args) {  
	    MonthDay month = MonthDay.now();  
	    
	    LocalDate date = month.atYear(2024);  
	    System.out.println(date);  
	    
	    MonthDay monthDay = MonthDay.of(Month.FEBRUARY, 28);
	    boolean b = monthDay.isValidYear(2019);  
	    System.out.println(b); 
	  }  
	}  


