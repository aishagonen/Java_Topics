package lab7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
					
		Scanner kb = new Scanner(System.in);
		
		String user_name = null,type;
		type = null;
 		int balance = 0,tmp = 0;
		int withd = 0,cb = 0;
				
		int userChoice = kb.nextInt();
        boolean quit = false;
            	
        create_account user = new create_account("Ahmet",01,1000,"Saving"); // initialize -- name,acc_number,Balance,Type
        user.deposit(3000);
        user.withdraw(3000);
        user.display_details();
        
        do {   
	        System.out.print("Enter Your Choice : ");
	        System.out.println("1. Deposit money");
	        System.out.println("2. Withdraw money");
	        System.out.println("3. Display all the info");
	        System.out.println("4. Check balance");
		    System.out.println("5. Display Account Details");
		    System.out.println("0. to quit: \n");
		 
	        switch (userChoice) {
	            
		       case 1: // Deposit
			       System.out.print("Enter Amount Of Money : ");
			       balance = kb.nextInt();
			       user.deposit(balance);
			       System.out.println("\t Successfully Deposited.");
		       break;
	          
		       case 2: // withdraw money                      
		    	   System.out.print("Enter Amout Of Money : ");   
	               withd = kb.nextInt();  
	               user.withdraw(withd);
	               System.out.println("Your Current Balance : "+user.Acc_Balance);   
	               break;
	          
	            case 3: // display all info                     
	               user.display_details();             
	            break;                       
	
	    		case 4:
	    			// to generate Random Account Number 
				  	int aNumber = user.random();
			        System.out.print("Enter your Name : ");
			        user_name = kb.next(); 
			        System.out.print("Enter Accout Type : ");
			        type = kb.next();
			        user.insert(user_name, aNumber, type);  // inserted 
			        System.out.println("\n\tYour Account Details\n\tDont Forget Account Number\n");
			        System.out.println("**************************");                       
			        user.display_details();
			    break;
	    		
	    		case 5: // display all info 
	               System.out.print("Enter your Account Number :");
	               tmp = kb.nextInt();                     
	                 if(tmp == user.Acc_num){                               
	                	 user.display_details();                             
	                 }else
	                	 System.out.println("Wrong Accoount Number.");  
	            break;
	  
	    		case 0:
	    			quit = true;
	    		break;
	    	  
	    		default:
	    			System.out.println("Wrong Choice.");
	    		break;
	        }
        		System.out.println("\n");
        } while (!quit);
        	System.out.println("Thanks !");

	}
}

class Account{
    String name,acc_type;
    int Acc_num,Acc_Balance;
	public Account(String name,int acc_num,int acc_Balance,String acc_type) {
		
		this.name = name;
		this.acc_type = acc_type;
		Acc_num = acc_num;
		Acc_Balance = acc_Balance;
	} 
    
} 

class create_account extends Account{

	public create_account(String name, int acc_num, int acc_Balance, String acc_type) {
		super(name, acc_num, acc_Balance, acc_type);
	}

	void insert(String n, int acc_num, String a_t) { 
		name = n;
		acc_type = a_t;
		Acc_num = acc_num; 
		Acc_Balance = 0;
	}

	void display_details() {
		System.out.println("Depositor Name: " + name);
		System.out.println("Account Number: " + Acc_num);
		System.out.println("Account Balance: " + Acc_Balance);
		System.out.println("Account Type: " + acc_type);
	}

	void deposit(int amount) {
		Acc_Balance += amount;
	}

	void withdraw(int amount) {
		Acc_Balance += amount;
	}

	int random() {
		
		int randomNumber = (int) ((Math.random() * 9000) + 1000); // These constant numbers (9000,1000 can be changed)
		return randomNumber;
    
	} // end class 
}

