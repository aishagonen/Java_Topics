package ifElses;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		
		
		
		
		
		

//**************************************************************		
// 1. only one block is going to work
// 2. first true condition block is going to work 
// 3. if no condition is true, else is going to work
// 4. else block doesn't have condition
        int x = 90;
        
        if (false) {
            x = 100;
        }
        else if (9 == 8 || 6<9) {
            x = 102;
        }
        else{
            x = 101;
        }
		
//**************************************************************	

		int age = 18;
		int weight = 60;
		
		if (age>18) {
			if (weight >50) {
			System.out.println("You can donate blood.");
			} else {
			System.out.println("You need to be over 50 kg.");
			} 
		}else if (age < 18 && weight < 60) {
				System.out.println("Your age and yor weight is not enough.");
			}
		else {
			System.out.println("You need to be older than 18.");
		}
		
//**************************************************************	
// Grade: 
		
		int grade = 101;
		
		if (grade > 100) {
			System.out.println("Invalid grade!");
		}
		else if (grade > 90) {		
			System.out.println("Your grade is A ");
		}
		else if (grade > 80){
			System.out.println("Your grade is B ");
		}
		else if (grade > 70) {
			System.out.println("Your grade is C ");
		}
		else if (grade > 60) {
			System.out.println("Your grade is D ");
		}
		else if (grade >= 0){
			System.out.println("Your grade is F. You failed!");
		}
		else if (grade < 0) {		
			System.out.println("Invalid grade!");
		}
		else {
			
		}
		
		
// **************************************************************	
		
// If-else: true-false
		
		String username = "charliebrown";
		boolean myVariable =username.equals("charliebrown");
		
		if (myVariable) {
			System.out.println("Hello from inside of the if block.");
		} else {
			System.out.println("Bye from inside  of the else statement.");
		}	
// Condition true ise if statement; false ise else runs.  
		
// **************************************************************
		
// Positive or negative:		
	
		int num = 0; // -7 etc. but, 0 is not negative or positive. so we write else if condition.
		
		if (num > 0) {
			System.out.println(num + " is positive + !");
		} 
		else if (num == 0) {
			System.out.println("Number is Zero 0!");
		}
		else {
			System.out.println(num + " is negative - !");
		}
		
// **************************************************************
		
// Grades:
		 
		int m;
		int f;
		double g;
		
		System.out.println("Enter midterm grade: ");
		m = kb.nextInt();
		
		System.out.println("Enter final grade: ");
		f = kb.nextInt();
		
		g = (m * 0.4) + (f * 0.6);
		
		
		if (g>=50) {
			
			System.out.println("Your grade is: " + g +". You passed!");
		}
		
		else {
			System.out.println("Your grade is: " + g +". You failed!");
		}


// **************************************************************	
		
// Password: 
		
		String password = "let me in";
		System.out.println("Guess the password: ");
		
		String guess = kb.nextLine();
		
		//System.out.println(password.equals(guess));
		
		if (password.equals(guess)) {
		//if (password.toLowerCase().equals(guess.toLowerCase())) //Eger sadece kucuk harf olmasi gerekirse '.toLowerCase.' eklemek gerek.
			System.out.println("Password is correct.");
			//return; //'return' yazarsan devam etmez, sonrakileri okumaz, yani burada kalir.
		}
			else if ("password".equals(guess)) {
				System.out.println("You got the second password.");
			}
		
		else {
			System.out.println("Wrong password.");
		}
		
		System.out.println("Going to run."); //if ya da else hangisi olursa olsun bunu da sonunda yazar. 
		//Cunku bracelerin disinda yazilmis. Ama yukariya 'return' yazarsan burayi okumaz.
		
		
// **************************************************************		
		
// Create a calculator with if-else statements:
		
		System.out.println("Please enter first number: ");
		int n1 = kb.nextInt();
		
		System.out.println("Please enter second number: ");
		int n2 = kb.nextInt();
		
		System.out.println("Please enter operation sign: ");
		char opr = kb.next().charAt(0);
		
		if (opr == '+') {
			System.out.println(n1 + n2);		
		} else if (opr == '-') {
			System.out.println(n1 - n2);
		} else if (opr == '*') {
			System.out.println(n1 * n2);
		} else if (opr =='/') {
			System.out.println((double) n1 / n2);
		//} else if (opr  != charAt, n1 && n2 != Integer) {
			System.out.println("invalid");
		}
		
