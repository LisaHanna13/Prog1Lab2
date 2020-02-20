/*
Lisa Hanna
20 Feb, 2020
Step 5 of Lab2 -- This program rewrites a last and first name as "Firstname Lastname" 
(case sensitive)
*/
import java.util.Scanner;

public class Username{

	public static void main(String[] args){
		//create a scanner for user input
		Scanner keyboard = new Scanner(System.in);
		
		//print the instructions
		System.out.print("Hello! Please enter your last name, first name: ");
		//Store the data the trim it
		String lastName = keyboard.next().trim();
		String firstName = keyboard.next().trim();

		//Get the length of the last name (so that in further steps we can remove the comma)
		int length = lastName.length();

		//Capitalize the first letter of each string
		String firstCap = firstName.substring(0, 1).toUpperCase();
		String lastCap = lastName.substring(0, 1).toUpperCase();

		//Print the result making the rest of the name lowercaseS
		System.out.println("Your name is: " + firstCap + firstName.substring(1).toLowerCase() + " " + lastCap + lastName.substring(1, length-1).toLowerCase());
	}
}