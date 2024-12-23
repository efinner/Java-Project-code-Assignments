package week05.ObjectObjectOrientedProgrammingcodingproject;

public class SpacedLogger implements Logger{

	@Override
	public void log(String logMessage) {
		StringBuilder space= new StringBuilder();
		for( int i =0; i<logMessage.length();i++) {
			space.append(logMessage.charAt(i));
		if(i< logMessage.length()-1) {
			space.append(" ");
	}
		}
		System.out.println(space.toString());
	}
	
	@Override
	public void error(String errorMessage) {
		StringBuilder space= new StringBuilder("ERROR: ");
		for(int j= 0; j<errorMessage.length();j++) {
			space.append(errorMessage.charAt(j));
			if(j<errorMessage.length()-1) {
				space.append(" ");
				
			}
		}
		System.out.println(space.toString());
	}

}

//implement the SpacedLogger methods:
//
//Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.
//
//
//a. If the log method received “Hello” as an argument, it should print H e l l o
//
//b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)