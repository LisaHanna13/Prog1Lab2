/*
Lisa Hanna
20 Feb, 2020
Step 1 of Lab2 -- App that calculates your age
*/
import java.util.Scanner;
public class MyAgeIs{

	public static void main(String[] args){
		//Create a scanner for user input
		Scanner keyboard = new Scanner(System.in);
		//Ask the user for the current year and their birth year
		System.out.print("Hello, please enter the current year, and your birth year: ");
		//Store the variables
		int currentYear = keyboard.nextInt();
		int yearOfBirth = keyboard.nextInt();

		//calculate the age
		int age = currentYear - yearOfBirth;
		
		//Print the age
		System.out.println("You are " + age + " years old!");
	}
}