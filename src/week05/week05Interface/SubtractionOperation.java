package week05.week05Interface;

public class SubtractionOperation implements MathOperation {

	@Override
	public double performOperation(double number, double number2) {
		
		return number - number2;
	}

}
