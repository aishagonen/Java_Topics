import java.util.Scanner;

public class Monday {

	public static void main(String[] args) {

		  Scanner kb = new Scanner(System.in);
		
// STRING MANIPULATION: *****************************************************************
		
		String str = "I love Java but I do not like to JavaScript and JQuery";
		String str2 = "ilhan Turkmen";
		
//length == to find length
		
		System.out.println(str2.length()); //54
		
//charAt() == to find particular index in string
		
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(30));
		
//indexOf() to find character index
		
		System.out.println(str.indexOf("like"));
		
//To find second J:
		
		System.out.println(str.indexOf("J", 8));   // ????????????????????????
// ?????????????????????????  ikisine de ?????????????????
		System.out.println(str.indexOf("J", str.indexOf("J")+1)); // 33 / first ve second j'yi yazip  +1 ekleyince third j'yi buluruz. 
		
// to find last J:
		
		System.out.println(str.lastIndexOf("J"));  // 48 / last J.
		
//Trim is used to remove space form string
		
		String str3 = "    hello world   ";
		System.out.println(str3);
		System.out.println(str3.trim());
		
//Substring is used to get specific string from current string
//Interview question:
		
		String s2 = "Your total amount is 1500 USD";
		//System.out.println(s2.substring(19, 25));
		System.out.println(s2.substring(21, s2.indexOf("USD"))); // 'USD'nin U'sundan onceki yere kadar diyoruz yani. 
		
		String total = s2.substring(21, s2.indexOf("USD")-1);
		int totalValue = Integer.parseInt(total);
		System.out.println(totalValue+100);
		
//Split:
		
		String language = "Java-Python-Ruby-Groovy"; //JavaPythonRubyGroovy
		System.out.println(language); // bizden bu listeyi '-'siz yazmamizi istiyor: 
		String lang[] = language.split("-");
		System.out.println(lang[0]); // 0. index'i yazar / 'Java'	
		// Listeyi yazdirmak icin for loop kullaniriz:
		
		for (int i = 0; i<lang.length; i++){
			System.out.println(lang[i]);
		}
		
// Another example: 
		
		String pop = "textxXseleniumxXjavaxXPython"; // 'textseleniumjavaPython' seklinde yazdir: 
		String pop1[] = pop.split("xX");
		System.out.println(pop1[1]); // 1. index'i yazar / 'selenium'
		
		for (int i = 0; i<pop1.length; i++){
			System.out.println(pop1[i]);
		}

//equals --> for 'string' don't use for 'string ==':
		
		String emp1 = "hey this is ilhan here";
        String emp2 = "hey This is ilhan here";
		
        System.out.println(emp1.equals(emp2)); // false / or you can use for loop:
        
		if (emp1.equals(emp2)){
			System.out.println("correct");
		}else{
			System.out.println("incorrect");
		}
		
//replace:
		
		String date = "01-01-1975";
		System.out.println(date.replace("-", "/"));
		
//upper and lower case:
		
		String name1 = "my name is ILHAN";
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		
//*****************************************************************************************
		
//combination of mutiple string:
		String firstName = "Michael";
		String lastName = " Jackson";
		System.out.println(firstName + lastName);
		
		String str5 = 50 + 30 + "Hello"+ 40 + 40; 
		System.out.println(str5);  // 80Hello4040 
		
		String str6 = 50 + 30 + "Hello"+ (40 + 40);  // sondaki sayilari parantez icine aldigimiz icin tekrar integer olarak islem yapar. yoksa onlari da string okur. 
		System.out.println(str6); // 80Hello80
		
		int x = 100;
		int y = 200;
		String m = "Hello";
		String n = " world";
		System.out.println(x+y); // 300
		System.out.println(m + n); // Hello world
		System.out.println(x + m + n); // 100Hello world
		System.out.println(x + y + m + n); // 300Hello world
		System.out.println(m + n + x + y); // Hello world100200

		
// ***********************************************************************		
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
       
// Switch case:
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
		String mathOperators = "1. Addition \n"
				                +"2. Subtraction \n"
				                +"3. Multiplication \n"
				                +"4. Division";
		
		System.out.println(mathOperators);
		System.out.println("*********************************");
		System.out.println("Please enter math operator");
		
		String operators = kb.nextLine();
		
		int a;
		int b;
		
		switch (operators){
		case "1":
			System.out.println("Enter first number");
			a = kb.nextInt();
			System.out.println("Enter second number");
			b = kb.nextInt();
			System.out.println("Addition: "+ (a+b));
			break;
		case "2":
			System.out.println("Enter first number");
			a = kb.nextInt();
			System.out.println("Enter second number");
			b = kb.nextInt();
			System.out.println("Subtraction: "+ (a-b));
			break;
		case "3":
			System.out.println("Enter first number");
			a = kb.nextInt();
			System.out.println("Enter second number");
			b = kb.nextInt();
			System.out.println("Multiplication: "+ (a*b));
			break;
		case "4":
			System.out.println("Enter first number");
			a = kb.nextInt();
			System.out.println("Enter second number");
			b = kb.nextInt();
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
      
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
