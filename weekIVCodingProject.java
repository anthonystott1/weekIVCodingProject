package myProjects;

import java.util.Arrays;

public class weekIVCodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question 1");
		// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		// a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		 int result1a = ages[ages.length - 1] - ages[0];
	        System.out.println("Last element - first element: " + result1a);
		//	b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
	        int[] ages2 = {17, 35, 42, 58, 71, 89, 105, 112};
			// i. Make sure that there are 9 elements of type int in this new array.
	        System.out.println(ages2.length);
			// ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
	        int result1b = ages2[ages2.length - 1] - ages2[0];
	        System.out.println("Last element - first element: " + result1b);
			// iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
	        /* delete an element and run again? */
	        
		// c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	        int sum = 0;
	        for (int age : ages) {
	            sum += age;
	        }
	        double averageAge = (double) sum / ages.length;
	        System.out.println("Average age: " + averageAge);

// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		// a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	        System.out.println("Question 2");
	        double totalLetters = 0;
	        for (String name : names) {
	            totalLetters += name.length();
	        }
	        double averageLetters = totalLetters / names.length;
	        System.out.println("Average number of letters per name: " + averageLetters);
		// b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	        StringBuilder concatenatedNames = new StringBuilder();
	        for (String name : names) {
	            concatenatedNames.append(name).append(" ");
	        }
	        System.out.println("Concatenated names: " + concatenatedNames.toString().trim());

	        
// 3. How do you access the last element of any array?
	       // int lastElement = arr[arr.length - 1];

	        // 4. How do you access the first element of any array?
	       //  int firstElement = arr[0];

	        // 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	        System.out.println("Question 5");
	        int[] nameLengths = new int[names.length];
	        for (int i = 0; i < names.length; i++) {
	            nameLengths[i] = names[i].length();
	        }
	        System.out.println("Name lengths array: " + Arrays.toString(nameLengths));
	        
// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	        System.out.println("Question 6");
	        int sumnameLengths = 0;
	        for (int length : nameLengths) {
	            sumnameLengths += length;
	        }
	        System.out.println("Sum of all elements in nameLengths array: " + sumnameLengths);
// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	        System.out.println("Question 7");
	        String result = concatenateWordNTimes("Hello", 3);
	        System.out.println(result);
// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	        System.out.println("Question 8");
	        String fullName = getFullName("John", "Doe");
	        System.out.println(fullName);
// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	        System.out.println("Question 9");
	        int[] numbers = {20, 30, 40, 15}; // Sample array of integers
	        boolean result1 = isSumGreaterThan100(numbers);
	        System.out.println(result1);
	        
// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
	        System.out.println("Question 10");
	        double[] numbers1 = {10.5, 20.3, 15.2, 8.7}; // Sample array of doubles
	        double average = calculateAverage1(numbers1);
	        System.out.println("Average: " + average);
// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	        System.out.println("Question 11");
	        double[] array1 = {10.5, 20.3, 15.2, 8.7}; 
	        double[] array2 = {8.2, 15.7, 12.6, 7.8}; 
	        boolean result11 = isFirstArrayAverageGreaterThanSecond(array1, array2);
	        System.out.println("Is the average of the first array greater than the second array? " + result11);
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	        System.out.println("Question 12");
	        boolean isHotOutside = true; // Sample value for isHotOutside
	        double moneyInPocket = 15.75; // Sample value for moneyInPocket
	        boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
	        System.out.println("Will I buy a drink? " + willBuyDrink);
// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	        System.out.println("Question 13");
	        
	        
	}

	// Method 13  This method checks if a given string is a palindrome. i liked the palindromes examples and i find it fascinating that we can code the computer to look for them!
	public static boolean isPalindrome(String str) {
	    if (str == null || str.isEmpty()) {
	        return false; // Empty or null string is not a palindrome
	    }
	    str = str.toLowerCase(); // Convert to lowercase to ignore case sensitivity
	    int left = 0;
	    int right = str.length() - 1;
	    while (left < right) {
	        if (str.charAt(left) != str.charAt(right)) {
	            return false; // Characters do not match, so it's not a palindrome
	        }
	        left++;
	        right--;
	    }
	    return true; // All characters match, so it's a palindrome
	}
	
	// Method 12 
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
	
	// Method 11 
	 public static boolean isFirstArrayAverageGreaterThanSecond(double[] array1, double[] array2) {
	        // Calculate average of elements in array1
	        double average1 = calculateAverage1(array1);

	        // Calculate average of elements in array2
	        double average2 = calculateAverage1(array2);

	        // Compare averages
	        return average1 > average2;
	    }

	    // Method to calculate the average of elements in an array
	    public static double calculateAverage1(double[] nums) {
	        double sum = 0;
	        for (double num : nums) {
	            sum += num;
	        }
	        return sum / nums.length;
	    }
	
	// Method 10
	public static double calculateAverage(double[] nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
	
	// Method 9 
	 public static boolean isSumGreaterThan100(int[] nums) {
	        int sum = 0;
	        for (int num : nums) {
	            sum += num;
	        }
	        return sum > 100;
	 }
	// Method 8
	public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
	}
	
	// Method 7
	 public static String concatenateWordNTimes(String word, int n) {
	        StringBuilder concatenatedWord = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            concatenatedWord.append(word);
	        }
	        return concatenatedWord.toString();
	    }
}
