package aa;

public class Loops {

	public static void main(String[] args) {
		
		System.out.println(replace("Java is for fun."));
			
	}

	public static String replace(String s) {
		int i=0;
		String k = "";
		char c;
		
		while(i < s.length()) {
			
			c = s.charAt(i);
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				c = 'X';
			}
			k += c;
			i++;
		}
		return k;
	}		
}
