
public class Prctic {

	public static void main(String[] args) {
		
//Question 1 
//Get input from the user as a string and convert that to charArray. 
//Get the second element from char.
     
		String str = "GeeksForGeeks"; 
        // Creating array of string length 
        char[] ch = new char[str.length()]; 
        // Copy character by character into array 
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
        } System.out.println(ch[1]);
        // Printing content of array 
        for (char c : ch) { 
            System.out.print(c); 
        } 

        System.out.println("\n************");
		
//Question 4 
//Count words in a String 

    String st = "How are you?";    
    String [] word = st.trim().split("\\s+");  
    
    for (int i = 0; i < word.length; i++) {
		System.out.println(word[i]);
	}System.out.println(word.length);
	
        
	System.out.println("\n************");
    
// Write a program that computes the following sum:
// sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/N
// N is an integer limit that the user enters.
// Enter N
// 4
// Sum is: 2.08333333333
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
