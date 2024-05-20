package datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateExample1 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = yesterday.plusDays(2);
		//LocalDateTime datetime = date.atTime(1,50,9);  
		//LocalDateTime datetime = yesterday.atTime(1,50,9);  
		LocalDateTime datetime = tomorrow.atTime(1,50,9);  
	    
		System.out.println("Today date: " + date);
		System.out.println("Yesterday date: " + yesterday);
		System.out.println("Tomorrow date: " + tomorrow);
		
		 System.out.println(datetime);  
	}
}
