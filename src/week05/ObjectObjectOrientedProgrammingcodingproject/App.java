package week05.ObjectObjectOrientedProgrammingcodingproject;

public class App {

	public static void main(String[] args) {
		Logger spaceLogger = new SpacedLogger(); //creates an instance of the SpacedLogger class, but it's stored as a reference to the Logger interface.
		Logger asteriskLogger = new AsteriskLogger();// creates an instance of the AsteriskLogger class, also stored as a reference to the Logger interface.

		System.out.println("Testing spacelogger:   ");
		spaceLogger.log("Hello!");//calls the log method from the SpacedLogger instance.
		spaceLogger.error("Wait");//calls the error method from the SpacedLogger instance.
		
		System.out.println("\n testing asterisklogger");
		asteriskLogger.log("Hello Welcome"); //calls the log method from the AsteriskLogger instance.
		asteriskLogger.error("Stop Do not proceed!");
		
		System.out.println(".....................................--------------------------");
		
	}
	
	
}


//Create a class named App that has a main method.
//
//a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//
//b. Test both methods on both instances, passing in Strings of your choice.
//










