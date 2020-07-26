package basicOOP;

public class Food {

	public static void main(String[] args) {
		
		Food sishKebab = new Food();
		sishKebab.kebab("lamb", "pepper");

		Food sushi = new Food();
		sushi.sushi("salmon", "rice");
		
	}

	public void kebab(String meat, String vegetable) {
		
		String  kebab = meat + vegetable;
		System.out.println("Kebab is made from " + meat + " and " + vegetable);
	}
	
	public void sushi(String fish, String food) {
		
		String  sushi = fish + food;
		System.out.println("Sushi is made from " + fish + " and " +  food);
	}
	
	
}
