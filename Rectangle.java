/*
Lisa Hanna
20 Feb, 2020
Step 1 of Lab2 -- App that calculates area and perimeter of a rectangle
*/
import java.util.Scanner;
public class Rectangle{

	public static void main(String[] args){
		//create a scanner for user input
		Scanner keyboard = new Scanner(System.in);
		
		//print the instructions
		System.out.print("Hello, please enter a length and height of a rectangle: ");
		//store the variables
		double length = keyboard.nextDouble();
		double height = keyboard.nextDouble();

		//calculate the area of the rectangle
		double area = length * height;
		//calculate the perimeter of the rectangle
		double perimeter = 2 * length + 2 * height;

		//print out the results
		System.out.println("The area of the rectangle is equal to " + area + " , and the perimeter of it is equal to " + perimeter);
	}
}