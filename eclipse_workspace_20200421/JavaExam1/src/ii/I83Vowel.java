package ii;
//SQ:19
public class I83Vowel {

	private char var;
		
	public static void main(String[] args) {
		
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
	
		I83Vowel obj1 = new I83Vowel();
		I83Vowel obj2 = new I83Vowel();
		
		obj1.var = 'i';
		obj2.var = 'o';
		
		System.out.println(var1 + ", " + var2);
		System.out.println(obj1.var + ", " + obj2.var);
	}

}


/*

Answ: a, e, i, o



*/