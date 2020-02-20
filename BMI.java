/*
Lisa Hanna
20 Feb, 2020
Step 2 of Lab2 -- Program that calculates BMI 
*/
import java.util.Scanner;

public class BMI{

	public static void main(String[] args){
		//create a scanner for user input
		Scanner keyboard = new Scanner(System.in);
		
		//print the instructions
		System.out.print("Hello! Please enter your weight (in pounds) and your height (in feet): ");
		//Store the data
		double weight = keyboard.nextDouble();
		double height = keyboard.nextDouble();

		//Do the conversions
		double finalWeight = weight * 0.4535924;
		double finalHeight = height * 0.3048;
		//Do the calculation for BMI
		double bmi = finalWeight/(finalHeight*finalHeight);

		//Print out the results
		System.out.println(String.format("%.2f",weight) + " pounds is equal to " + String.format("%.2f",finalWeight) + " kilograms.");
		System.out.println(String.format("%.2f",height) + " feet is equal to " + String.format("%.2f",finalHeight) + " meters.");
		System.out.println("Therefore, your BMI is equal to " + String.format("%.2f",bmi));
	}
}