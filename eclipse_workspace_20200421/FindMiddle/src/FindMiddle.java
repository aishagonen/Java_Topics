
public class FindMiddle {

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
		
		findMiddle("learningJava");
		findMiddle("learn");
	}

}
