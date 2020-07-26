
public class Assignment7 {

//1. Write a Java method to compute the average of three numbers
	public static void avarage(int a, int b, int c) {
		System.out.println((a+b+c)/3);	
	}
//2.Write a Java method to find the smallest number among three numbers.	
	public static void small(int a, int b, int c) {
		int small = Math.min(Math.min(a, b),c);
        System.out.println(small);
	}
//3.Write a Java method to display the middle character of a string.
	public static void findMiddle(String str){
		
		int position;
        int length;
        
        if (str.length() % 2 == 0){
            position = str.length() / 2 - 1;
            length = 2;
        } else{
            position = str.length() / 2;
            length = 1;
        }
        System.out.println(str.substring(position, position + length));
	}
	
	public static void main(String[] args) {

	avarage(11, 13, 31);	
	small(5784, 9794, 11081);	
	findMiddle("Idontunderstandthis");	
	findMiddle("Stillihavenoclue");
	
		
		
	}

}
