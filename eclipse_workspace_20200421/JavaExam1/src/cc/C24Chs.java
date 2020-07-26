package cc;
//SQ: 113    ****
public class C24Chs {

	public static void main(String[] args) {

		String [][] chs = new String [2][];
		
		chs [0] = new String [2];
		chs [1] = new String [5];
		
		int i = 97;
		
		for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < chs.length; b++) {
				chs [a][b] = "" + i;
				i++;
			}
		}
		
		for (String[] ca : chs) {
			for (String c : ca) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

		
		
	}
}


/*
	What is the result?
	A. 97 98 99 100 null null null
	B. 97 98 99 100 101 102 103
	C. Compilation rails.
	D. A NullPointerException is thrown at runtime.
	E. An ArraylndexOutOfBoundsException is thrown at runtime

	Answ: A
	Outp: 97 98 
		  99 100 null null null 

	 0   1     0  1  2  3   4
	{{}, {}}, 
	{{},{},{},{},{}}


*/