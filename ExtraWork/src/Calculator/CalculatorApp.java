package Calculator;

public class CalculatorApp {

    public static void main(String[] args) {
        BasicCalculator cal = new BasicCalculator(); // Instance of BasicCalculator
        ScientificCalculator fancy = new ScientificCalculator(); // Instance of ScientificCalculator

        System.out.println("Mode: " + cal.getMode());
        System.out.println("Basic Calculation (5 + 80): " + cal.calculate(5, 80));

        System.out.println("\nMode: " + fancy.getMode());
        System.out.println("Scientific Calculation (4^7): " + fancy.calculate(4, 7));
    }
}
