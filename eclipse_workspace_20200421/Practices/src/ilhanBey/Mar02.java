package ilhanBey;

public class Mar02 {

	public static void main(String[] args) {
		
// 1.Remove junk character:  String s = "(123)-456-7891"; / Output: 1234567891

		String s = "(123)-456-7891";
		
		s = s.replaceAll("[^0-9]", "");		
		System.out.println(s);			
		
		   
// 2.Reverse Integer: int num = 12345  / Output: 54321 
// 1.Way:	
		
		int num1 = 12345; 
		
		StringBuffer reversed = new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println("Reversed number is: "+ reversed);
		
// 2.Way:   ????????????????????????????????????????????????????????????????????????????????????????????????????
// 2.Reverse Integer: int num = 12345  / Output: 54321		
		int num = 12345;
		
		int rev = 0;
		
		while(num !=0){
			rev = rev * 10 + num % 10; 	//5
			num = num / 10; 			//1234
		}
		System.out.println("Reversed number is: "+ rev);
	
				
// 3.Find duplicate value in Array: String names[] = {"Java", "JavaScript", "Groovy", "Python", "Java", "Python"}; / Output: Java Python
		
		String arr[] = {"Java", "JavaScript", "Groovy", "Python", "Java", "Python"};
				
		for (int i = 0; i < arr.length; i++) { 
			for (int j = i + 1; j < arr.length; j++) { 
				if (arr[i] == (arr[j]) ) {
					System.out.print(arr[j] + " ");
				}
			}
		}	
		  
		
// 4.Find missing number in Array: int aa[] = {1,2,4,5};  /  Output: 3
// 1. Way:
		
		int a[] = {1,2,4,5};
		
		int missing = 0;
        for(int i = 0; i< a.length; i++){
        	
        	int x = a[++i];
            int y = a[i] + 1;
            	
            	if(x != y ){
            		missing = y;
            	break;
            	}
        } 
        System.out.println("\n" + missing);
		
		
// 2. Way:
        
        //int aa[] = {1,2,4,5};
		int sum = 0;
		
		for(int i = 0; i < a.length; i++){
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		int sum1 = 0;
		
		for(int j = 1; j<=5; j++){
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);

		  
// 5.Use nested for print like this:
//   1 2 3 4 5 6 7 8 9 10 
//   1 2 3 4 5 6 7 8 9 
//   1 2 3 4 5 6 7 8 
//   1 2 3 4 5 6 7 
//   1 2 3 4 5 6 
//   1 2 3 4 5 
//   1 2 3 4 
//   1 2 3 
//   1 2 
//   1
			
// 1. Way:
			int i =10;
			
			for (int r = 1; r <=10; r++) {
				for (int c = 1; c <= i-r+1; c++) {
					System.out.print( c + " ");
				} System.out.println( );
			} System.out.println("bye!");	
			
// 2. Way:		
			for(int outer = 10; outer >= 1; outer--){
				for(int inner = 1; inner <= outer; inner++){
					System.out.print(inner + " ");
				}
				System.out.println();
			}
			
			
	}

}
