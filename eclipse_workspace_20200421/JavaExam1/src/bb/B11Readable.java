package bb;
//SQ:47 & 86

interface B11Readable {
	
	public void readBook();
	public void setBookMark();
}

abstract class Book implements B11Readable {  	// line n1
	
	public void readBook() { }
	//public abstract void setBookMark();	// line n2  // abstract class oldugu icin setBookMark();'i implement etmesine gerek yok.  
}

class EBook extends Book { 			// line n3
	
	public void readBook() { }
						// line n4
	
//	@Override
//	public void setBookMark() {
//		// TODO Auto-generated method stub
//		
//	}
	
}

/* 
 * Which option enables the code to compile? 
   Answ: At line n4 insert:
   		 public void setBookMark() {}
    
 * EBook class'i, concrete yani normal class oldugu icin onun Overriden methodlari implement etmesi gerekiyor.
   line n3 hata verir. o nedenle line n4'e methodu override etmemiz gerekir. 
 
 */
