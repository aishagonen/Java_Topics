
public class InterviewQuestions {

	public static void main(String[] args) {

// Interview Questions:	


		
//**************************************************************
// Q:
// A: 
		
		
		
		
		
		
		
//**************************************************************		
// Q: Reverse string: 
// A: 
		String word = "SiliconeLabs";
		String reversed = "";
		
		for (int i = word.length()-1; i >=0;  i--) {
			reversed = reversed + word.charAt(i); 	// returns character at the specified index in a string. 
		}
		System.out.println(reversed);

		
//**************************************************************			
// Q: How to create a string from character array? 
// A:		 
        char [] arrsample = {'S','i','l','i','c','o','n','e'};
        String charString = new String(arrsample);
        System.out.println(charString);
		
//**************************************************************		
// .replaceAll():
// Q: Extract the numbers out of the string:	
		String string = ":::::ADSGFHkjbvrvbir986skhsdh876";	

// A: replace all ile sadece numbers yazdirabilirsin. Also, substring de kullanilabilir:
		
		string = string.replaceAll("[a-zA-Z]", ""); 	 // 1. way / buyuk harfleri de katmalisin.
		string = string.replaceAll("[^0-9]", "");  		// 2. way  / only numbers gosterir. 
		System.out.println(string);			
	
//**************************************************************	
// Integer.parseInt():
// Q: String'teki '1500'u alip '1600' yapmak: 
// A:	
		String s2 = "Your total amount is 1500 USD";
		
		String total = s2.substring(21, s2.indexOf("USD")-1);
		int totalValue = Integer.parseInt(total); 
// stringteki 1500 is string. so we need to convert it integer first. sonra matematiksel islem yapabilrisin. 
		System.out.println(totalValue+100);
	
		String total = s2.substring(21, s2.indexOf("USD")-1);
		int totalValue = Integer.parseInt(total);
		System.out.println(totalValue+100);

//**************************************************************			
		
// Split: 
// Q:Asagidaki stringi,'JavaPythonRubyGroovy' seklinde yazdirmak:
// A:		
		String language = "Java-Python-Ruby-Groovy"; //JavaPythonRubyGroovy
		System.out.println(language); // bizden bu listeyi '-'siz yazmamizi istiyor: 
		String lang[] = language.split("-");
		System.out.println(lang[0]); // 0. index'i yazar / 'Java'
// Listeyi yazdirmak icin for loop kullaniriz:
		for (int i = 0; i<lang.length; i++){
			System.out.println(lang[i]);
		}
			
//**************************************************************			
// Q: What is output str5? : 
// A:
		String str5 = 50 + 30 + "Hello"+ 40 + 40; 
		System.out.println(str5);  // 80Hello4040	
		
//**************************************************************			
// Q:	

		
		
		
	}

}
