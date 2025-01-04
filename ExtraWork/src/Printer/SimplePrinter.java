package Printer;

public class SimplePrinter implements Printer {

	@Override
	public void print(String printing) {
		System.out.println(printing);
		
	}

	@Override
	public void printInCaps(String capsPrint) {
		System.out.println(capsPrint.toUpperCase());
	}

}
