package week05Chatgbtpractice;

public class ShapeApp {

	public static void main(String[] args) {
		 ShapeLogger starLogger = new StarShapeLogger();
	        ShapeLogger dashedLogger = new DashedShapeLogger();
starLogger.draw("square");
starLogger.resize("square" , 0);
		
dashedLogger.draw("cirle");
dashedLogger.resize("circle", 3);
	}

}

//Practice Exercise: ShapeLogger
//1. Create an interface named ShapeLogger.
//Define two void methods:
//draw(String shapeName)
//resize(String shapeName, int factor)
//2. Create two classes that implement the ShapeLogger interface.
//StarShapeLogger:
//Uses stars (*) to represent the shape.
//DashedShapeLogger:
//Uses dashes (-) to represent the shape.
//3. Implement the StarShapeLogger methods:
//draw(String shapeName):
//
//Prints the shape name surrounded by stars.
//Example: If the shape name is "Circle", it should print:
//markdown
//Copy code
//***Circle***
//resize(String shapeName, int factor):
//
//Prints the shape name with a note about resizing. The note should be surrounded by stars.
//Example: For "Circle" with a factor of 2, print:
//markdown
//Copy code
//Resizing ***Circle*** by a factor of 2
//4. Implement the DashedShapeLogger methods:
//draw(String shapeName):
//
//Prints the shape name with spaces between each character, using dashes as separators.
//Example: For "Circle", print:
//css
//Copy code
//C - i - r - c - l - e
//resize(String shapeName, int factor):
//
//Prints the shape name spaced out like above, with "RESIZE:" prepended.
//Example: For "Circle" with a factor of 2, print:
//vbnet
//Copy code
//RESIZE: C - i - r - c - l - e by a factor of 2
//5. Create a class named ShapeApp with a main method:
//Instantiate one instance of StarShapeLogger and one instance of DashedShapeLogger.
//Test the draw and resize methods for both instances using shape names and factors of your choice.
//Example shape names: "Square", "Triangle".
//Example factors: 3, 5.
