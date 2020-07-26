
public class FinalKeyword {
// Variables:

//  static final double PI = 3.14157;  // boyle de yazilabilir.
	final int MAX = 5;  // bu sekilde variable'i declare edebilirsin. Genelde boyle yazilir.  
	final int MIN; 	   // bu sekilde blank birakabilirsin ama initilaize etmek zorundasin. 
	
	FinalKeyword() {
		MIN = 1;
	}
	
// Methods:
	public void sayHi() {
		System.out.println("Hi!");
	}

	final public void sayHii() {			
		System.out.println("Hii!");
	}
// ustteki methodlarin ikisi de calisir. cunku final method'da bi sey degistirmeye calismadik. 
// ama, if we have another class that try to change the final method, we can't.    
	
// Classes:
// Eger 'public class FinalKeyword { ' classini,'final public class FinalKeyword {' olarak degistirirsek, yani 
// classi final yapsak ve sonrada baska bi class olusturup,'class OtherClass extends FinalKeyword {' diyerek 'OtherClass'i, 
// 'FinalKeyword'un subclassi yapsak kod hata verir, calismaz. Yani classin basinda 'final' kelimesi varsa o classi da degistiremezsin.   	
	
	public static void main(String[] args) {

		FinalKeyword f = new FinalKeyword();
		
		System.out.println(f.MAX );
		System.out.println(f.MIN);
		
		f.sayHi();
		f.sayHii();
	
		
	}

}

/*
The final keyword in java means it doesn't change. You set it once and if you want to change it again, you can't. 
Regular variables can change, but final never!
This is useful for global variables or anything you know will never change.
Final variables are written above the main methods. We need main method to run the code. 
Also class knows that stays constant. It never changes.	
*/

