package methObjVoidNonvoids;
public class Methods2 { // Void - static void - public void - public static void - private static void:
/*	public :  anywhere.   >> green circle
	default:  same pack.  >> blue triangle
	private:  same class. >> use get/set | red square 
  protected:  same pack.  >> yellow diamond	
	static : —> same class : methodName();
	 	     —> dfrnt class: ClassName.methodName();
 non-static: create object to call.
			 ClassName object  =  new ClassName();
		     object.methodName(); 		     
	void    : no data will be returned.
	non-void: use ‘ return dataType; ’ 
	
public > protected > default > private.
	
*/	public static void main(String[] args) {
    	Methods2 object = new Methods2(); // non-static methodlari cagirmak icin once obje olustur. 
        object.method1(); // calling non-static way
        method2();        // calling static way
        method3(); 
        object.method4();
        method5();
    }			
	void method1(){
// access modifier : default, it can be called only within this package  
// non-static method, so we need to create object to call this method
		System.out.println("This is method 1");
    }		
    static void method2(){
// access modifier: default: it can be called only within this package
// static method: ayni packet'te sadece methodun adini yazarak cagirabilirsin.  
    	System.out.println("This is method 2");
    }   
    public static void method3(){
// access modifier: public: can be accessed from everywhere in a project
// static method: bu project'te sadece methodun adini yazarak cagirabilirsin.        
    	System.out.println("This is method 3");
    }    
    public void method4(){
// access modifier: public: can be accessed from everywhere in a project  
// non-static method: we need to create object to call this method
    	System.out.println("This is method 4");
    }    
    private static void method5() {
// access modifier: private: can be called within only this class
// static method: bu project'te methodun adini yazarak cagirabilirsin.  
    	System.out.println("This is method 5");
    }	    
}
