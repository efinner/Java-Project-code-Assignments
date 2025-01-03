package week05project;

public class AsteriskLogger implements Logger {
	@Override
    public void log(String message) {
        // Prints the message surrounded by three asterisks on each side
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        // Prints the error message surrounded by three asterisks and prefixed by "ERROR:"
        System.out.println("****************");
        System.out.println("***ERROR: " + message + "***");
        System.out.println("****************");
    }
}
