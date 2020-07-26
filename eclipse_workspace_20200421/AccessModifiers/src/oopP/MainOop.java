package oopP;

public class MainOop implements OopInterfc { 
// Inheritence icin diger classlar 'extends' kullanirken, Interface icin 'implements' kullanilir. 
	
	public static void main(String[] args) {

//// Encapsulation : getter/setter : 'Oop class'indan cagirdik:
//		Oop mop = new Oop();
//		mop.setFlavor ("Beef");
//		System.out.println(mop.getFlavor());
//	
//// ***************************************** ustteki kisim 'encapsulation' icindi.	  
		
		MainOop mop = new MainOop();
		mop.openBag();	
	}

	@Override
	public void openBag() {
		System.out.println("Bag  opened. ");	
	}

	

}
