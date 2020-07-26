import java.util.ArrayList;
import java.util.Scanner;

public class SeparateWords {

	public static void main(String[] args) {
		
		
	String sentence = "These are the formats for how you create your while and do while loop in java";
	Scanner kb = new Scanner(sentence);
	
	ArrayList<String> words = new ArrayList<String>();
	int c=0;
	while (kb.hasNext()) {
		words.add (kb.next());
		c++;
	}
	System.out.println(words);
	System.out.println("c= "+ c);	
	
	}

}
