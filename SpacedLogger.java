package week05project;

public class SpacedLogger  implements Logger{
	@Override
    public void log(String message) {
        // Creates a spaced version of the log message
        System.out.println(transformToSpaced(message));
    }

    @Override
    public void error(String message) {
        // Creates a spaced version of the error message, prefixed by "ERROR:"
        System.out.println("ERROR: " + transformToSpaced(message));
    }

    // Helper method to add spaces between characters
    private String transformToSpaced(String message) {
        StringBuilder spacedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            spacedMessage.append(message.charAt(i));
            if (i < message.length() - 1) {
                spacedMessage.append(" ");
            }
        }
        return spacedMessage.toString();
    }
}
