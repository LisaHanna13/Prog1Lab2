/*
Lisa Hanna
20 Feb, 2020
Step 3 of Lab2 -- Program that transforms seconds to minutes:seconds 
*/
import java.util.Scanner;

public class SecondMinutes{

	public static void main(String[] args){
		//create a scanner for user input
		Scanner keyboard = new Scanner(System.in);
		
		//print the instructions
		System.out.print("Hello, please enter an amount of seconds: ");
		//Store the data
		int seconds = keyboard.nextInt();

		//Do the conversion to minutes
		int minutes = seconds/60;
		int remainder = seconds%60;

		//Print the result
		System.out.println(seconds + " seconds is equal to " + minutes + ":" + remainder + " minutes.");
	}
}