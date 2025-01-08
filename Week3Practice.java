package week03;

public class Week3Practice {

    public static void main(String[] args) {
        
        //
        // Arrays:
        //
        
        // 1. Create an array with the following values: 3, 7, 1, 9, 12, 4
int[]  numbers= {3, 7, 1, 9, 12, 4};
System.out.println(numbers[4]);
        
        // 2. Print out the second element in the array
System.out.println(numbers[1]);
        
        // 3. Print out the last element in the array using the length property
System.out.println(numbers.length -2);
        
        // 4. Attempt to access the element in the array at position 10, what happens?
//System.out.println(numbers [9]);
        
        // 5. Create a for loop that doubles each value in the array and prints the result
for(int i = 0; i < numbers.length; i++)
System.out.println(numbers[i]);
        
        // 6. Write an enhanced for loop that prints out each element in the array in reverse order

for (int i = numbers.length - 1; i >= 0; i--) {
    System.out.println(numbers[i]);
}

        
        // 7. Create a new variable called product, write a loop that multiplies 
        //    each element in the array and stores the result in the variable product
int product = 7;
for (int i = 0; i< numbers.length; i++)
	product*= numbers[i];

System.out.println(product);

        
        // 8. Write a loop that prints out each number in the array 
        //    only if the number is greater than 5
//    each element in the array and stores the result in the variable product
int stop= 5;
for (int i = 0; i< numbers.length; i++)
	if(numbers [i] > stop) {
System.out.println(numbers[i]);
	}
        // 9. Create an array of Strings with the values "Alice", "Bob", "Charlie", "David"
String[] namesArr = {"Alice", "bob", "davis", "hannah"};
        System.out.println(namesArr[2]);
        // 10. Calculate and print the average length of the names in the array

        int total =0;
        for (int i = 0; i< numbers.length; i++)
        	total+= numbers.length;
        int avg = total/numbers.length;
System.out.println("The avage is " + avg);
        //
        // Methods:
        //
        
        // 11. Write and test a method that takes a String name and prints a farewell message.
        //     This method returns nothing.

String personName = "Hannah";
String message = farewellMessage(personName);
System.out.println(message); 
        // 12. Write and test a method that takes a String name and 
        //     returns a farewell message. Do not print in the method.

        
        // Compare method 11 and method 12:
        //     a. Analyze the difference between these two methods.
        //     b. What do you find?
        //     c. How are they different?

        
        // 13. Write and test a method that takes a String and an int and 
        //     returns true if the number of letters in the string is less than the int

System.out.println(isStringLongerThanNumber("eneka", 2));
        
        // 14. Write and test a method that takes an array of integers and 
        //     returns the largest number in the array
int large = getLargestNumber(numbers);
        System.out.println(large);
        // 15. Write and test a method that takes an array of doubles and 
        //     returns the sum of all the values in the array

        
        // 16. Write and test a method that takes an array of Strings and 
        //     returns an array of booleans where each element is true 
        //     if the string at that position starts with a vowel

                
        // 17. Write and test a method that takes an array of Strings and 
        //     returns true if the total number of letters for all strings 
        //     with an odd length is greater than those with an even length.

    
        // 18. Write and test a method that takes a String and 
        //     returns true if the string contains the same number of vowels and consonants

        
    }

    // Method 11:
    
    public static String farewellMessage(String personName) {
		String message="Hello How are you? ";
		return  message + personName;
	}
    // Method 12:

    
    // Method 13:

    public static boolean isStringLongerThanNumber(String string, int number) {
    	if(string.length()<number) {
    		return true;
    	}else {
    			
    		}
    	return false;
    }
    	
    // Method 14:

    public static int getLargestNumber(int [] numbers) {
    	int large = numbers [0];
    	for(int i=0; i < numbers.length; i++) {
    		if(numbers[i] > large){
    			large = numbers[i];
    		}
    	}
    return large;
    }

    // Method 15:

    
    // Method 16:

    
    // Method 17:
    
    // Method 18:
 
    }

}
