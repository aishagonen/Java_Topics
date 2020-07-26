package methodsExcercises;

public class HeadphonesTest {

	public static void main(String[] args) {

		Headphones h = new Headphones();
		
		System.out.println(h.color);
		System.out.println(h.charge);
		
		System.out.println(h.volume);
			h.volumeUp();
			System.out.println(h.volume);
			
			h.volumeDown();
			System.out.println(h.volume);
			
		System.out.println(h.power);
			h.powerOff();;
			System.out.println(h.power);
		
			h.powerOn();
			System.out.println(h.power);
			
		System.out.println(h.skip);
			h.skipOff();
			System.out.println(h.skip);
		
			h.skipOn();
			System.out.println(h.skip);
			
		System.out.println(h.play);
			h.playOn();
			System.out.println(h.play);
		
			h.pause();
			System.out.println(h.play);
		
		
	}

}
