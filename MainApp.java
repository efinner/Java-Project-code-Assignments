package week05project;

public class MainApp {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
	    Logger spacedLogger = new SpacedLogger();

	    // Testing AsteriskLogger
	    asteriskLogger.log("Hello");
	    asteriskLogger.error("Do not go there");

	    // Testing SpacedLogger
	    spacedLogger.log("Hello Test");
	    spacedLogger.error("Stop do not ");
		

	}

}
