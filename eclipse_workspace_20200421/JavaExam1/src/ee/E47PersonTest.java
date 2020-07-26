package ee;
// Lambda ile ilgili soru. 
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class E47PersonTest {

	public static void checkAge(List<E47Person> list,Predicate<E47Person> predicate ) {
		for (E47Person p : list) {
			if (predicate.test(p)) {
				System.out.println(p.name + " ");
			}
		}	
	}

	public static void main(String[] args) {

		List<E47Person> iList = Arrays.asList(new E47Person ("Hank", 45),
										   new E47Person ("Charlie", 40),
										   new E47Person ("Smith", 38));
		// line n1								  
										  
										  
	}
}

// Outp: checkAge(iList, p -> p.getAge() > 40);


