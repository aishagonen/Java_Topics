package dowhiles;

public class Whiles {

	public static void main(String[] args) {



		 
// *************************	
		int i = 1;
		
		while (i <= 20) {
			if (i == 3) {
				i +=2;
				continue;
			}
			System.out.println(i);
			i++;
			
			if ((i%2) == 0) {
				i++;
			}
			
			if (i >10) {
				break;
			}
		}		

// *************************
		char letter	= 'A';
		
		while (letter <= 'Z') {
			System.out.println("The letter is: " + letter);
			letter++;
		}		

// *************************
//bu kod sonsuza kadar surer:
		while(true) {
			 System.out.println("Hi!");
		 }  
 		
// *************************	
		int numbr = 1;
		
		while (numbr <= 100) {
			if (numbr %2 == 0) {
				System.out.println(numbr);
			}
			++numbr;
		}
		System.out.println("End of while loop.");
		
// *************************		
// 100'den kucuk cift sayilari yazar:
		
		int nub = 1;
		while (nub <= 100) {
			if (nub %2 == 0) {
				System.out.println(nub);
			}
			++nub;
		}
			System.out.println("End of while loop.");	
		
// *************************		
		String stars = "";
		int count = 1;
		while (count <=7) {
			stars = stars + "*";
			System.out.println(stars);
			count ++;
		}	
			
// *************************	
// bu kod 1'den 9'a kadar birer birer artarak sayilari yazar:
		
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;  // eger bunu yani 'i++' vb. belirtmezsen, kod sonsuza kadar surer. 
		}

// *************************		
// bu kod Java 1, Java 2, Java 3.... diye 10'a kadar yazar:
		
		int f = 1;
		while (f<=10) {
			System.out.println("Java " + f);
			f++;
		}
	
// *************************
// increasing numbers: 		
		int j = 0;
		
		while (j < 10) {
			System.out.println(j);
			j++;
		}
		
// decreasing numbers:
		while (j>-10) {
			System.out.println(j);
			j--;
		}
		
// loops trough the array 
		int [] arr2 = {4,5,6,7,8};		
		int k =0;
		
		while (k < arr2.length) {
			System.out.println(arr2[k]);
			k++;
		}
		
// *************************
		/*
	    *
	    **
	    ***
	    ****
	    *****
	    ******
	    */
		
		String stringg = "";
		int count1 = 0;
		while (count1 < 6) {
			stringg = stringg + "*";
			System.out.println(stringg);
			count1++;
		}
		
// *************************
		int count2 = 0;
		while(count2 < 14){
			System.out.println(count2);
			count2++;	
			break; // break statements kills the loop
		}
		
// *************************		
		int count3 = 0;
		
		while(count3 < 14){
			if (count3 %2 ==0) {
				System.out.println(count3 + " is an even number");
			}
			else {
				System.out.println(count3 + " is an odd number");
			}
			
			count3++;	
		}
		
// *************************		
		String single [] = {"II", "111", "o", "10", "ioi"};
		
		int s = 0;
		while (s < single.length) {
			System.out.println(single[s]);
			s++;
		}	
		
// *************************
			
// While Loop:
	
		int w = 1;
		while (w <= 10) {
			System.out.print(w + " ");
			w++;
		}
		System.out.println("\nfinish!");
		
//***
		int a = 1;
		while (a <= 100) {
			if (a % 2 == 0)     // whilein icindeki 'if'e curly bracket koyma.  while'in icinde if'i direct okusun. 
				System.out.print( a + " ");	
			 a++;		
		} System.out.println(" \ndone!");

//***			
			

		
	}

}
