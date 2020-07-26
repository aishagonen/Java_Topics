package mouses;

public class MouseTest {

	public static void main(String[] args) {

		Mouse1 m1 = new Mouse1();
		
		m1.connect();
		m1.rightClick();
		m1.leftClick();
		m1.scrollDown();
		m1.scrollUp();
		m1.color();
		
		Mouse2 m2 =new Mouse2();
		
		m2.rightClick();
		m2.leftClick();
		m2.scrollDown();
		m2.scrollUp();
		m2.color();
		
	}

}
