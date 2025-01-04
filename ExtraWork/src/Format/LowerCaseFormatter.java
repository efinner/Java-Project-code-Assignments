package Format;

public class LowerCaseFormatter implements Formatter {

	@Override
	public void format(String format) {
		System.out.println(format.toLowerCase());
	}

	@Override
	public void reverse(String reverseFormat) {
		String lowerreverseFormat= reverseFormat.toLowerCase();
		
		for(int i = lowerreverseFormat.length()-1; i >=0; i--){
			System.out.print(lowerreverseFormat.charAt(i));
		}
	
		System.out.println();
	}

}