// ***********************************
//  Calculate the cost of toll: 
// 1. Way:		
		System.out.println("How many miles you made: ");
		int miles = kb.nextInt();
		
		System.out.println("Is it in normal hours or rush hours? [N or R]: ");
		String hours = kb.next();
		
		if (hours.equalsIgnoreCase("N")) {
			if( miles > 0 && miles <= 100) {
				System.out.println("Your toll price is $5.");
			}else if (miles > 101 && miles <= 500) {
				System.out.println("Your toll price is $8.");
			}else if (miles > 501 && miles <= 1000) {
				System.out.println("Your toll price is $10.");
			}else if (miles >  1001) {
				System.out.println("Your toll price is $12.");
			}
		}else {
			if (hours.equalsIgnoreCase("R")) {
				if( miles > 0 && miles <= 100) {
					System.out.println("Your toll price is $10.");
				}else if (miles > 101 && miles <= 500) {
					System.out.println("Your toll price is $17.");
				}else if (miles > 501 && miles <= 1000) {
					System.out.println("Your toll price is $20.");
				}else if (miles >  1001) {
					System.out.println("Your toll price is $24.");
				}
			}
		}
		
// ************************************
// 2. Way:  This is teacher's way:
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many miles did you make?");
		int miles = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Is it Rush Hour ? (Answer yes or no)");
		String answer = scanner.nextLine();
		
		
		boolean rushHour = answer.equalsIgnoreCase("yes");
		
		int totalCost;
		
		if (miles > 0 && miles <= 100) {
			if (answer.equalsIgnoreCase("yes")) {
				totalCost = 10;
			}else {
				totalCost = 5;
			}
		}else if (miles > 101 && miles <=500) {
			if (answer.equalsIgnoreCase("yes")) {
				totalCost = 17;
			}else {
				totalCost = 8;
			}
		}else if (miles > 501 && miles <= 1000) {
			if (answer.equalsIgnoreCase("yes")) {
				totalCost = 20;
			}else {
				totalCost = 10;
			}
		}else { //More than 1000
			if (answer.equalsIgnoreCase("yes")) {
				totalCost = 24;
			}else {
				totalCost = 12;
			}
		}
		
		System.out.println("Your total cost is : " + totalCost);

		
// ***********************************
		
// Create a program to check whether triangle is equilateral, scalene or isosceles:
		int a;
		int b;
		int c;  // bunlarin basina int'i basta da yazip declare edebilirsin, ya da buraya yazmazsin,asagida baslarina int eklersin. 
	
		System.out.println("Enter side a: ");
		int a = kb.nextInt();
		
		System.out.println("Enter side b: ");
		int b = kb.nextInt();
		
		System.out.println("Enter side c: ");
		int c = kb.nextInt();
		
// Hoca yukaridakileri boyle yazmayi tercih etti.
		
			System.out.println("Please put all the three numbers of the triangle");
			int side1, side2, side3;
			side1 = kb.nextInt();
			side2 = kb.nextInt();
			side3 = kb.nextInt();
			
// Yani boyle de olabilir:devami asagida ayni.		
		
		
		if (a==b  && b==c) {
			System.out.println("This is an equilateral triangle. ");
		} else if (a==b ||a==c || b==c) {
			System.out.println("This is an isosceles triangle.");
		} else {
			System.out.println("This is a scalene triangle.");
		}
				
//***********************************	

