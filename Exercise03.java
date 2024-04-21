//Student Name: Zu Haoran
//Studen ID: 041119896

// TODO Add a programmer comment header here.

import java.util.Scanner;

// TODO Add a comment that describes this class.
public class Exercise03 {

	/*
	 * The program in method main is used to perform tests against class
	 * Cabbage, it asks for inputs from the user, sets them into a cabbage
	 * object's fields, retrieves the values and utilizes the worker methods.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// TODO Instantiate a new cabbage object here by calling
		// the no-argument constructor.
		double weight;
		double cost;
		double price;
		
		Cabbage cabbage = new Cabbage();

		// Variables to store the user input

		System.out.print("Enter weight: ");
		// TODO Get the weight value from the user.
		weight = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("Enter cost per kilogram: ");
		// TODO Get the cost per kilogram value from the user.
		cost = keyboard.nextDouble();
		keyboard.nextLine();
		// TODO Set the weight and cost per kilogram of the cabbage object here.
		cabbage.setWeight(weight);
		cabbage.setcostPerKilogram(cost);
		// TODO Call the calculatePrice method of the cabbage object and assign its
		// return value to the price variable.		
		price = cabbage.calculatePrice();
		
		
		weight = cabbage.getWeight();
		cost = cabbage.getcostPerKilogram();
		System.out.println("Cabbage weight is: " + weight);
		System.out.println("Cabbage cost per kilogram is: " + cost);
		System.out.println("Cabbage price is: " + price);
		
		// TODO Call the printReport method of the cabbage object here.
		System.out.println("cabbage.printReport() is: ");
		cabbage.printReport();
		// TODO Instantiate another cabbage object here by calling the overloaded
		Cabbage anothercabbage = new Cabbage(3.5, 2.50);
		// constructor and passing the arguments 3.5 and 2.50 for the weight and
		// costPerKilogram parameters, respectively.


		// TODO Call the printReport method of anotherCabbage object here.
		System.out.println("anothercabbage.printReport() is: ");
		anothercabbage.printReport();
		// TODO Make sure that your name appears on the output below.
		System.out.println("Program completed by Haoran Zu");

	}

}
