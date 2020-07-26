import java.time.LocalDate;
import java.time.Period;

public class AgeCalculates {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1983, 03, 22);
		int years = Period.between(birthday, today).getYears();
		
		System.out.println(today);
		System.out.println(birthday);
		System.out.println(years);
		
	}

}
