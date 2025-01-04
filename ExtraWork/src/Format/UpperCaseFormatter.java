package Format;

public class UpperCaseFormatter implements Formatter {

	@Override
	public void format(String format) {
		System.out.println(format.toUpperCase());
		
	}

	@Override
	public void reverse(String reverseFormat) {
		
		String reverseFormatUppercase=  reverseFormat.toUpperCase();
		for (int i= reverseFormatUppercase.length()-1; i >=0;i--) {
			System.out.print(reverseFormatUppercase.charAt(i));
		
		}
			System.out.println();
		}
			
			
		
	}


