/*
Lisa Hanna
20 Jan, 2020
Step 1 of Lab2 -- App that converts meters to feet
*/
import java.util.Scanner;
public class DistanceConversion{

	public static void main(String[] args){
		//Creating a scanner for user input
		Scanner keyboard = new Scanner(System.in);
		//Asking the user to input a distance in meters
		System.out.print("Hello! Please enter a distance in meters: ");
		//Storing the user input
		double meters = keyboard.nextDouble();

		//convert the meters into feet
		double feet = meters * 3.28084;
		
		//Print the result
		System.out.println(meters + " meters is equal to " + feet + "feet.");

	}
}