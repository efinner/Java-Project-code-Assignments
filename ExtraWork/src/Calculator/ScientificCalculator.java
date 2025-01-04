package Calculator;

public class ScientificCalculator implements Calculator{

	@Override
	public double calculate(double a, double b) {
	
		return Math.pow(a, b);
	}

	@Override
	public String getMode() {
		
		return "Scientific Mode";
	}

}
