
public class FindVowel {

	public static void findVowel(String str) {
			
		int count = 0;
		
        for (int i = 0; i < str.length(); i++)  {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
            	count++;
            }
        }
        System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		findVowel("Java is fun for now.");
	}

}
