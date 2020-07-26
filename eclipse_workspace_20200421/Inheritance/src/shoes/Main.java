package shoes;

public class Main {

	public static void main(String[] args) {

		Shoe s = new Shoe ("Nike", 10 );
		System.out.println(s.brand + " - " + s.size);
		
		
		Walking w = new Walking (true, "Nike", 10 );
		System.out.println( w.goreTex +" - "+ w.brand +" - "+ w.size);
		
		Running r = new Running (4.5, "Nike", 10 );
		System.out.println( r.weight +" - "+ w.brand +" - "+ w.size);
		

		
// SuperClass : Shoe.
// SubClass: Walking, Running.
// MainClass : Main

	}

}
