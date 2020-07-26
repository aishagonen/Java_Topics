package newPack;

import java.util.Scanner;

public class ReviewQuest {
			
	public static void main(String[] args) { 
		
		Scanner kb = new Scanner(System.in);
		
		findMiddle("Mehmet");
		average();
		findSmallest();
		findVowel("ahmet");
		enterNumber();  // sonsuza kadar devam eder.
		quit();			// sonsuza kadar devam eder.
		
//***		
// bu kod 'Ahmet' yazana kadar calisir:
		boolean check = true;

		while (check) {
			System.out.println("What is your name " );
			String name = kb.nextLine();
			System.out.println(name);
			if (name.equalsIgnoreCase("Ahmet")) {
				check = false;
			}
		}

//***
      System.out.print("Input an integer: ");
      int digits = kb.nextInt();
		System.out.println("The sum is ");
		sumDigits1(digits);

//***
        System.out.print("Input a year: ");
        int year = kb.nextInt();

        is_LeapYear(year);

//***
        System.out.print("Input the string: ");
        String string1 = kb.nextLine();

        System.out.print("Number of words in the string: " + "\n");
        count_Words(string1);
        
        kb.close();
	}      
  
	
	public static void findMiddle(String str){
		
		int position;
        int length;
        
        if (str.length() % 2 == 0){
            position = str.length() / 2 - 1;
            length = 2;
        } else{
            position = str.length() / 2;
            length = 1;
        }
        System.out.println(str.substring(position, position + length));
	}
	
	public static void count_Words(String string1) {
          
    	int count = 0;
        
    	if (!(" ".equals(string1.substring(0, 1))) || !(" ".equals(string1.substring(string1.length() - 1)))) {
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1; 
        }
    		System.out.println(count); // returns 0 if string starts or ends with space " ".
    }

	public static void quit() {
		
		Scanner kb = new Scanner(System.in);
		
		String  input;
		char sure = 0;
		 
		 while (sure != 'Y' && sure != 'N') {	
			 System.out.print("Are you sure you want to quit? "); 
			 input = kb.next();
			 sure = input.charAt(0);						
		}
	}
	
	public static void enterNumber() {
		
		Scanner kb = new Scanner(System.in);
		
		int x = 1;
		
		do{
			System.out.print("Enter a number: ");
			x = kb.nextInt(); 
		} while (x > 0);	 
	}
	
	public static void findVowel(String str) {
		
		int count = 0;
		
        for (int i = 0; i < str.length(); i++)  {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
            	count++;
            }
        }
        System.out.println(count);
	}

	public static void findSmallest() {
		
		Scanner kb = new Scanner(System.in);
		
        System.out.print("Input the first number: ");
        double x = kb.nextDouble();
        
        System.out.print("Input the Second number: ");
        double y = kb.nextDouble();
        
        System.out.print("Input the third number: ");
        double z = kb.nextDouble();
        
        double smallestV = Math.min(Math.min(x, y),z);
        System.out.println(smallestV);
	} 
	
   	public static void average() {
   		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
        double x = kb.nextDouble();
        
        System.out.print("Input the second number: ");
        double y = kb.nextDouble();
       
        System.out.print("Input the third number: ");
        double z = kb.nextDouble();
       
        System.out.print("The average value is " +"\n" );
        
        System.out.println((x + y + z) / 3);
    }
 
  
   	public static void sumDigits1(long n) {
		
   		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		
		System.out.println(result);
	}
	

   	public static void is_LeapYear(int y) {
       
   		boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));

        System.out.println(a && (b || c));
    }
	
   	
   	
}
