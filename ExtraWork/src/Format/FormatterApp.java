package Format;

public class FormatterApp {

	public static void main(String[] args) {
		UpperCaseFormatter uppercaseformat = new UpperCaseFormatter();
		
		
		LowerCaseFormatter lowercaseformat = new LowerCaseFormatter();
		uppercaseformat.format("sucker");
		uppercaseformat.reverse("pizza");
		
		lowercaseformat.reverse("job");
		lowercaseformat.format("job");
		

		
	}

}
