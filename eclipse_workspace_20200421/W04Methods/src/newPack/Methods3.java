package newPack;
import java.util.ArrayList;
public class Methods3 {
	public static void main(String[] args) {	
    	System.out.println(calculate1(5, 6));
        System.out.println(calculate1(5, 6, 7));
        System.out.println(calculate1(4,5,6,7));
        
        helloSiliconeLabs(); // "Hello Silicone Labs", calling this method right now is useless.
        helloWorld();
        System.out.println(helloSiliconeLabs() + "I love java");
        //System.out.println(helloWorld());// =  System.out.println(System.out.println("Hello World"));
        Methods3 object = new Methods3();
        System.out.println(object.square(7) + 88); // object.square(7) = 49,  I can make arithmetic calculation with that
        System.out.println(object.printOut("Slack"));
        System.out.println(methodName() + " do anything :D");
//       ArrayList<String> a1;
//    	a1 = methodName();
//    	a1.add("elma");
//    	System.out.println(a1);     
    }
	public static String helloSiliconeLabs(){    
        return "Hello Silicone Labs ";
    }  
    public static void helloWorld(){
        System.out.println("Hello World");
    }
    int square(int number){
        return number*number;
    }
    String printOut(String print){
        return print + "!";
    }
    static ArrayList<String> methodName(){     
    	ArrayList<String> arayListName = new ArrayList<>(); 
    	arayListName.add("Ahmet Can");
        return arayListName;
    }
  // Overloading methods:
    static int calculate1(int a, int b){
        return a + b;
    }
    static int calculate1(int a, int b, int c){
        return a + b + c;
    }
    static int calculate1(int a, int b, int c, int d){
        return a + b + c;
    }
}
