
public class TwoDimensionalArray {

	public static void main(String[] args) {
	
// two dimensional arrays:
//						 {(row)outerSet}  {(column)innerSet}
		int [][] twoDimArry = {{1,2,3,4}, {9,8,7,6}};
		
		for (int outerSet = 0; outerSet < 2; outerSet++) {
			for (int innerSet = 0; innerSet < 4; innerSet++) {
				System.out.print(twoDimArry[outerSet][innerSet]);
			}  // output: 12349876
		}
//									row  column		
		System.out.println(twoDimArry[1][2]); // output:7
		System.out.println(twoDimArry[0][3]); // :4
		System.out.println(twoDimArry[0][1]); // :2
		System.out.println(twoDimArry[1][0]); // :9
		
//******************************************************				


		
		
		
		
		
		
		
	}

}
