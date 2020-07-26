package exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
//		System.out.println("Hello World!");
//		System.out.println();
		
		//int [] arr ={1};
		//System.out.println(arr[4]); // Exception.  Undefined, so Exception.Program will stop here. 
//Program is terminated now. So even there is another exception below it doesn't see because program ends. 
// You see in the console Exception for [4]. 		
		
//		System.out.println(9/0); // Exception. it is not Error.
//		
//		System.out.println("Hello Universe.");


		
		try {
			//System.out.println(arr[4]); // Exception
			System.out.println(9/0); // Exception
			//System.out.println("Hello Silicone Labs");
		} // try{} icinde hata varsa catch() hatayi tutup programin devamini calistirir. 
		catch (Exception e) {
			System.out.println("This is catch block");
			System.out.println(e.getMessage()); // shows what is the error in your code. 
			System.out.println(e.toString());
		}
		
		System.out.println("Hello World");
		System.out.println();
		
		
		try{
			System.out.println("Input your year of birth");
			int year = kb.nextInt();
			int age = 2020 - year;
			System.out.println("This is your age : " + age);
		}
		catch (Exception e) {
			System.out.println("Invalid input");
		}
		System.out.println();
			
		
	}

}

/* Throwable class is super class  & Error and Exception class are sub-class.
 * Exception => an event which disrupts normal execution of a program is known as exception. 
 * When 'program is throwing exception' a.k.a 'exception raised at runtime' program terminate. 
 * And rest of the program won't be executed. So we need to handle all possible exceptions that could be thrown or raised.   
 * 3 Types of Java exceptions are : 1. Checked excp. 2. Unchecked excp. 3. Error.
 * Exception and Error are different things:
  
 * ERROR : 
	 - Error is non-recoverable.You can not handle/fix Error.  
	 - Error is about resources.  
	 - All Errors are Unchecked => Run time exception.
	 - Defined in 'java.lang.Error' package. 
  
 * EXCEPTION :  
	 - Exception is recoverable. You can/must handle Exception by try-catch block or throw clause.
	 - Exception is about programmatic logic. 
	 - Defined in 'java.lang.Exception' package.
	 - Exceptions are;
			= Unchecked => Run time exception.  (Kodu calistirdiktan sonra goruyoruz.)
			= Checked => Compile time exception. (Kodu yazarken kirmizi cizgi goruyoruz.)	
			
 * e.getMessage() ==> to get what is the error in your code.
 * e.toString()   ==> to get actual exception name.
 * e.printStackTrace ==> cagirdigi fonksiyonlari silsile halinde gosterir.
 
 * try-catch can be nested.	
 			  
 * finally : 
 	- After 'try' block, we need to create one or more 'catch' block or one 'finally' block. 
 	- 'finally' block should be at the end.
 	- 'finally' block always runs no matter the exception is handeled or not. 
 	- it is used for clean up code.
  
   
 * 'throw' new ==> use for throw an exception. 
 		- Works smilar to 'try-catch' block.
 		-'throw'is used within method body where exceptions might occur.
 		- Syntax of 'throw' includes the instance variable of the Exception to be thrown. 
 			* throw new ArithmeticException("xxx"); *  
 		- It can throw only one exception at a time.
 		- It is only used to propagate the unchecked Exceptions.
 		 
 	 
 * 'throws' ==> declare/reminding an exception.It doesn't throw an exception.It doesn't handle the exception!
 		-'throws' is used with method signature to declare exception, yani it tells 'this method can throw exception'. 
 			* method() throws IOException {...} *
		- Syntax of 'throws' includes the class names of the Exceptions to be thrown.
			* void Demo() throws ArithmeticException, NullPointerException {..} *
		- It can be used to declare multiple exceptions, separated by comma.
		- It can throw multiple exceptions by class names.
 	  	-'throws' keyword is used to propagate the checked Exceptions only.
  
  * Type of Exceptions  :
  	  
 	* (Exception e) ==> catches every single error. 
 						Super type Exception. So write it last. Write from Specific Excp.--> to Genereal Excp.  
	  C	^ (IOException ioe) ==> 
	  C	^ (SQLException sqle) ==> 
	  C	^ (BrokenBarrierException) ==> like : (ClassNotFoundException), 
	  U	^ (RuntimeException sqle)
	  				U = (ArithmeticException e) 
	  				U = (NullPointerException  e)
	  				  = (NumberFormatException e) 
	  			    C = (IndexOutOfBoundsException e)	
	  				  		C	# (StringIndexOutOfBoundsException e) 	
	  				  		C	# (ArrayIndexOutOfBoundsxception e) 	
  	
  	* Error  --> Unchecked & Runtime e.
  		^ ThreadDeath
  		^ IOError
  		^ VirtualMachineError
		  		= OutOfMemoryError
		  		= StackOverflowError
	  	
  	
  
  
  
 */








