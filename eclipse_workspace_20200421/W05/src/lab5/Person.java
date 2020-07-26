package lab5;

import java.util.Arrays;

public class Person {
	
	public String [] hobbies;
	public String [] friends;
	
	public void tellHobbies() {
		for (int i = 0; i < hobbies.length ; i++) {
			System.out.println(hobbies[i]);
		}	
// 2. way: 
//		for (String hobb : hobbies) {
//			System.out.println(hobb); // memorydeki yeri gosterir. (hobbies) yazmak gerekir. 
//		}
// 3. way:			
//		for (String hobb : hobbies) {	
//			}System.out.println(Arrays.toString(hobbies));

		
	}
	public void tellFriends() {
		for (int i = 0; i < friends.length ; i++) {
			System.out.println(friends[i]);
		}
	}
	
	public static void main(String[] args) {

		Person charlie = new Person();
		
		String arr [] = {"Fishing", "Reading","Gardening"};
		charlie.hobbies = arr;
		charlie.tellHobbies();
		
		String arr1 [] = {"Lucy", "Patty","Linus"};
		charlie.friends = arr1;
		charlie.tellFriends();
		
	}

}
