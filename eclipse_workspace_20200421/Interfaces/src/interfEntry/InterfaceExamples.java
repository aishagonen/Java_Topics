package interfEntry;
/* Interface:
 * To make an interface in Java, all you do type:'interface Name { } outside of the class. 
 * Interfaces are not class.   
 * Interfaces exactly is an outline for the class. Any objects your class in Java has attributes and things they can do. 
   So create an outline for that we just need to list out attributes and things they can do.
 * Interfaces are helpful because it lets you keep track what you need.
 * You have to have every method from the interface. 
 * Interfaces contain only public static final variables by default.
 * Interfaces' methods arepublic abstract methods (no  body) by default.So you don't have to write 'abstract' head of methodsName.  
 * Can't contain constractor and so obje olusturulamaz. Cunku;  
 * 1.Constaructors are used for eliminate the default values by user defined values. Interfaces' all  data members are; 'public static final'.
 * So no need to eliminate interfaces' values.
 * 2.Constructor is like a method  and it is a  concrete method.And interface doesn't have concrete method. It has only abstract methods.  
 * Can extend other intefaces.   *class 'extend' class   /  *class 'impelemnts' interf1    /  *interf1 'extends' interf2  / 
 * A class can have more than one interfaces (but extend to just one abstract class or one regular class). 
 * Interfaces can't implement a class. 
 * Can be nested inside other interface.
 * Multiple inheritance  : If a class implements multiple interfaces or an interface extends multiple interfaces is caleed 'multiple inheritance'.
 * Marker / tagged Interface : An interface has no member. Epty interface. 
    
 
 */

interface interf {

	String color = "Blue";

	void fillUp();

	void pourOut();
}

public class InterfaceExamples implements interf { // buraya implement'i ekleyince InterfaceExmpl'in altinda kirmizi
													// cizgi cikti
// ve 'Add unimplemented methods' onerdi. Ona tiklayinca asagidaki'@Override' kismi main methodun hemen altina eklendi. 

	public static void main(String[] args) {

		System.out.println(color);

		InterfaceExamples ex = new InterfaceExamples();

		ex.fillUp();
		ex.pourOut();
	}

// Interface'e ne eklesek bu calssa ama main method'un disinda yazmamiz gerekiyor.'public class InterfaceExamples implements..' kismi kirmizi oluyor, ekle diyor.
// 'Add unimplemented methods'a tiklayinca kendisi otomatik ekliyor. 

	@Override
	public void fillUp() {
		System.out.println("It is filled.");
	}

	@Override
	public void pourOut() {
		System.out.println("It is pour out.");
	}

}
