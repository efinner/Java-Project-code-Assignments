package Printer;

public class PrintApp {

	public static void main(String[] args) {
		Printer simplePrint = new SimplePrinter();//instance
		Printer repeatPrint = new RepeaterPrinter();//instance
				System.out.println("testing the simple print");
				simplePrint.print("dawg");
				simplePrint.printInCaps("dawgww");
				
				
				System.out.println("testing ot repeat print");
	repeatPrint.print("ahhhkkjjj");
	repeatPrint.printInCaps("girlbye");
	}

}
