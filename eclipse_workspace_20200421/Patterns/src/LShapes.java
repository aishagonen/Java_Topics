
public class LShapes {

	public static void main(String[] args) {

/* ceyrek diamond or L shape pattern:
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

//*********		
// write dimensional 1 to 10:   '|__' seklinde yazdirir.
// r = row, c = column
	
		for (int r = 0; r <=10; r++) {
			for (int c = 0; c <= r; c++) {
				System.out.print( c + " ");
			} System.out.println( );
		} System.out.println("bye!");
		
//***	
		
		
			
	}

}
