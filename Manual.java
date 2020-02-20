/*
Lisa Hanna
20 Feb, 2020
Step 6 of Lab2 -- Work on the manual exercises
*/
import java.util.Scanner;
import java.util.Random;

public class Manual{

	public static void main(String[] args){
		//Create a scanner for user input (can be used for the following exercises )
		Scanner keyboard = new Scanner(System.in);

		//--------------------------------------------------------------------------------------
		//EXERCISE #50: Read two words, output the shortest one

		System.out.println("EXERCISE #50");
		System.out.println("---------------------------------------------");

		//Print the instructions
		System.out.print("Hello, please enter two words for passwords: ");
		//Store the data and trim it
		String pass1 = keyboard.next().trim();
		String pass2 = keyboard.next().trim();

		//Find the length of both words
		int length1 = pass1.length();
		int length2 = pass2.length();

		//Print out whichever length is shorter
		if (length1 > length2){
			System.out.println("\nThe smaller word has " + length2 + " characters.");
		}
		else{
			System.out.println("\nThe smaller word has " + length1 + " characters.");
		}

		//----------------------------------------------------------------------------------------
		//EXERCISE #51: Retrieve a domain name and make it into a website

		System.out.println("\nEXERCISE #51");
		System.out.println("---------------------------------------------");

		//Print the instructions
		System.out.print("Hello, please enter a domain name: ");
		//Store the data and trim it
		String domain = keyboard.next().trim();

		//Print out the result
		System.out.println("The website for it is: www." + domain + ".com");

		//----------------------------------------------------------------------------------------
		//EXERCISE #52: Output a word in all uppercase, all lowercase, and the original word

		System.out.println("\nEXERCISE #52");
		System.out.println("---------------------------------------------");

		//Print the instructions
		System.out.print("Hello, please enter a word: ");
		//Store the data
		String word = keyboard.next();

		//Print the new results
		System.out.println("The word in all uppercase is: " + word.toUpperCase());
		System.out.println("The word in all lowercase is: " + word.toLowerCase());
		System.out.println("The original word was: " + word);

		//----------------------------------------------------------------------------------------
		//EXERCISE #53: Generate two random numbers (0-100) and print the smaller number

		System.out.println("\nEXERCISE #53");
		System.out.println("---------------------------------------------");

		//Creating the object to generate a random number
		Random random = new Random();
		//Obtain a number between [0-100]
		int num1 = random.nextInt(101);
		int num2 = random.nextInt(101);

		//Print both numbers
		System.out.println("The two numbers are: " + num1 + " and " + num2);

		//Print out the smaller one
		if (num1 > num2){
			System.out.println("The smaller number from two random numbers is " + num2);
		}
		else{
			System.out.println("The smaller number from two random numbers is " + num1);
			}

		//----------------------------------------------------------------------------------------
		//EXERCISE #54: Take a double, and get the cube of that

		System.out.println("\nEXERCISE #54");
		System.out.println("---------------------------------------------");

		//Print the instructions
		System.out.print("Hello, please enter a number: ");
		//Store the data
		double number = keyboard.nextDouble();

		//Calculate the cube of it
		double cube = Math.pow(number, 3);

		//Print the new value
		System.out.println("The cube of " + number + " is equal to " + cube);
	}
}