// Finding the oldest age in three age:
		
		System.out.println("Please enter  first age: ");
		int age1 = kb.nextInt();
		
		System.out.println("Please enter second age: ");
		int age2 = kb.nextInt();
		
		System.out.println("Please enter third age: ");
		int age3 = kb.nextInt();
		

		if (age1 > age2  && age1 > age3) {
			System.out.println(age1 + " is the oldest age.");
		} else if (age2 > age1  && age2 > age3){
			System.out.println(age2 + " is the oldest age.");
		}else if (age3 > age1  && age3 > age2){
			System.out.println(age3 + " is the oldest age.");
		} else { 	// (age1 == age2  && age2 == age3)
			System.out.println("You are all the same age! ");
		}
		
//***********************************
		
// Write a program called CheckClass : 		
// 
// 1. way:
		System.out.println("Please enter number of the day: ");
		int day= kb.nextInt();
		
		if (day ==  1) {
			System.out.println(day + ". day is Monday and assigned for Math class.");
		} else if (day ==2){
			System.out.println(day + ". day is Tuesday and assigned for Java class.");
		} else if (day == 3) {
			System.out.println(day + ". day is Wednesday and assigned for Python class.");
		} else if (day == 4){
			System.out.println(day + ". day is Thursday and  assigned for SQL class.");
		} else if (day == 5) {
			System.out.println(day + ". day is Friday and assigned for C# class.");
		} else {
			System.out.println("You do not have any class.");
		}
//
// ***********************************
// 2. Way: 	Hoca'nin yazdigi.	
		
		System.out.println("Enter a day");
		int day = kb.nextInt();
		String classAtSchool = "";
		String weekDay = "";
		
		if (day == 1) {
			classAtSchool = "Java";
			weekDay = "Monday";
		}else if (day == 2) {
			classAtSchool = "Python";
			weekDay = "Tuesday";		
		}else if (day == 3) {
			classAtSchool = "SQL";
			weekDay = "Wednesday";
		}else if (day == 4) {
			classAtSchool = "Calculus II";
			weekDay = "Thursday";
		}else if (day == 5) {
			classAtSchool = "Business";
			weekDay = "Friday";
		}else if (day == 6) {
			classAtSchool = "No Class";
			weekDay = "Saturday";
		}else {
			classAtSchool = "No Class";
			weekDay = "Sunday";
		}
		
		System.out.println("Day of the week : " + weekDay + "\n" +"Class at school : " +classAtSchool);
	
// *********   *********** 	******************
// 3. Way: 
		
		System.out.println("Please enter number of the day: ");
		int day= kb.nextInt();
		
		switch (day) {
			case 1:
				System.out.println(day + ". day is Monday and assigned for Math class.");
				break;
			case 2: 
				System.out.println(day + ". day is Tuesday and assigned for Java class.");
				break;
			case 3: 
				System.out.println(day + ". day is Wednesday and assigned for Python class.");
				break;
			case  4: 
				System.out.println(day + ". day is Thursday and  assigned for SQL class.");
				break;
			case 5: 
				System.out.println(day + ". day is Friday and assigned for C# class.");
				break;
			default: 
				System.out.println("You do not have any class today. ");
				break;
		}
		
// **************************************		
	
// Create a program and buy apples, carrots and tomatoes:		
// 1. Way: Short way: 
		
		double apple = 3.99;
		double carrot = 0.99;
		double tomato = 1.59;
		double taxRate = 0.06;
		double cost;
		double totalPrice;
		double itemPrice=0;
		
		System.out.println("Enter wight of product [kg]: ");
		double weightItem = kb.nextDouble();
				
		System.out.println("Enter name of product [A, C, T]: ");
		String  itemName = kb.next();	
		
			
		switch (itemName.toUpperCase()) {
		case "A": 
			itemPrice = apple;
			break;
		case "C": itemPrice = carrot;	
		break;
		case "T": itemPrice = tomato;	
		break;
		default:
			break;
		}
		cost = itemPrice * weightItem;
		totalPrice =  cost + (cost * 0.06);	
		System.out.printf("Total price without tax is: $%.2f\n", cost);
		System.out.printf("Total price with tax is: $%.2f\n", totalPrice );

