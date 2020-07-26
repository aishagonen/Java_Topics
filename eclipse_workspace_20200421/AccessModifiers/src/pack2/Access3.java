package pack2;

import pack1.Access1; // pack1'deki ve Access1'deki dataya erismek icin bunu import eder. 

public class Access3 extends Access1{

	public static void main(String[] args) {

		Access1 a = new Access1(); //bunu protected icin degistirmek gerekir. Aciklamasi asagida.

// " a." yazinca onerilerde;
// 1. default access icin --> blue ucgen cikar. Because, in class of Access1, hours and minutes are default.
// 2. public access icin ---> green circle cikar. Because, in class of Access1, years and months are public. 
// 3. private access icin --> private accessi gormez. (datayi okumak icin 'get-set' kullanmak gerekir.)		
// 4. protected access icin-->	yellow diamond cikar. Because, in class of Access1, ages and century are protected. 	

		
// for default:	
		
//Access3, ayni project'te olsa bile, farkli bir package'ta oldugu icin Access1'deki defaul'tu okuyamaz.
		System.out.println(a.hours);
		System.out.println(a.minutes);	
				
				
// for public:
		
// Access3, ayni project'te olan, farkli bir package'ta olsa bile Access1'deki public'i okur.
		System.out.println(a.years);
		System.out.println(a.months);

		
// for private:
		
// Access3 can't read private data even they are in the same package or project.
		System.out.println(a.days);
		System.out.println(a.weeks);

	
// for protected:
		
// Since Access3 and Access1 aren't in the same package, Access3 can't read the protected data in Access1. Even they are in the same project.	
// Protected only lets other packages know about data inside of it if it's related to the original class. 
// So, if Access3 has 'extend Accsess1', means Access3 is a subclass of original Access1.    	
// en ustte 'public class Access3'e 'extends Access1' diye ekledik. O zaman Access1'deki dataya ulasabilir.
		System.out.println(a.ages);
		System.out.println(a.century);

// Bu sekilde yine hata verir. Cunku 'Access1 a = new Access1()'i--> 'Access3 a = new Access3()' seklinde degistirmen gerekir. 
		Access3 a1 = new Access3();
		System.out.println(a1.ages);
		System.out.println(a1.century);
		
		
		
		
		
		
		
		
		
	}

}
