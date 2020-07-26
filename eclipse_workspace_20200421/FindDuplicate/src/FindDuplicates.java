
public class FindDuplicates {

	public static void main(String[] args) {

		String sentence	= "How many duplicates are there?";

//  1. bu kod, stringteki harfleri tek tek gosterir:		
		for (int i = 0; i < sentence.length(); i++) {
			System.out.println(sentence.charAt(i));	
		}

// 2. bu kisim, 0.harf olan H'den baslayip, tek tek harfleri ekleye ekleye gosterir:  	
		String characters = "";
		String duplicates = "";
		
		for (int i = 0; i < sentence.length(); i++) {
			characters += sentence.charAt(i);
			System.out.println(characters);	
		}
		
// 3. Harfleri, duplicate yapmadan yanyana yazar.		
		
		for (int i = 0; i < sentence.length(); i++) {
			String current = Character.toString(sentence.charAt(i));
			if (characters.contains(current)) {
				if (!duplicates.contains(current)) {
					duplicates += current + ",";
				}
			}
			characters += current;
		}

		System.out.println(duplicates);
	}
		
}


