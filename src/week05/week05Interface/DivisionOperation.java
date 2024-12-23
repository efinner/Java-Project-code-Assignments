package week05.week05Interface;

public class DivisionOperation implements MathOperation {

	@Override
	public double performOperation(double number, double number2) {
		if (number2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
		return number / number2;
	}

}
