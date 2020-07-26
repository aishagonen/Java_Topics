package ff;
// What is the result?   Q:  /  SQ: 87
public class Appijk {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		int k = j += i / 5; // j= 20+2 // int k=(j+=i) / 5 --> k=6
		// 9. line'da j'yi tekrar assign ediyoruz: j=j+i/5 --> j=20+2 --> j = 22
			
		System.out.println(i + " : " + j + " : " + k );
						// 10         22           22
	}

}
//outp: 10 : 22 : 22