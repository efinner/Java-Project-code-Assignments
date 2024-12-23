package week05Chatgbtpractice;

public class StarShapeLogger implements ShapeLogger {

    @Override
    public void draw(String shapeName) {
        System.out.println("***" + shapeName + "***");
    }

    @Override
    public void resize(String shapeName, int factor) {
        System.out.println("Resizing ***" + shapeName + "*** by a factor of " + factor);
    }
}
