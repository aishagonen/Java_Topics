import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
//*********************************************

// Difference between switch-case and if-else:
// 1) i have option to excited the codes in different blocks
// 2) instead of conditions, switch case blocks use value equality
        
		int y = 8; // key 
        
        switch (y){ // y = key
        case 1 : // value = 1
            System.out.println("This is case 1");
            break;
        case 2 : // value = 2
            System.out.println("This is case 2");
            break;
        case 3 : // value = 3
            System.out.println("This is case 3");
            break;
        default: // 
            //System.out.println("No values were equal to keys");
        }
        
//*************************************************		        
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("What is the day : ");
      String key = scanner.nextLine();
      
      switch (key) {
      case "monday":
          System.out.println("This is monday");
          //break;
      case "tuesday":
          System.out.println("This is tuesday");
          //break;
      case "wednesday":
          System.out.println("This is wednesday");
          //break;

      default:
          System.out.println("This is not the first 3 days of the week");
          
      }
        
//*************************************************	
// key 'y' oldugu icin oraya kadar break koymaya gerek gormedi. ama eger 'z' olsaydi break koymaliydi. 	
     
        char charKey = 'Y';
        
        switch (charKey) {
        case 'Z':
            System.out.println("Key is Z");
            
        case 'Y':
            System.out.println("Key is Y");
            
        case 'A':
            System.out.println("Key is A");
            break;
        default:
            System.out.println("This is the default");
            
        }

		
// ******************************************

// Day of the week:
// 1.Yontem: ama bu cok uzun, 2. yontemde bunun yerine Switch kullanicaz.		
		
	int day = 3;
	
	if (day == 1) {
		System.out.println("Monday");
		}
		else if (day == 2) {
			System.out.println("Tuesday");
		}
		else if (day == 3) {
			System.out.println("Wednesday");
		}
		else if (day == 4) {
			System.out.println("Thursday");
		}
		else if (day == 5) {
			System.out.println("Friday");
		}
		else if (day == 6) {
			System.out.println("Saturday");
		}
		else if (day == 7) {
			System.out.println("Sunday");
		}
		
// ********************************************	
		
// 2. Yontem:	
		
		int day1 = 8;
		
		switch (day1) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Not a valid day number.");
				break;
		}

// **********************************************
		
// Write a program called CheckClass :
		
		System.out.println("Please enter number of the day: ");
		String day2 = kb.nextLine();
		
		switch (day2) {
			case "1":
				System.out.println(day2 + ". day is Monday and assigned for Math class.");
				break;
			case "2": 
				System.out.println(day2 + ". day is Tuesday and assigned for Java class.");
				break;
			case "3": 
				System.out.println(day2 + ". day is Wednesday and assigned for Python class.");
				break;
			case  "4": 
				System.out.println(day2 + ". day is Thursday and  assigned for SQL class.");
				break;
			case "5": 
				System.out.println(day2 + ". day is Friday and assigned for C# class.");
				break;
			default: 
				System.out.println("You do not have any class today. ");
				break;
		}	
		
// ******************************************
		System.out.println("Enter your grade");
		String userGrade = kb.nextLine();
		
		switch(userGrade){
		
		case "A":
			System.out.println("Distinction");
			break;
		case "B":
			System.out.println("Perfect");
			break;
		case "C":
			System.out.println("Good");
			break;
		default :
			System.out.println("Fail");
			break;
		}
       
// ***********************************************************************			
     		
		System.out.println("*******************************");
		
		String mathOperators = " 1. Addition \n"
				                +"2. Subtraction \n"
				                +"3. Multiplication \n"
				                +"4. Division";
		
		System.out.println(mathOperators);
		
		System.out.println("*********************************");
		
		System.out.println("Please enter math operator");
		
		String operators = scanner.nextLine();
		
		int a;
		int b;
		
		switch (operators){
		case "1":
			System.out.println("Enter first number");
			a = scanner.nextInt();
			System.out.println("Enter second number");
			b = scanner.nextInt();
			System.out.println("Addition: "+ (a+b));
			break;
		case "2":
			System.out.println("Enter first number");
			a = scanner.nextInt();
			System.out.println("Enter second number");
			b = scanner.nextInt();
			System.out.println("Subtraction: "+ (a-b));
			break;
		case "3":
			System.out.println("Enter first number");
			a = scanner.nextInt();
			System.out.println("Enter second number");
			b = scanner.nextInt();
			System.out.println("Multiplication: "+ (a*b));
			break;
		case "4":
			System.out.println("Enter first number");
			a = scanner.nextInt();
			System.out.println("Enter second number");
			b = scanner.nextInt();
			System.out.println("Division: "+ (a/b));
			break;	
		default:
			System.out.println("invalid input");
		}
		
// ***********************************************************************			
		
		System.out.println("Enter a value between 1-4");
		int homework = kb.nextInt();
		
		switch (homework){
		case 1 :
			System.out.println("Essay is written");
			break;
		case 2 :
			System.out.println("Reading is done");
			break;
		case 3 :
			System.out.println("Homework is submitted");
			break;
		case 4 :
			System.out.println(" Homework is done");
			break;
		default:
			System.out.println("invalid input");
		
		}
 
// ***********************************************************************			 	
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

// ***********************************************************************			 	


		
		
		
		
		
		
		
		
		
	}

}
