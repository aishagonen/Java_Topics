
public class ReverseStrings {

	public static void main(String[] args) {
		
	String r = reverse("Pomegranates are delicious!");	
	System.out.println(r);
	
	
	System.out.println("\n************");	
	
	StringBuilder str = new StringBuilder("Hello Universe!");
	System.out.println(str.reverse());
	
	
	
	
	
	} // end of the main method.
	
	public static String reverse (String s) {
		
		char [] letters = new char[s.length()];
		
		int letterIndex = 0;
		for (int i = s.length()-1; i>=0;  i--) {
			letters[letterIndex]  = s.charAt(i);
			letterIndex++;
		}
		String reverse = "";
		for (int i = 0; i < s.length(); i++) {
			reverse = reverse +letters[i]; 
		}
		return reverse;
	}
		

}
