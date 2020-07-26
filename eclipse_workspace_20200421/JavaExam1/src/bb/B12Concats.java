package bb;
//SQ: 28
public class B12Concats {

	public static void main(String[] args) {
		
		String ta = "A ";
		
		ta = ta.concat("B "); 
		
		String tb = "C ";
		
		ta = ta.concat(tb);  
		ta.replace('C', 'D'); 
		ta= ta.concat(tb);  
		
		System.out.println(ta);

	}

}


/*
 	What is result?
 	Answ: A B C C 
 	
 	Burada Stringlerin immutable olmasini hatirlamak gerekiyor;
 	 	'ta.replace('C', 'D');' denilmis ama bu degisiklik 'ta'ya esitlenmemis. 
 	 	'ta = ta.replace('C', 'D');' denilMEmis. O nedenle degisiklik yapildigi yerde kalir. 
 	 	'ta' en son neye esitlendiyse ondan devam eder. 
 	
 	 System.out.println(ta.replace('C', 'D')); --> syso'icinde yazarsam ABD goruyorum. 
 	 Ama bu ta'ya esitlendigi anlamina gelmez. 
 	 
 	 Immutable simply means unmodifiable or unchangeable. Once string object is created its data 
 	 or state can't be changed but a new string object is created.
 	
 */



