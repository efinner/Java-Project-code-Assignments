package week05Chatgbtpractice;

public class DashedShapeLogger implements ShapeLogger{
	@Override
    public void draw(String shapeName) {
        // Add dashes between each character of the shape name
        StringBuilder dashedShape = new StringBuilder();
        for (int i = 0; i < shapeName.length(); i++) {
            dashedShape.append(shapeName.charAt(i));
            if (i < shapeName.length() - 1) {
                dashedShape.append(" - "); // Add dashes between characters
            }
        }
        System.out.println(dashedShape.toString());
    }

    @Override
    public void resize(String shapeName, int factor) {
        // Print a message indicating the shape is being resized with dashes
        System.out.print("RESIZE: ");
        draw(shapeName); // Reuse the draw method to show dashes
        System.out.println(" by a factor of " + factor);
    }
}