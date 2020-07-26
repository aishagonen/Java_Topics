package dd;
//SQ:81
public class D30WorkDone {

	public static void main(String[] args) {

		String [] arr = {"A","B","C","D"};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (arr[i].equals("C")) {
				continue;			
				//break;
			}
			System.out.println("Work Done");
			break;
			//Continue;
		}
		
		
	}
}


/* 
   Answ: A Work Done
   

*/