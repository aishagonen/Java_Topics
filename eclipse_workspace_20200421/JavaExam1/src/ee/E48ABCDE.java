package ee;
//SQ:135
public class E48ABCDE {

	public static void main(String[] args) {
		
		String [][] arr = {{"A", "B","C"}, {"D", "E"}};
		System.out.println( arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
				if (arr[i][j].equals("B")) {
					break;		
				}
			}
			continue;
		}

		
	}

}

/*
	Answ: A B D E



*/