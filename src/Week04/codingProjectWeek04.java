package Week04;


public class codingProjectWeek04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//number 1
		int[]ages={3,9,23,64,2,8,28,93}; 
		//number 1 a
			int result = ages[ages.length-1] - ages[0];
			System.out.println("Answer to number 1  = " + result);
			
			// number 1b
			int[]ages2= {3,4,22,5,63,6,7,90,9}; 
			
			
			//number 1 ii ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the 
			//value of the first element in the new array ages2 from the last element of ages2). 
			int result2 = ages2[ages2.length-1] - ages2[0];
			System.out.println("Subtraction of first element from the last element " + result2);
			
			
			
//			iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
			// using the .length and - ages/ages2[0] allows the program to find the first element and the 
			//last element no matter how many elements are in the array. This method protects against errors that could occur
			//if you hard-coded array indices, such as ages[7].
			
			// number 1c loop to iterate through the array and calculate the average age. Print the result to the console.
			int total =0; // total starting at 0
	      for(int age: ages) { // for loop to add up all the numbers in the array ages. this will be a sum. 
	    	  total+= age; //add the value of age to total and update total with the new sum.
	      }
	      for(int age: ages2) { //// for loop to add up all the numbers in the array ages2. this will be a sum. 
	    	  total+=age;
	      }
	        	
	     int avg = total/ (ages.length + ages2.length);
			
		System.out.println("Avg of the two arrays = " + avg);
			//number2 create an array of string
		String []names ={"Sam","Tommy","Tim","Sally","Buck","Bob"};
		//number 2a
		// Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int totalLetters =0;
		for(String name :names) {  //Declares a variable name of type String.This variable will temporarily hold each item from the names collection during the loop.
			totalLetters+=name.length();//+=:This is the addition assignment operator.It adds the value on the right-hand side (name.length()) to the current value of totalLetters, and then stores the result back in totalLetters.
		}
		int letterAvg = totalLetters/ names.length;
		System.out.println("calculate the average. The Avg is  " + letterAvg);
		
		
		//number 2b
		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
		//and print the result to the console.
		StringBuilder resultcon = new StringBuilder();
			for(int i =0; i < names.length;i++) {
				 resultcon.append(names[i]);
		            if (i < names.length - 1) {
		                resultcon.append(" "); /// Add space between names, but not after the last one
		            }
			}
			System.out.println(resultcon);// Print the concatenated string
			//number 3	
			System.out.println("The last name is " + names[names.length -1]);//Use .length -1 to get the last element
			//number 4
			System.out.println("The first name is " + names[0]); // remove .length and add [0]
			
		//number 5	Create a new array of int called nameLengths. Write a loop to iterate over the previously
			//created names array and add the length of each name to the nameLengths array.
	 int []namelengths = new int [names.length];
	 
	 for(int i = 0; i <names.length;i++) {  //for loop to iterate through each index of the names array from 0 to names.length - 1. For each index i, I accessed the name at that index, calculated its length using the .length() method, and then stored this length in the corresponding index of the nameLengths array.
		 namelengths[i]= names[i].length();

		 System.out.println("number 5 " + names[i] + " "+  namelengths[i]);
	 }
	//number 6 Write a loop to iterate over the nameLengths array and
	 //calculate the sum of all the elements in the array. Print the result to the console.
	 int sum=0;
	 for(int i=0; i < namelengths.length; i++) {
		 sum += names[i].length(); 
	 }
		 
	 System.out.println("Number 6 the sum is "+ sum);
		 
	
	 //number 7 method Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	 //(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 String [] test = {"Hello"}; 
	 int n = 3;
	System.out.println(concatName(test[0], n)); 
	//number 8 method  Write a method that takes two Strings, firstName and lastName, and returns a full name
	//(the full name should be the first and the last name as a String separated by a space).
		 String firstName = "Eneka";
		 String lastName = "Finner";
		 
		 System.out.println(fullName(firstName , lastName));
		 //number 9 method Write a method that takes an array of int 
		 //and returns true if the sum of all the ints in the array is greater than 100.
		 int [] number = {67,4,5,55,7};
		System.out.println(isItTrue(number));
		//number 10 method Write a method that takes an 
		//array of double and returns the average of all the elements in the array.
		System.out.print("number 10 ");
		double [] cash= {34.5,43,2,34.2,343.4};
		System.out.println(avgNum(cash));
		//number 11 method Write a method that takes two arrays of double and returns true if the average of the elements in the 
		//first array is greater than the average of the elements in the second array.
		double[] moreChase= {45.3,23.3,23.3,7777.9};
		System.out.print("number 11 "); 
		System.out.println(isGreaterThan(cash, moreChase));
		// number 12 method Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		double  money= 45.5;
		boolean isHotOutside= true;
		System.out.println(willBuyDrink(isHotOutside, money));
		//number 13 method  my own problem
		
		   String name = "Billy Joe";
		   System.out.print("Number 13 ");
		System.out.println(greetPerson(name));
	 }
	


	

//number 7	method
public static String concatName(String word, int n) {
	String result = "";//empty string called result to store the repeated word.
	for (int i = 0; i < n; i++) { //The loop continues to run as long as i is less than n. Once i reaches n, the loop stops.
		result += word; //Concatenates the word to result on each iteration of the loop, effectively repeating the word multiple time
	}
		return result;//Returns the final concatenated string after the loop finishes.
}
		//number 8 method
public static String fullName(String firstName, String lastName) {
	String fullName = firstName + " " + lastName;
		
		return fullName;
}
		
		//number 9 method
		public static boolean isItTrue(int [] number ) {
			int sum = 0;
			for (int num : number) { //for-each loop. It iterates through each element in the number array. num represents the current element in the array during each iteration.

	            sum += num; //operator updates sum by adding num to its current value.
	        }
	        return sum > 100; 
		}
	        //number 10 method
	        public static double avgNum(double [] number) {
	        	double doubleSum = 0;
	        	for(int i=0; i < number.length; i++) {
	        		doubleSum += number[i]; 
	        			 
	        		}
	        double avg = doubleSum /number.length;
	        	
	        return avg;
	        }
	        //number 11 method Write a method that takes two arrays of double and returns true if 
	        //the average of the elements in the first array is greater than the average of the elements in the second array.
	        public static boolean isGreaterThan(double[] number1,double [] number2){
	        	double avg1 = avgNum(number1); // Calculate the average of the first array
	            double avg2 = avgNum(number2); // Calculate the average of the second array
	            return avg1 > avg2; //if avg1 is greater than avg2, it returns true. Otherwise, it returns false.
	        }
	            //number 12 method Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
	            //and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	        public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	        	if(isHotOutside  && moneyInPocket > 10.50) {
	        		return true;
	        
	        }
	        	return false;
	        }
	        	//13 method
	        //Create a method of your own
	        	//that solves a problem. In comments, write what the method does and why you created it.
	        public static String greetPerson(String name) {
	        	return "Hello, " + name;
	        }
}
	        
	        


	        
	        
	        
	        
				
				
		



