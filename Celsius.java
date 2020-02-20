/*
Lisa Hanna
20 Feb, 2020
Step 4 of Lab2 -- Program that calculates the average temperature of 3 days
*/
import java.util.Scanner;

public class Celsius{

	public static void main(String[] args){
		//create a scanner for user input
		Scanner keyboard = new Scanner(System.in);
		
		//print the instructions
		System.out.print("Hello! Please enter the temperature in Celsius of the past 3 days: ");
		//Store the data
		double temp1 = keyboard.nextDouble();
		double temp2 = keyboard.nextDouble();
		double temp3 = keyboard.nextDouble();

		//Calculate the average temperature
		double average = (temp1 + temp2 + temp3)/3;

		//Print the result
		System.out.println("The average temperature from the past 3 days is equal to " + String.format("%.2f",average) + " degrees Celsius.");
	}
}