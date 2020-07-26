package aa;
// Q:  / SQ: 127
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class A03LocalDate {

	public static void main(String[] args) {

		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);
		
	}

}

/*
	What is the result?
	A. May 04, 2014T00:00:00.000
	B. 2014-05-04T00:00: 00. 000
	C. 5/4/14T00:00:00.000
	D. An exception is thrown at runtime.


 	outp: Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
 	Ans: D. An exception is thrown at runtime.


	.parse() demek yani,() icindekini parca parca yapip veriyor.  

*/