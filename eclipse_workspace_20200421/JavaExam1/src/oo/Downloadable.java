package oo;
// What is the result?  Q:  / SQ: 83
interface Downloadable {

	public void download();

}

interface Readable extends Downloadable { 	// line n1
	
	public void readBook();
}

abstract class Book implements Readable { 	// line n2
	
	public void readBook() {
		System.out.println("Read Book");
	}
	
}

class EBook extends Book { 					// line n3
	
	public void readBook() {
		System.out.println("Read E-Book");
	}

// 'download' methodu hem yukaridaki abstract classta -ki abstract class doesn't have to- 
// ve EBook classinda da implement edilmedigi icin, line n3 hata verir ve download methodunu @Override etmeni ister.  

	@Override
	public void download() {
		// TODO Auto-generated method stub
		
	}
	
}

/* And given the code fragment:
	Book book1 = new EBook();
	book1.readBook();
What is the result?
Answ: Compilation fails at line n3.

@Override ettikten sonraki output: Read E-Book

*/