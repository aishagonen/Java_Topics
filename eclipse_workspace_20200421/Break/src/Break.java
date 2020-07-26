
public class Break {

	public static void main(String[] args) {
		
// break: means	get out from loop. 
		
		for (int i = 1; i <18; i++) {   
			if(i%5 ==0) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Good Bye.");
		
				
// **************************************

		while(true) {
			System.out.println("Hi!");
			break;
		}  // normalde bu  kod sonsuza kadar yazar. 
		  // Ama 'break' yazarsan 1 kere yazar ve looptan cikar.
				
				
// **************************************				
		
		int i = 0;
		
		while(i<3) {
			System.out.println("Hi!");
			i++;
			break;
		} 
				
// **************************************					

		for (int l = 0; l < 3; l++) {
			for (int j = 0; j < 2; j++) {  // 'j++' sari cizgili cunku diyor ki 'j won't increase' yani kullanmayacaksin, cunku break var ya. yani dead kod bu.
				System.out.println("i: "+l + " ; j: "+j);
				break;
			}
		}

// **************************************
		
		char charKey = 'Y';
	    switch (charKey) {
	    case 'Z':
	        System.out.println("Key is Z");
	        
	    case 'Y':
	        System.out.println("Key is Y");
	        break;
	    case 'A':
	        System.out.println("Key is A");
	        break;
	    default:
	        System.out.println("This is the default");
	        
	    }
		
// **************************************		
	    
	    
		
				
				
	}

}