// **************************************	
// 2. Way: Long way:
		
		double apple = 3.99;
		double carrot = 0.99;
		double tomatoes = 1.59;
		double taxRate = 0.06;
		double cost;
		double totalPrice;
		
		System.out.println("Enter wight of product [kg]: ");
		double weightItem = kb.nextDouble();
		
		System.out.println("Enter name of product [A, C, T]: ");
		String  product = kb.next();
		
		if (product.equalsIgnoreCase("A")) {
			System.out.println("For " + weightItem + " kg apples; ");
			cost = apple * weightItem;
			totalPrice = cost + (cost * 0.06);
			
			System.out.println("Total price without tax is: $ " + cost);
			System.out.println("Total price with tax is: $ " + totalPrice );
		} else if (product.equalsIgnoreCase("C")) {
			System.out.println("For " + weightItem + " kg carrots; ");
			cost = carrot * weightItem;
			totalPrice = cost + (cost * 0.06);
			
			System.out.println("Total price without tax is: $ " + cost);
			System.out.println("Total price with tax is: $ " + totalPrice );
		} else if (product.equalsIgnoreCase("T")) {
			System.out.println("For " + weightItem + " kg tomatoes; ");
			cost = tomatoes * weightItem;
			totalPrice = cost + (cost * 0.06);
			
			System.out.println("Total price without tax is: $ " + cost);
			System.out.println("Total price with tax is: $ " + totalPrice );
		}
		System.out.println("\nThank you for shopping! ");
		
// **************************************		
//  Create a program as price checker:
			
			System.out.println("Enter the  price: $ " );
			int price = kb.nextInt();
			
			if (price < 25 ) {
				System.out.println("The price is cheap and buy it!");
			} else if (price >= 26 && price < 100) {
				System.out.println("The price is expensive!");
			} else {
				System.out.println("Go home!");
			}

// **************************************				
//  Create a voting eligibility program:
			
		System.out.println("Enter your age: ");
		int age4 = kb.nextInt();

		if (age4 > 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote");
		}

// **************************************				
/* Conditions 1:
 * FIZZBUZZ
 * if number is divisible by 3 (no remainder) print FIZZ
 * if number is divisible by 5 (no remainder) print BUZZ
 * if number is divisible by 5 and 3 (no remainder) print FIZZBUZZ
 * else print number itself
 * 
 */
		int number = 15; // 22,20,etc. try numbers 
		
		if (number % 3 == 0 && number % 5 == 0){
			System.out.println("FIZZBUZZ");
		}else if (number % 3 == 0){
			System.out.println("FIZZ");
		}else if (number % 5 == 0){
			System.out.println("BUZZ");
		}else{
			System.out.println(number);
		}
// ***********************************************************************	
/* Conditions 2:
 * Online store
 * price, speed
 * 
 * Regular Shipping Rates
 * Purchase Price      cost
 * 1 - 100              17
 * 101 - 300            10
 * 300+                 free
 * 
 * Express Shipping
 * Purchase Price       cost
 * 1 - 100              35
 * 101 - 300            25
 * 300+                 15
 * 
 * 
 */
// Nested if === if == inside if statement we have another if statement

		int shippingMode = 1; // 2 for express
		double purchasePrice = 250;
		double shippingCost = 0.0;
		
		if (shippingMode == 1){
			System.out.println(" ----Regular Shipping-----");
			if(purchasePrice >=1.0 && purchasePrice <= 100.0){
				shippingCost = 17.0;
			}else if (purchasePrice > 100.0 && purchasePrice <= 300.0){
				shippingCost = 10.0;
			}else if( purchasePrice > 300.0){
				shippingCost = 0.0;
			}
	
		}else if (shippingMode == 2){
			System.out.println(" ----Express Shipping-----");
			if(purchasePrice >=1.0 && purchasePrice <= 100.0){
				shippingCost = 35.0;
			}else if (purchasePrice > 100.0 && purchasePrice <= 300.0){
				shippingCost = 25.0;
			}else if( purchasePrice > 300.0){
				shippingCost = 15.0;
			}
		}
		
       System.out.println("Total shipping cost: "+ shippingCost);

// ***********************************************************************			

			
			
			
			
			
			
			
			
			
			
			
			
	}

}
