package pack1;

import pack2.Access3;

public class Access2 {

	public static void main(String[] args) {

// " a." objesini yazinca onerilerde;
// 1. default access icin --> blue ucgen cikar. Because, in class of Access1, hours and minutes are default.
// 2. public access icin ---> green circle cikar. Because, in class of Access1, years and months are public. 
// 3. private access icin --> private accessi gormez. (datayi okumak icin 'get-set' kullanmak gerekir.)		
// 4. protected access icin-->	yellow diamond cikar. Because, in class of Access1, ages and century are protected. 	
		
	Access1 a	= new Access1();
	
// for default:	
	System.out.println(a.hours);
	System.out.println(a.minutes);	
		
// for public: 
	System.out.println(a.years);
	System.out.println(a.months);
	
// for private: 
//	System.out.println(a.days);
//	System.out.println(a.weeks);
	
// for protected: 	
	System.out.println(a.ages);
	System.out.println(a.century);
//different way to access ages data:	
	System.out.println(a.getAges()); //sonucu gostermesi icin Access1'e 'get' metodunu yazmalisin.

	}
}
