package methodsExcercises;

public class Headphones {

	String charge = "usb";
	String [] controls = {"power", "volume", "skip", "play/pause"};
	String color = "red/black";
	boolean power = false; 
		public void powerOn() {
			power = true;
		}
	
		public void powerOff() {
			power = false;
		}
	
	int volume = 0;
		public void volumeUp() {
			volume ++;
		}
	
		public void volumeDown() {
			volume --;
		}
	boolean skip = false;
		public void skipOn() {
			skip = true;
		}
		public void skipOff() {
			skip = false;
		}
	boolean play = true;
		public void playOn() {
			play = true;
		}
		public void pause() {
			play = false;
		}
}
