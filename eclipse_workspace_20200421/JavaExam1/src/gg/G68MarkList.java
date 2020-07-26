package gg;
//SQ:63
public class G68MarkList {

	int num;
	public static void graceMarks(G68MarkList obj4) {
		obj4.num +=10;
	}
	
	public static void main(String[] args) {
		
		G68MarkList obj1 = new G68MarkList();
		G68MarkList obj2 = obj1;
		G68MarkList obj3 = null;
		
		obj2.num = 60;
		graceMarks(obj2);
		
		
	}

}

/*
	How many MarkList instances are created in memory at runtime?
	A. 1
	B. 2
	C. 3
	D. 4


	Answ: 1 

*/