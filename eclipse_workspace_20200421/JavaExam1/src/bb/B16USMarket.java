package bb;
//SQ: 73

SalesMan.java:
package sales;
public class SalesMan{ }


Product.java:
package sales.products;
public class Product{ }


Market.java:
package market;
	// line n2
public class B16USMarket {
	SalesMan sm;
	Product p;
	
}


/*
	Which code, when inserted at line n2, enables code compile?
	Answ: import sales* 
 		  import sales.product*	
	
	import sales & import sales.product   ==> package'lar sadece import edilmez. Hatali yazim. 
	import sales* & import sales.product* ==> package'larin icindeki butun class'lari import eder. 


