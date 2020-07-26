package cc;
//SQ:77
public class C28X {

	static int i;
	int j;
	
	public static void main(String[] args) {
		
		C28X x1 = new C28X();
		C28X x2 = new C28X();
		
		x1.i = 3;
		x1.j = 4;
		x2.i = 5;
		x2.j = 6;
		
		System.out.println(x1.i + " "+ x1.j + " " + x2.i +  " " + x2.j );
	}

}



/*
 	Answ: 5 4 5 6

	Static variable'lar class'a ait oldugu icin, degistigi her yerde, classin her yerinde degisir. 
	Non-static variable'lar  objeye ait oldugu icin objeye gore farkli deger alabilir, birbirini etkilemez. 
*/
