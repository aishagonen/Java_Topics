package constructors;

public class Constructors {

	public static void main(String[] args) {

//	aircraft cessna;
//	cessna = new aircraft();
//	aircraft saratoga = new aircraft();	
// After we wrote this constructor, top of the main class where we created object there will be red lines. 
// So we need to assign the numbers these variables.  	

//	cessna.passengers = 4;		
//	cessna.cruiseSpeed = 140;	
//	cessna.fuelBurnRate = 9.5;	 
//	cessna.fuelCapacity = 56.5;
//	
//	saratoga.passengers = 6;
//	saratoga.cruiseSpeed = 201;
//	saratoga.fuelBurnRate = 102.5;
//	saratoga.fuelCapacity = 20.5;
// Constructors, basically eliminate these all 8 lines.  	

		aircraft cessna;
		cessna = new aircraft(4, 140, 9.5, 56.5);
		aircraft saratoga = new aircraft(6, 201, 102.5, 20.5);		
	
// Now we don't need all the green lines. Just we need one line: className objectName = new ConstructorName (initialized variables); 	
	
	System.out.println("For Cessna to fly  for 2,5 hours, it takes "+ cessna.fuelNeeded(2.5)+ " gallons of fuel.");
	System.out.println("For Saragota to fly  for 2,5 hours, it takes "+ saratoga.fuelNeeded(2.5)+ " gallons of fuel.");	
	
	
	}

}
class aircraft {
	int passengers;			//number of people
	int cruiseSpeed;		// miles per hour
	double fuelCapacity;	// gallons
	double fuelBurnRate;	// gallons per hour
	
// When you create an object I want you to initialize these above variables with values. 
// So then whenever we create an object, we'll pass the four values inside of '= new aircraft();' this parenthesis.
// That's what constructor does, builds something.And we don't need all 8 lines anymore. We already have same variables in the 'aircraft' class. 

// Contructors look like a method. But the method name has to be very exact constructor name has to be same name with class. 
// So Java knows it is a constructor.
// We don't put void, or integer, or anything out in front of the constructor name, because it is not really a method that returns anything. 
// Then you paranthesis of end the constructor name. Then you have to define to Java what values this constructor is going to take.
// Above we have variables need to initialize. So we put some parameters in the paranthesis. Let's put first letter of these variables. 
// so we write the constructor like -->' aircraft (int p, int c, double fc, double fbr)'  and open and close curly braces. 
	aircraft (int p, int c, double fc, double fbr){
		passengers = p;
		cruiseSpeed = c;
		fuelCapacity = fc;
		fuelBurnRate = fbr;
	}
// After we wrote this constructor, top of the main class where we created object there will be red lines. So we need to assign the numbers these variables.  	
	
	double fuelNeeded(double time) {    // non-void with argument
		 return fuelBurnRate *time;    // you can declare a name and assign the answer to this name, but we choose this way.
	}	

}

// Whenever you look at classes in Java, even if you don't define the constructor there is always going to be constructor in the background in Java. 
// When we create an object, we basically call an invisible constructor with the name 'aircraft' that has not any parameter, so it has empty paranthesis '()'. 
// 










