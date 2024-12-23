package week05.ObjectObjectOrientedProgrammingcodingproject;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String logMessage) {
	System.out.println("****"+ logMessage + "****");
	}

	@Override
	public void error(String errorMessage) {
		System.out.println("****ERROR: "+ errorMessage + "****");
		
	}

}
//a.  The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).
//
//b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:
//
//****************
//
//***Error: Hello***
//
//****************