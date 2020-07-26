

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		
// ***********************************
		
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
		
// **************		************		***********
// This is teacher's way for  same question:
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many miles did you make?");
		int miles = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Is it Rush Hour ? (Answer yes or no)");
		String answer = scanner.nextLine();
		
		
		//boolean rushHour = answer.equalsIgnoreCase("yes");
		
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
//		
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
		
// *********   *********** 	******************		
		
		
	}

}
