package encapsuls;

public class Accounts {

	String name;
	int age;
	
	
	public static void main(String[] args) {

		Accounts a =new Accounts();
		
		a.age = 34;
		a.name = "Pablo";
	
// 1. Way:asagidaki gibi tek tek yazmak:
		System.out.println(a.age +", " + a.name);
		
// 2. Way: 'printDetails' methodunu cagirmak:	
		a.printDetails();
		
// 3. Way --> Set:
		a.setName("Pabloo");
		a.printDetails ();
		
		a.setAge(35);
		a.printDetails();

//4 .Way --> Get:		
		System.out.println(a.getName());
		System.out.println(a.getAge());
		a.printDetails();
		
	} // main method ends here. 
	
		
// 2.way'de main methodun disinda bir method yazip onu, main methodun icinde cagirip kullanabilirsin: 
		
		public void printDetails() {
			System.out.println(name + ", " + age);
			// bunu getterdan sonra cagirirken soyle duzenlemek daha dogru  olur:
			System.out.println(getName() + "," + getAge());
		}
		
// Getter ve Setter kullanmak: 
// 3. Way: Set: 	Setters set within the parameter to the variable.
		
		public void setName (String name) {
			this.name = name;    // 'this.name' is under the 'public class Accounts { String name;'deki  name. 
		}						// 'public void setName (String name)'deki name degil.
		
		public void setAge(int age) {
			this.age = age;
		}
		
// 4. Way: Get: Getters just get the variable.
		
		public String getName() {
			return this.name;
		}
		public Integer getAge() {
			return this.age;
		}
		
		
	

}
