package dd;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class D35LocalDate123 {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014,6,20);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		LocalDate date4 = LocalDate.parse("2014,03,12", DateTimeFormatter.ISO_DATE);
		
		System.out.println("date1= "+ date1);
		System.out.println("date2= "+ date2);
		System.out.println("date3= "+ date3);
		System.out.println(date4);
	}

}


/*
	Answ: 	date1= 2020-04-17
			date2= 2014-06-20
			date3= 2014-06-20
			
			
			

*/