

public class W2 {

	public static void main(String[] args) {
	

//**************************************************************			
		
// *** Interview Question:	
		
// Q: Extract the numbers out of the string:	
		String string = "ADSGFHkjbvrvbir986skhsdh876";	
// replace all ile sadece numbers yazdirabilirsin. Also, substring de kullanilabilir. 
//A:
		string = string.replaceAll("[a-zA-Z]", ""); // 1. way / buyuk harfleri de katmalisin.'[a-zA-Z]'
		string = string.replaceAll("\\D+", "");  // 2. way  / only numbers gosterir. 
		System.out.println(string);			
	
//**************************************************************	
// If-else if - else:
		
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
// Grades:
		
		int grade = 101;
		
		if (grade > 100) {
			System.out.println("Invalid grade!");
		}
		else if (grade < 0) {		
			System.out.println("Invalid grade!");
		}
		else if (grade > 70) {		
			System.out.println("Your grade is A ");
		}
		else if (grade > 90){
			System.out.println("Your grade is B ");
		}
		else if (grade > 60) {
			System.out.println("Your grade is c ");
		}
		else {
			System.out.println("Your grade is F. You failed!");
		}
	
// ***************************************************		
// Positive or negative:		
		
		int num = 3; // -7 etc. but, 0 is not negative or positive. so we write else if condition.
		
		if (num > 0) {
			System.out.println(num + " is positive + !");
		} 
		else if (num == 0) {
			System.out.println("Number is zero 0!");
		}
		else {
			System.out.println(num + " is negative - !");
		}
				
// ***************************************************
		
		String username = "charliebrwn";
		boolean myVariable =username.equals("charliebrwn");
		
		if (myVariable) {
			System.out.println("Hello from inside of the if block.");
		} else {
			System.out.println("Hi from inside  of the else statement.");
		}	
// Condition true ise if statement; false ise else runs.  
		
// ***************************************************			
			
// Strings:	
// Strings are classes. 
				
		String message = "Hello ";
		String message1 = "Universe!";
		String message2 = new String("Hello Universe!");
		
// Concatenation "+" means, writing strings side by side. 
		
		System.out.println(message + message1);
		System.out.println(message1.toUpperCase());     
		System.out.println(message.length());		    // length()
		System.out.println("aisha".toUpperCase());      //  toUpperCase()
		System.out.println(message1.toLowerCase());     // toLowerCase()
		System.out.println(message.substring(0,4));     // 'substring(,)' shows values between '( )'. 
		System.out.println(message2.charAt(1));      	// charAt()
		System.out.println(message.contains("u")); 		// contains("") -->its return type is boolean!
		System.out.println("Aisha".contains("h"));
		System.out.println(message.indexOf("m")); 		// indexOf("") --> if the value 'm' is not in the string, shows '-1'.
		System.out.println(message.indexOf("e")); 
		System.out.println(message.replace("H", "Y")); 	// replace("", "")
		
// We can combine the methods:			
		System.out.println(message.substring(0,4).charAt(2));
	  //System.out.println(message.substring(0,4).charAt(5));//String index out of range 5. First takes 'substring', then find the 'charAt'.
		
// equal() : 
		String name = "java";
		String name1 = "Java";
		String name2 = "Python";
		String name3 = "java";
		
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name3));
		System.out.println(name.equalsIgnoreCase(name1)); // equalsIgnoreCase --> its return type is boolean!
		
// to check lengths of two strings are equal or not:		
		String string1 = "hello";
		String string2 = "universe";
		System.out.println(string1.length() == string2.length()); // --> its return type is boolean!
		
//**************************************************************
		
// StringBuffer: 
// differences betw String, when you update string, just changed the string. not keeps first string. So memory'yi sisirmiyoruz. 		
		
		// className   objectName = new  ClassName();
		StringBuffer stringBuffer = new StringBuffer("Slicone Labs");
		System.out.println(stringBuffer.reverse()); // Previous value is in the memory but changed. this is new value. 	
		
//**************************************************************				
		
// StringBuilder:
		
        StringBuilder stringBuilder = new StringBuilder("This is a string ");
        
 // append method is concatenating two string:
        
        stringBuilder.append("builder ! ");
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(0, 'L');
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
				
//**************************************************************	
	
// ArraysArrayLists - Array List:		
// Array:
		
// dataType arrayName [] = new dataType [lengthOfArray]	
// default value for each index for integers is 0. and you have 4 object in this array in this example.  		
		
		int way1 [] = new int [4];
		
		System.out.println(way1); // it shows array's memory location. Don't do that.
		System.out.println(ArraysArrayLists.toString(way1)); // now it shows what is in the array.
			
			way1 [0] = 7;
			way1 [1] = 11;
			way1 [2] = 3;
			way1 [3] = 93;
			
		System.out.println(ArraysArrayLists.toString(way1));
			 
		  //int [] way2 = seklinde de yazilabilir. 
		int way2 [] = new int [] {1,7,11,23,93,71};  // long way
		System.out.println(ArraysArrayLists.toString(way2));
		System.out.println(way2[2]);
		
		int [] way3 = {51,97,31,63};
		System.out.println(ArraysArrayLists.toString(way3));
		
// default value for each index for String is 'null'.if you don't assign any value it is mean each  index is null.
		
		String [] stringArray = {"Java", "Python", "SQL", "C++"};
		System.out.println(stringArray[3]);
		System.out.println(ArraysArrayLists.toString(stringArray));
		
		double [] doubleArray = {11.1, 3.3, 1.11};
		System.out.println(ArraysArrayLists.toString(doubleArray));
		
		boolean [] booleanArray = {true, false};
		System.out.println(ArraysArrayLists.toString(booleanArray));
		System.out.println(booleanArray[0]);


// *****************************************
		
		
		
		
		
	}

}
