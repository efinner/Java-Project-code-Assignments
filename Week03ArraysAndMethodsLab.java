//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[]numbers={1,5,2,8,13,6}; 
		
		//or numbers[0] =1;
		//numbers[1] =5;
		//numbers[2] =2;
		//numbers[3] =8;
		//numbers[4] =13;
		//numbers[5] =6;
		
		// 2. Print out the first element in the array
	System.out.println(numbers[0]);
		
		// 3. Print out the last element in the array without using the number 5
	System.out.println(numbers[numbers.length -1]);
		
		// 4. Print out the element in the array at position 6, what happens?
//System.out.println(numbers [6]); //error message
		
		// 5. Print out the element in the array at position -1, what happens?
//System.out.println(numbers[-1]); // out of bounds it starts at 0 ArrayIndexOutOfBoundsException because -1 is not a valid index. 
			
		// 6. Write a traditional for loop that prints out each element in the array
	for (int i=0; i < numbers.length; i++) {
		System.out.println (numbers[i]);
		
	}
		// 7. Write an enhanced for loop that prints out each element in the array
for(int num : numbers) {
	System.out.println(num);
}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
int sum=0;
for (int i=0; i < numbers.length; i++) {
	sum += numbers[i];}
System.out.println(sum);
	
			
		// 9. Create a new variable called average and assign the average value of the array to it
int avg= sum/numbers.length;

System.out.println(avg);
		 
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd

for(int num : numbers) {
	if(num %2!=0)  //or if(num %2 ==1)
	System.out.println(num);
}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
String[] names = {"Sam", "Sally", "Thomas", "Robert"};
System.out.println(names[1]);
		
		// 12. Calculate the sum of all the letters in the new array
int sums = 0;
for (String name : names) {
    sums += name.length(); 
}
System.out.println(sums);
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
greet("tom");
greet("eneka");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
System.out.println(greet2("Hannah "));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
//Method 13:
//
//Prints directly inside the method.
//Does not return any value.
//Usage: Good for one-time output.
//Method 14:
//
//Returns the greeting as a String.
//Requires you to handle the printing in the calling code.
//Usage: Better when you need to store, modify, or combine the greeting with other text.


		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
System.out.println(isStringLongerThanNumber ("Hannah",  9));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
System.out.println(stringCompare(names, "Sam"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array

int [] number= {12, 3234,22,3,13,};
System.out.println(getSmallestNumber(number));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
double [] dnumber= {22.2,33.3, 72.8,373.9};
System.out.println(getAvg(dnumber));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
String[] test = {"Sam", "Sally", "Thomas", "Robert"};
int[] testLengths = takesArrayOfStrings(test);
for (int length : testLengths) {
    System.out.println(length);

}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
System.out.println(stringEvenOrOdd (test));

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		System.out.println( isPalindrome ("Hannah"));
		System.out.println( isPalindrome ("racecar"));
		System.out.println( isPalindrome ("mom"));
		System.out.println( isPalindrome ("denali"));
	
	System.out.println( isPalindrome ("Eneka"));
	
}

	

	
	// Method 13:
public static void greet(String name) {
	System.out.println("Hello  " + name);
}



	// Method 14:
public static String greet2(String name) {
	return "hi " + name;

}


	
	// Method 15:
public static boolean isStringLongerThanNumber(String string, int number) {
	if(string.length()>number) {
		return true;
	}else {
			
		}
	return false;
	
}


	// Method 16:
public static boolean stringCompare(String [] array, String string) {
	for(String str : array) {
		if (str.equals (string)) {
			return true;
		}
	}
	return false;
}

	
	// Method 17:
public static int getSmallestNumber(int [] number) {
	int smallest = number [0];
	for(int i=1; i < number.length; i++) {
		if(number[i] < smallest){
			smallest = number[i];
		}
	}
return smallest;
}

	
	// Method 18:
public static double getAvg(double[] dnumber) {
	double sum = 0;
	for(int i=0; i < dnumber.length; i++) {
		sum += dnumber[i]; 
			 
		}
double avg = sum /dnumber.length;
	
return avg;
}



	
	// Method 19:
public static int[] takesArrayOfStrings(String[] strings) {
    int[] results = new int[strings.length]; // Create an array to store lengths
    for (int i = 0; i < strings.length; i++) {
        results[i] = strings[i].length(); // Store the length of each string
    }
    return results; // Return the array of lengths
}



	// Method 20:
	
public static boolean stringEvenOrOdd(String [] array) {
	int evenLetters = 0;
	int  oddLetters=0;
	
	for(String string :array) {
		if(string.length() % 2==0) {
			evenLetters =+ string.length();
		}  else
		{ oddLetters += string.length();
		
		}
	}
	
	
	return evenLetters > oddLetters;
}

		 
	

	// Method 21:
	
public static boolean isPalindrome(String str) {
	str = str.toLowerCase();
	
	String rev="";
	for (int i = str.length()-1; i>=0; i--) {
		rev = rev + str.charAt(i);
	}
	return str.equals(rev);
}
}
// or public static boolean isPalindrome(String str){
//for(int i = 0; i<string.length(); i++) {
//	if(string.charAt(i) != string.charAt(string.length()-1-1)) {
//		return false;
//	}
//return true;
////}
//}


//
//git work flow for me 
//
//# Stage Changes
//# To stage specific files:
//git add fileName
//# To stage all changes:
//git add .
//
//# Commit Changes
//# Add a descriptive commit message:
//git commit -m "Your commit message"
//
//# Push Changes to Remote Repository
//# Push to the main branch:
//git push origin main
//
//# Optional Commands:
//# Check the status of your repository:
//git status
//# Pull the latest changes before pushing:
//git pull origin main
//# View commit history:
//git log
