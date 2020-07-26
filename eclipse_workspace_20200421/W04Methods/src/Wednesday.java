import java.util.Scanner;

public class Wednesday {
	
// Bir classin icinde baska metodlar da varsa, her metodun icine scanner yazmak yerine, bir scanner metodu yazip onu cagirabilirsin.
	
    public static void name(Scanner kb) {

    	
	    System.out.println("What is your name : ?");
	    String name = kb.nextLine();
	    System.out.println(name);  
	}
    
    public static void lastName(Scanner kb) {
        System.out.println("What is your lastname : ?");
        String name = kb.nextLine();
        System.out.println(name);    
    }
	
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        name(kb);
        lastName(kb);
        
        
        
        System.out.println(Math.random());
    
    
    
    }
    
    
    
   
    
    
	    
}
