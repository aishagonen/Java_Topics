package ilhanBey;

public class StringPractices {

	public static void main(String[] args) {

		
// 1. Find length to String: 		
		String str = "We are learning Java with Bob";
		System.out.println(str.length());
		
// 2.a. find Automation that starts in which index:
		String str2 = "I will be an Automation engineer and will start aa new career with SiliconeLabs which is aa school of technology.";	
		System.out.println(str2.indexOf("Automation"));
	
// 2.b.create aa logic and if your string contains 'engineer' print the console "yes engineer" if not print "no, engineer"
		if (str2.contains("engineer")) {
			System.out.println("yes engineer.");
		} else {
			System.out.println("no engineer.");
		}
		
// 2.c. find index of 'start' word in the string:
		System.out.println(str2.indexOf("start"));
		
// 3. Remove before and after spaces in the string: 	
		String tr = " SiliconeLabs Company ";
		System.out.println(tr.trim());
		
// 4. Convert all values in the String to upperCase:		
		String sm = "message";
		System.out.println(sm.toUpperCase());
		
// 5. Convert all values in the String to lowercase:	
		String up = "SILICONELABS";
		System.out.println(up.toLowerCase());
		
// 6. Print all String values on the console without _ (underscore) / Remove _ (underscore):
		String cars = "Mercedes_Hyundai_GMC_Honda";
		System.out.println(cars.replaceAll("_", ", "));		

// 7- Remove & (and) Print only YeshivaUniversity
		String uni = "HarvardUniversity&YeshivaUniversity&Rutgers&OhioState";
		System.out.println(uni.substring(18,35));
		
// 8.  Create aa logic and use virus. if your string contains virus print out on the console "Virus was found". if not print "There is no virus":		
		String cn = "This is aa virus";
		if (cn.contains("virus")) {
			System.out.println("Virus was found!");
		} else {
			System.out.println("There is no virus.");
		}
				
// 9. Print like this 09/10/1992:	
		String s1 = "09+10+1992";
		System.out.println(s1.replace('+', '/'));					
				
		
	}

}
