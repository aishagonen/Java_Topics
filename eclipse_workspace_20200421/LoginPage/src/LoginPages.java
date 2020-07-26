import java.util.ArrayList;

public class LoginPages {

	public static void main(String[] args) {
	
		ArrayList<String>loginPageLinkList = new ArrayList<String>();
		
		loginPageLinkList.add("Login");
		loginPageLinkList.add("Sign up");
		loginPageLinkList.add("Forgot password");
		loginPageLinkList.add("Privacy Policy");
		loginPageLinkList.add("Contact us");

		System.out.println("Total links are on login page is " + loginPageLinkList.size());		
		
		for (int i=0; i < loginPageLinkList.size(); i++) {
			System.out.println(loginPageLinkList.get(i));
																												
				if (loginPageLinkList.get(i).equals("Privacy Policy")) {
					System.out.println("Click on: " + loginPageLinkList.get(i));
					break;  // break'i kaldirirsan 'Contact us'i da yazdirir. yoksa yazdirmaz. 
				}			
		}

		
	}

}
