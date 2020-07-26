package pack1;
public class Access1 {
// There are 4 types of Java Access modifiers: 
// default, public, private, protected. 
	
// 1. default: when you don't write anything, it's using 'default' access modifier.
// you didn't put anything infront of data, this means, data is default. 
// For the other 3 types access modifier, you  have to put their name infront of data.    	
// 'default' access modifier lets everyone in same package see all data.
// default access icin --> blue ucgen cikar.	
// Access3, ayni project'te olsa bile, farkli bir package'ta oldugu icin Access 1'deki defaul'tu okuyamaz. 
// Access2 ayni package'te oldugu icin defaultu okur.		
	int hours = 3;
	int minutes = 47;	

//*************************************************************	
// 2. public: you have to put 'public' infront of data. 
// Since Access3 and Access2 are the same project, they read the public data in Access1.
// public access icin ---> green circle cikar. 	
	public int years = 2010;
	public int months = 3;

//*************************************************************	
// 3. private: you have to put 'private' infront of data.
// Access2 and Access3 can't read private data. Only Access1 reads.Because data is in the same class.
// private access icin --> private accessi gormez. (datayi okumak icin 'get-set' kullanmak gerekir.)
	
	private int weeks = 13;
	private int days = 5;	

//*************************************************************	
// 4. protected: 
// Similar to default, accessible in same package. Protected only lets other packages know about data inside of it if it's related to the original class. 
// it has visibility in sub classes. 
// This access modifier is generally used in a parent child relationship.
// 4. protected access icin-->	yellow diamond cikar.	
// So, if Access3 has 'extend Accsess1', means Access3 is a subclass of original Access1.    	
// Since Access2 and Access1 are in the same package, Access2 read the protected data in Access1.
// Since Access3 and Access1 aren't in the same package, Access3 can't read the protected data in Access1. Even they are in the same project.		
	protected int ages = 7;
	protected int century = 11;

//*************************************************************		
// different way for Access2, gets ages data: 
// protected 'ages'datasi icin, 'get' metodunu yazmalisin ki Access2 buraya ulasabilsin ve 'System.out.println(a1.getAges());'sonucu gostersin. 	
	public int getAges() {
		return ages;
	}	

// Eger ustteki get metodunu 'default' yaparsan yani int'in basina hic bir sey yazmazsan, public gibi davranir ve datayi okur.
// Ama eger get metodunu 'private' yaparsan, Access2, 'ages' datasina ulasamaz.
// Eger 'protected' yaparsan, ayni package'da olduklari icin 'ages' datasini okur.		
/* Eger hepsini private yaparsan sadece Access1 okuyabilir. 
	   private int ages = 7;
	   private int century = 11;	
	   private int getAges() {
			return ages;
	   }
 */	
}
