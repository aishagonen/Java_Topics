package fors;

public class Fors {

	public static void main(String[] args) {
	
		
		
		
		
		
		
		

// **************************************		
		int counter = 0;
		
		for (int y = 100; y >= 10; y = y-5) {
			counter ++;
			System.out.println("counter is: "+ counter + "y is: " +  y);
		} System.out.println("out for loop; total counter: " + counter);
				
// **************************************
// Print Hello Silicone Labs for 99 times:	
		for(int i = 0 ; i <= 99 ; i++){
			System.out.println(i + " : Hello Silicone Labs");
		}
		
// looping trough array:	
		int [] arr5 = {3,4,5,6,7,8,9,5,6,4,3,2};
		
		for(int i = 0 ; i < arr5.length ; i++){
			System.out.println(arr5[i]);  // [i] index sayisi, 0. index'i alip yaziyor sonra diger index'leri	
		}
		
// I put initialization step to outside of the for loop:
		int count=0;
		
		for(; count < 5 ; count ++){
			System.out.println( count+ " : count");
		}
		
// for loop with decreasing numbers:
		for(int i = 5; i >- 3 ; i--){
			System.out.println(i + " = i" );
		}
		
// for loop with increasing numbers by 2:
		for (int i = 0; i < 10; i+=2) { 	// i = i + 2
			System.out.println("i : " + i);
		}
		
// for loop with increasing numbers by 2:
		for (int i = 1; i < 10; i *= 2) { 	// i = i + 2
			System.out.println("i : " + i);
		}		
		
// **************************************		
// Sum of the numbers betw 1-100: output: 5050		
		int sum = 0; 
		
		for (int i = 1; i <= 100; ++i) {
			sum += i;  				 	 // sum = sum + i;
		}	
		System.out.println("Sum of numbers is: " + sum );

// **************************************
// List numbers betw 1-100: output: 1, 2, 3,...etc.
		int i;
		
		for (i = 1; i <= 100; i++) {
			System.out.print( i +", "); //'println' demedigimiz icin yan yana  yazar. 
		}

// **************************************

		for (int a =0;  a<10; a++) {
			System.out.println(a);
		}
	
// **************************************
// 5 kere 'I love my kids.' yaz:
		for(int b=0; b<5; b++) {
			System.out.println("I love my kids."); 
		}

// **************************************

		for(int g = 0; g <= 3; g++) {
			System.out.println(g);
		}
		
// **************************************
// Array'deki elemanlari alt  alta listeler:
		int [] grades = {100, 76, 85, 93};
		
		for(int d = 0; d < grades.length; d++) {
			System.out.println( grades [d] );
		}

// **************************************		
// 1'den baslayip 15 defa sayiyi 2 ile carparak yazar:
		int k=1;
		
		for (int h = 1; h <= 15; h++) {
			System.out.println( k + " ");
			k = k*2;   		
		}	
		
// **************************************	
// Bir onceki sayiyi 2 ile carparak gider: 
		for (int t = 1; t <= 100; t = t * 2){    
			System.out.println( t + " ");	
		}		

// **************************************
// Kodun 'for' kismi, 1'den 15'e kadar sayilari yazar.
// 'if' kismi da sayi 3'e bolundugunde kalan 2 ise, 'Remainder 2.' gosteri:.		
		for (int  z = 1; z <= 15; z++) {
			System.out.println( z );
				if (z % 3 == 2) {
					System.out.println("Remainder 2.");
				}
		}
		
// **************************************	
// 1'den baslayip 100'e kadar, bir onceki sayiyi 2 ile carpar:
		for(int v = 1; v < 100; v *= 2) {
			System.out.println("v = " + v);	
		}
	
// **************************************
// continue:
		for (int n = 1; n < 18; n++) {			
			if(n%5 == 0) {
				continue;
			}
			System.out.println(n + " ");
		}
		System.out.println("Good Bye.");
	
// ************************************
// exit: 	
		for (int e = 1; e < 18; e++) { 			
			if(e %5 == 0) {
			System.exit(0);			// 'break' if'ten cikar ama kod digerlerini yazar. 'exit' tamamiyle kodu durdurur, cikar. devami yazmaz. 
			}
			System.out.println(e + " ");
		}
		System.out.println("Good Bye.");
		
		
//**************************************		
// row - column: 	
		for (int r = 0; r < 2; r++) {
			for (int c = 0; c < 3 ; c++) {
				System.out.println("r: " + r + "; c: "+ c);
			}
		}
		
//**************************************			
// 'araba' kelimesinde kac tane 'a' oldugunu gosterir:
		String araba = "araba";
		int count = 0;
		for (int q =0; q<araba.length(); q++)
			if (araba.charAt(q)== 'a') {
				count ++;
			} System.out.println(count);

//**************************************	
// create a program that finds odd - even numbers in a number of given:
		for(int i = 0 ; i < 19 ; i++){
			if (i %2 == 0) {
				System.out.println( i + " is an even number");
			}
			else {
				System.out.println( i + " is an odd number");
			}
		}
		
//**************************************	
// two dimensional arrays:
		int [][] twoDimArry = {{1,2,3,4}, {9,8,7,6}};
		
		for (int outerSet = 0; outerSet < 2; outerSet++) {
			
			for (int innerSet = 0; innerSet < 4; innerSet++) {
				System.out.print(twoDimArry[outerSet][innerSet]);
			}
		}
		
		System.out.println(twoDimArry[1][2]);
	
//**************************************	
		// For Loops:
		
		int sum = 0;
		
		for (int i = 0; i <= 5; i++) {
			sum = sum + i; 
		}	System.out.println(sum);
		
//***
		int sun = 0;
		
		for (int i = 5; i <= 100; i+=10) {
			sun = sun + i; 
		} System.out.println(sun);

//***
//			for (int j = 5; j <= 100; j+=10) {
//			} System.out.println(j);

//***
		
// Interview Question:		
// Reverse string / Reverse Array / Reverse Numbers: 		
		String word = "SiliconeLabs";
		String reversed = "";
		
		for (int i = word.length()-1; i >=0;  i--) {
			reversed = reversed + word.charAt(i); 	// returns character at the specified index in a string. 
		}
		System.out.println(reversed);

//***
// Even numbers: 0 is not even or odd. so start from 2.
		for (int even = 2; even <= 10; even+=2) {
			System.out.println(even);
		} 

// Odd numbers:
		
		for (int odd = 1; odd <= 10; odd+=2) {
			System.out.println(odd);
		}

//***		
// Print 'Hey you!' after 5, after print continue to count until 10. Use for loop: 	
	
		for (int i = 1; i <=10; i++) {
			System.out.print(i + " ");
			
			if (i == 5) {
				System.out.print(" Hey you! " );
			} 
		} 
//***		
// Print 'Hey you!' after every 5* : 
		
		for (int i = 1; i <=20; i++) {
			System.out.print(i + " ");
			
			if (i % 5 == 0 ) {
				System.out.print(" Hey you! " );
			} 
		} 

//***		
// write dimensional 1 to 10:   '|__' seklinde yazdirir.
// r = row, c = column
		
		for (int r = 0; r <=10; r++) {
			for (int c = 0; c <= r; c++) {
				System.out.print( c + " ");
			} System.out.println( );
		} System.out.println("bye!");
		
		
//***		
// write 10 times 1 to 10: 
		
		for (int r = 0; r <= 10 ; r++) {
			for (int c = 0; c <= 10; c++) {
			System.out.print( c + " " );	
			} System.out.println();
		}System.out.println("bye!");
		
//***	
// Break:

		for (int k = 1; k <=5; k++) {
			System.out.println(k);
			if (k > 2) {
				break;
			}
		}

// Continue:
		
		for (int m = 0; m <=10; m++) {
			if (m == 1 || m ==4) {
				continue; 		// means, 'm' eger 1 veya 4 olursa yazdirma ve continue yani devam et calismaya.
			} System.out.println(m);
		} 

// **********************************		
		
		
		
		
	}

}
