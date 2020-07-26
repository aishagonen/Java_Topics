import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
        String string = kb.nextLine();

        System.out.print("Number of words in the string: " + "\n");
		countWords(string);
		
		kb.close();
	}
	
	
	public static void countWords(String string) {
          
    	int count = 0;
        
    	if (!(" ".equals(string.substring(0, 1))) || !(" ".equals(string.substring(string.length() - 1)))) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1; 
        }
    		System.out.println(count); // returns 0 if string starts or ends with space " ".
    }
	
}
