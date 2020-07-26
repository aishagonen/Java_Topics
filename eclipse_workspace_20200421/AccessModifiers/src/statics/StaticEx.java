package statics;

public class StaticEx {
	 
	public static void main(String[] args) {

	    	StaticEx object1 = new StaticEx(), object2 = new StaticEx();
	        
	        object1.counter();
	        object2.counter();
	        
	        staticCounter();
	        staticCounter();
	        object1.staticCounter();
	        object2.staticCounter();
	        
	        System.out.println("This is non-static customerCount object1 : "  + object1.counter1);
	        System.out.println("This is non-static customerCount object2 : "  + object2.counter1);
	        System.out.println("This is static customerCount object1 : "  + object1.counter2);
	        System.out.println("This is static customerCount object2 : "  + object2.counter2);       
	    }
	
	int counter1;
    static int counter2;
    
    void counter(){
        counter1 ++;
    }
    
    static void staticCounter(){
        counter2++;
    }
}
/*  
 STATIC :
 * static variables : 
 	- static variables can be interfaced without even declaring an object.
 	- static variable'i kullanmak icin sadece 'className.' yazmak ve sonrasinda da variable'i bir seye assign etmek yeterli: 
 	 'aircrafts.wings = 2;' gibi. 
 	- Static variables are kind of behaves as global variables. 
 	- static variables are written blue and italic.   
 	- if variable is static, we can interface and use it even before the object is created.   
 	  Static olmayan variable'lari objectle kullaniyoruz,ancak static variable'lari object olusturmadan da okuyabiliriz. 
 	- Static olan classa gomuluyor, non-static objeye gomuluyor. 
	- STATIC KEYWORD HAS NOTHING TO DO WITH RETURN TYPE. 
 
 * static Methods : 
 	- Eger methodu static yaparsak, icinde kullandigimiz variable'larin da static olmasi gerekir. 
 	  Yoksa method'un basina static yazmak sadece yetmez, methodun icindeki kodda red lines olur.
 	- Static method'lari class ismiyle cagiririz, obje ile degil.
 	- Static methodlari,sadece static methodlar cagirabilir. 
 	 
 	 
 	 
 	 
 */