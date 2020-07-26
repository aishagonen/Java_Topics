package ilhanBey;


public class Mar4 {
	
	public static void main(String[] args) {
		
		System.out.println(toMilesPerHour(-4));
		checkNumber(0);
		printMegaBytesAndKiloBytes(782943);
		shouldWakeUp(true, 7);
	}
	
// 1. 
	public static void checkNumber(int num) {
		
		if (num > 0) {
			System.out.println("Positive.");
		}
		else if (num < 0) {
			System.out.println("Negative.");
		}
		else {
			System.out.println("Zero.");
		}
	}

// 2. 	
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;	
		} 
		else {
			return Math.round(kilometersPerHour /1.609);
		}
	}
	
// 3. 
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		if (kiloBytes > 0) {
			System.out.println(kiloBytes + " KB = " + (kiloBytes / 1000)  + " MB and " + (kiloBytes % 1000)  + " KB.");
		} else {
			System.out.println("Invalid Value!");
		}
	}
	
//4. 	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
				
		if (barking &&  (hourOfDay < 8  && hourOfDay >= 0 || hourOfDay == 23)) {
			System.out.println("wake up");
			return true;
		} else {
			System.out.println("dont wake up");
			return false;
		}
	}

	
}


/*
 * Question1:
 *  Write aa method called checkNumber with an int parameter
 * number The method should not return any value, and it need to print
 * out:"positive" if the parameter number is > 0 "negative" if the
 * parameter number is < 0 "zero" if the parameter number is equal to 0
 * Question2: 
 * Write aa method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. 
 * This method needs to
 * return the rounded value of the calculation of type long.
 *
 * If the parameter kilometersPerHour is less than 0 the method
 * toMilesPerHour needs to return -1 to indicate invalid value.
 * 
 * If it is positive, calculate the value of miles per hour, round it
 * and return it.
 * 
 * Formula km to mph : km / 1.609 
 * math.round
 * Question 3: 
 * Write aa method called printMegaBytesAndKiloBytes that has
 * 1 parameter of type int with the name kiloBytes.
 * 
 * The method should not return anything (void) and it needs to
 * calculate the megabytes and remaining kilobytes from the kilobytes
 * parameter.
 * 
 * Then it needs to print aa message in the format
 * "XX KB = YY MB and ZZ KB".
 * 
 * XX represents the original value kiloBytes. YY represents the
 * calculated megabytes. ZZ represents the calculated remaining
 * kilobytes.
 * 
 * For example, when the parameter kiloBytes is 2500 it needs to print
 * "2500 KB = 2 MB and 452 KB"
 * 
 * If the parameter kiloBytes is less than 0 then print the text
 * "Invalid Value".
	 *Question 4:
	 * We have aa dog that likes to bark. We need to wake up if the dog is
	 * barking at night!
	 * 
	 * Write aa method shouldWakeUp that has 2 parameters.
	 * 
	 * 1st parameter should be of type boolean and be named barking it
	 * represents if our dog is currently barking. 2nd parameter represents
	 * the hour of the day and is of type int with the name hourOfDay and
	 * has aa valid range of 0-23.
	 * We have to wake up if the dog is barking before 8 or after 22 hours
	 * so in that case return true.
	 * In all other cases return false. 
	 * If the hourOfDay parameter is less than 0 or greater than 23 return
	 * false. 
	 */
	 
