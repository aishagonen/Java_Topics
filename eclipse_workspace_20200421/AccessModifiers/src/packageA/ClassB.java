package packageA;

public class ClassB {
	
		public static void turnOff() {		
			System.out.println("Turning off...");
		}	
		public static String decide() {	
			return "yes";		
		}
		public void calcArea(int w, int h) {	
			int area = w*h;
			System.out.println(area);
		}
		public int askYas(int dt) {	
			return (2020 - dt);		
		}
}
