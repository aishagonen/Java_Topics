package w6;

public class PersonTest {

	public static void main(String[] args) {

		Person person1 = new Person("James", 50, "Agent");
// 		person1.age = 80;  age private old. icin bu sekilde age degismez. age'i degismek icin method olustururuz
		person1.changeTheAge(51);
		person1.showAge();
		person1.setJob("Retired");
		System.out.println(person1.getJob());
		person1.setName("Bond");
		System.out.println(person1.getName());
		
	}

}
