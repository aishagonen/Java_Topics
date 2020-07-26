import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.rmi.server.RMIClassLoader;
import java.util.Scanner;

public class RoboticFun {

	public static void main(String[] args) throws AWTException, InterruptedException {
	
		    Thread.sleep(2000); 
		    Scanner kb = new Scanner(System.in);
		   		
		    // Create an instance of Robot class 
		    Robot robot = new Robot(); 
		  
		    // Press keys using robot. A gap of 
		    // of 500 mili seconds is added after 
		    // every key press 
		    robot.keyPress(KeyEvent.VK_H); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_E); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_L); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_L); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_O); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_SPACE); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_F); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_R); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_O); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_M); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_SPACE); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_G); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_E); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_E); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_K); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_S); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_F); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_O); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_R); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_G); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_E); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_E); 
		    Thread.sleep(500); 
		    robot.keyPress(KeyEvent.VK_K); 
		    for (int i = 0; i < 300; i++) {
					//Thread.sleep(500);
					robot.keyPress(KeyEvent.VK_S);
				}
				
		    String message = kb.nextLine();
		    System.out.println(message);	
		
	}

}
