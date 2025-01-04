package Printer;

public class RepeaterPrinter implements Printer {

	@Override
	public void print(String printing) {
		System.out.println(printing + " " + printing);
		
	}

	@Override
	public void printInCaps(String capsPrint) {
		
	String upperCase= capsPrint.toUpperCase();
	System.out.println(upperCase + " " + upperCase);
			
		}
		
	}



