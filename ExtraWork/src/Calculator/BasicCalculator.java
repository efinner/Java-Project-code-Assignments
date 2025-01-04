package Calculator;

public class BasicCalculator implements Calculator {

	@Override
	public double calculate(double a, double b) {
		
		return a + b;
	}

	@Override
	public String getMode() {
		
		return "Basic Mode";
	}

}
