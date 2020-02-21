package learnJavaWeekThree;
public class learnJavaWeekThree {

	
	
	public static void main(String[] args) {
		
		//=======================================================================================================
		// 1.) Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		
		// a.) Subtract the value of the first element in the array from the value in the last element of the array.
		int firstElement = ages[0];
		int lastElement = ages[ages.length - 1]; 
		int ageSubtracted = lastElement - firstElement; 
		System.out.println("1a.) The first element in the array, substracted by the last element is: "+ ageSubtracted);
		
		// b.) Add a new age to your array and repeat the step above to ensure it is dynamic. 
		int[] moreAges = { 3, 9, 23, 64, 2, 8, 28, 93, 45};
		
		firstElement = moreAges[0];
		lastElement = moreAges[moreAges.length - 1]; 
		ageSubtracted = lastElement - firstElement; 
		System.out.println("1b.) The first element in the second longer array, substracted by the last element is: "+ ageSubtracted + " . . . neat!");
	
		// c.) Use a loop to iterate through the array and calculate the average age. 
		int sum = 0; 
		int count = 0; 
		for ( int age : ages ) {
			sum += age; 
			count ++; 
		}
		int average = sum / count; 
		System.out.println("1c.) The average of the array is around ~" +average + "\n");
		
		// ==============================================================================================================================
		// 2.) Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {  "Sam" ,  "Tommy", "Tim", "Sally", "Buck", "Bob" };
	
		// a.) Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int totalCharacters = 0; 
    	int nameCount = 0; 
		for ( String name : names ) {
			// Create an char array of given String 
	        char[] ch = name.toCharArray(); 
	        int wordLength = ch.length;
	        float averageChars = 0.0f; 
	        
	        // average number of characters = total characters / quantity of names
            totalCharacters += wordLength;
            nameCount++; 
            averageChars = totalCharacters / nameCount; 
            System.out.println("2a.) After processing " + name + " the average number of characters per name is now about  ~" + averageChars);
		}
		
		
		// b.) Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String largeName = ""; 
		for (String name : names ) {
			largeName += (name + " "); 
		}
		System.out.println("2b.) " + largeName);
		
		
		//=====================================================
		// 3.) How do you access the last element of any array? 
		System.out.println("\n3.) One accesses the last element in an array by calling the element within the array that's \n found at the .length - 1 position, \n for example: arrayName[arrayName.length - 1] would access the final element in arrayName. \n");
		
		// 4.) How do you access the first element of any array?
		System.out.println("4.) Because arrays begin at 0, one accesses the first element in an array by calling the element within the array that's \n found at the 0 position , \n for example: arrayName[0] would access the final element in arrayName. ");
	
		// 5.) Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array 
		// 	   and add the length of each name to the nameLengths array.
		
		
		int[] nameLengths = new int[names.length];
		//String strArray[] = new String[nameLengths.length];	
		int arrayPosition = 0; 
		System.out.println("\n5.) The following name lengths have been added to the 'namesLength' array:" );
		for ( String name : names ) {
			 char[] ch = name.toCharArray(); 
		     int wordLength = ch.length;
		     nameLengths[arrayPosition] = wordLength;
		     System.out.println(names[arrayPosition] + " - name length: " + nameLengths[arrayPosition]);
		     arrayPosition += 1; 
		}
		
		// 6.) Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int nameLengthSum = 0; 
		for (int nameLength : nameLengths) { 
			nameLengthSum += nameLength;
		}
		System.out.println("\n6.) The sum of all nameLengths would be " + nameLengthSum + ".");
	
		// 7.) Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to
		// itself n number of times.
		System.out.println("\n7.) " + stringMultiplier("word", 3));
		
		// 8.) Write a method that takes two Strings, firstName and lastName, and returns a full name.
		System.out.println("\n8.) "+ concatName("Tylor" , "Davis"));
		
		// 9.) Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("\n9.) The answer for this particular int array is: " + sumChecker(nameLengths));
		
		// 10.) Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] testArray = {34.5, 98.60, 9.33, 9.90, 42.00} ; 
		System.out.println("\n10.) The average of all elements within this array of double is: " + averageDoubleArray(testArray));
		
		// 11.) Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
		//      is greater than the average of the elements in the second array.
		double[] testArrayOne = {73.55, 67.60, 9.33, 876.98, 42.00} ; 
		double[] testArrayTwo = {34.50, 87.83, 0.00, 9.90, 2.00} ; 
		System.out.println("\n11.) Is the average of the elements in the first double array greater than the second?: " + compareArrays(testArrayOne,testArrayTwo ));
	
		// 12.) Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		//              and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 System.out.println("\n12.) It's a good idea to get milk?: " + willBuyDrink( true, 11.20));  
		  
		 // 13.) Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		 System.out.println("\n13.) the input string backwards is: " + stringReverser( "I love Teresa"));
	}
	// Custom method, for number 13. Inverses the order of the characters within the string. 
	static String stringReverser( String inputString) {
		// Create an char array of given String 
        char[] ch = inputString.toCharArray();
        // Initialize outputString; 
        String outputString = "";
        // Go through the characters within the given input string, from last to first, and concatinate it to the output String
        for (int i = ch.length -1; (i >= 0) ; i--) {
        	outputString += ch[i]; 
        }
		return outputString;
	}
	
	// Will Buy Milk? from number twelve. 
	static boolean willBuyDrink( boolean isHotOutside , double moneyInPocket) {
		
		if (isHotOutside && moneyInPocket >= 10.50) {
			return true; 
		}
		else {
			return false;
		}
	}
	
	// Compares the averages of arrays, for number eleven. 
	static boolean compareArrays(double[] testArray1, double[] testArray2 ) {
		double arrayOneAverage = averageDoubleArray(testArray1); 
		double arrayTwoAverage = averageDoubleArray(testArray2); 
		
		if (arrayOneAverage > arrayTwoAverage)
			return true;
		else {
			return false;
		}
	}

	// Double array Average.... er for number ten. 
	static double averageDoubleArray(double[] inputArray) {
		double doubleSum = 00.00;
		for (double element : inputArray) { 
			doubleSum += element;
		}
		double average = doubleSum / inputArray.length; 
		return average;
	}
	
	// Checks the sum of int arrays
	static boolean sumChecker( int[] arrayOfNumbers) {
		int intArraySum = 0; 
		for (int i : arrayOfNumbers) { 
			intArraySum += arrayOfNumbers[i];
		}
		if (intArraySum >= 100) {
			return true;
		}
		else {
			return false;
			 
		}
	}
	
	
	// String multiplier for number seven. 
	static String stringMultiplier( String word , int multiplier) {
		String largeWord = ""; 
		for (int i = 1; i <= multiplier; i++ ) {
			largeWord += (word + " "); 
		}
		return largeWord;
	}
	
	
	//String builder for number eight. 
	static String concatName( String firstName , String lastName) {
		return firstName + " " + lastName; 
	}
}
