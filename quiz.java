package week03;

public class quiz {

	public static void main(String[] args) {
		
		String result = concatenateWord("Hello", 3);
		System.out.println(result);
	    }
		
	public static String concatenateWord(String word, int number) 
	{ String result = ""; 
	for (int index = 1; index <= number; index++)
	{ result = result + word; } 
	return result; }
		
		}
	
	