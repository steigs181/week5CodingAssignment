package projects;
import java.time.Year;
import java.util.Arrays;

public class week3assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				/*
				 * ***************
				 * Step 1
				 * ***************
				 */
				
			int [] numbers = {3, 9, 23, 64, 2, 8, 28, 93};
			
			//subtracting first and last element in array, without using numbers
			
			int arrayLength = numbers.length;
			int differenceOf2 = Math.abs(numbers[arrayLength - arrayLength] - numbers[arrayLength - 1]);
			
			System.out.println("The difference of the first and last element is: " + differenceOf2);
			
			//adding new age to array, finding difference again.
			
			int [] newNumbers = new int[numbers.length];
			
			System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
			
			int lengthOfArr = newNumbers.length;
			newNumbers[lengthOfArr - 1] = 78;
			int newDifference = Math.abs(newNumbers[lengthOfArr - lengthOfArr] - newNumbers[lengthOfArr - 1]);
			
			System.out.println("The new difference weith added integer is: " + newDifference);
			
			double sum = 0;
			
			for (int i = 0; i < newNumbers.length; i++) {
				sum += newNumbers[i];
			}
			double averageAge = sum/ lengthOfArr;
			System.out.println("The average age is; " + averageAge);
			
			/*
			 * **********
			 * Step 2
			 * **********
			 */
			
			String[] names = {"Sam", "Tim", "Sally", "Buck", "Bob"};
			
			//using a loop to iterate through the array and calculate the average number of letters per name
			
			int sum1 = 0;
			
			for (int i = 0; i < names.length; i++) {
				sum1 += names[i].length();
			}
			int average = sum1 / names.length;
			System.out.println("The average number of letters per name in names[] is: " + average);
			
			//use a loop to iterate through the array again and concatenate all the names
			
			String addNames = "";
			
			for (int i = 0; i < names.length; i++) {
				addNames += names[i] + " ";
			}
			System.out.println(addNames);
			
			//How do you access the last element of an array?
			System.out.println("Use array[arr.length] to access the last element of an array");
			
			//How do you access the first element of an array?
			System.out.println("Use array[0] to access the first element of an array");
			
			//Create a new array of int called nameLengths array and calculate the sum of all the elements in the array
			
			int [] nameLengths = new int [names.length];
			
			for (int i = 0; i < nameLengths.length; i++) {
				nameLengths[i] = names[1].length();
				System.out.println(nameLengths[i]);
			}
			//write a loop to iterate over the nameLengths array and calculate the sum of the elements
			
			sum = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				sum += nameLengths[i];
			}
			System.out.println("The sumf of all the elements in the array: " + sum);
			
				System.out.println(newWordCombo("bar", 5));
				System.out.println(fullName("Josh", "Allen"));
				System.out.println(greaterThan(numbers));
				
				//doubles array
				
			double[] doubleArr = {0.3, 1.2, 5.3, 7.9, 2.4};
			double[] doubleArray = {0.1, 0.9, 4.6, 8.3, 10.2};
			
			System.out.println(averageOfElements(doubleArr));
			System.out.println(compareDoubleArr(doubleArr, doubleArray));
			System.out.println(willBuyDrink(true, 11.50));
			System.out.println(howOldAreYou(1995));
			
			

			}
		
			//write a method that takes a string, word, and an int, n, as arguments
			//and returns the word concatenated to itself n number of times.
			
			public static String newWordCombo(String string, int n) {
				String newWordCombo = "";
				for (int i = 0; i < n; i++) {
					newWordCombo += string;
				} 
				return "The word repeated is: " + newWordCombo;
			}
			
			// write a method that takes two strings, firstName and lastName, and returns  a full name
			
			public static String fullName(String firstName, String lastName) {
				return "The full name is: " + firstName + " " + lastName;
			}
			
			//write a method that takes an array of int and returns true if the sum of all the ints
			//in the array is greater than 100
			
			public static boolean greaterThan(int[] array) {
				return Arrays.stream(array).sum() > 100;
			}
			
			//write a method that takes an array of double and returns the average of all the elements
			
			public static double averageOfElements(double[] arr) {
				return Arrays.stream(arr).average().orElse(Double.NaN);
			}
			
			//write a method that tkaes two arrays of double and returns true
			//if the average of the elements in the first array is greater
			
			public static boolean compareDoubleArr(double [] arr, double[] arr2) {
				return averageOfElements(arr) > averageOfElements(arr2);
			}
			
			//write a method called willBuyDrink that takes a boolean isHotOutside
			//and a double moneyInPocket, and returns true if it is hot outside
			
			public static boolean willBuyDrink(Boolean isHotOutside, double moneyInPocket) {
				if (isHotOutside == true && moneyInPocket >= 10.50) {
					
				} return true;
			}
			
			//create a method of your own that solves a problem. in comments, write what
			//the method does and why you created it.
			
			public static int howOldAreYou(int dateOfBirth) {
				return Year.now().getValue() - dateOfBirth;
			}
			
		}

	

	
