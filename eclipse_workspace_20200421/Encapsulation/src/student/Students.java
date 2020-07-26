package student;

public class Students {

	String name;  // bunlar private degil. Main method'ta 'set.name' yazip, 's.name' yazinca buraya ulasiyoruz. Asagida private yaptik. farki gor. 
	int age;
	
// 'public' cunku everyone who wants to create student can access. // 'void' yazdik cunku return anything. 
	public void setName(String newName) {  // static yazmadik cunku 'static' means, you don't have to make object to call the method. 
		name = newName;
	}
	
	public void setAge(int newAge) {  // static yazmadik cunku 'static' means, you don't have to make object to call the method. 
		age  = newAge;
	}

	
// ****************
	
	private String name1;  // 'private' yazdigimiz icin, main method'ta 's.' yazinca 'name'e ulasamayiz. 
	private int age1;	  // once 'getName' method yazmamiz lazim. 
	
	public void setName1(String newName1) { 
		name1 = newName1;
	}
	
	public String getName1() {
		return name1;
	}
	
	public void setAge1(int newAge1) {
		age1  = newAge1;
	}
	
	public int getAge1() {
		return age1;
	}
	
	
	
	
	
	
	
}
