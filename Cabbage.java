//Student Name: Zu Haoran
//Studen ID: 041119896

// TODO Add programmer comment header here.

// TODO Add comment here that describes the Cabbage class.
public class Cabbage {

	// TODO Declare the instance variables weight and costPerKilogram here.

	private double weight;
	private double costPerKilogram;

	// TODO Add a no-argument constructor here.  It should call the other
	// constructor passing zero for all arguments.	
	public Cabbage() {
		this(0.0,0.0);
	}
	
	// TODO Add a second overloaded constructor here that accepts 2 parameters
	// weight and costPerKilogram.  The overloaded constructor should assign
	public Cabbage(double weight, double costPerKilogram) {
		this.weight = weight;
		this.costPerKilogram = costPerKilogram;
	}
	
	// values of these 2 parameters to the corresponding instance variables.

	// TODO Add an accessor for the instance variable weight.
	public double getWeight(){
		return weight;
	}

	// TODO Add a mutator for the instance variable weight.
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// TODO Add an accessor for the instance variable costPerKilogram.
	public double getcostPerKilogram() {
		return costPerKilogram;
	}

	// TODO Add a mutator for the instance variable costPerKilogram.
	public void setcostPerKilogram(double costPerKilogram) {
		this.costPerKilogram = costPerKilogram;
	}
	// TODO Complete the work method calculatePrice below.
	public double calculatePrice() {
		double price;
		price = this.weight * this.costPerKilogram;
		return price;
	}

	/*
	 * Worker method that outputs a report to console
	 * in format of "Cabbage: weight x, cost per kilogram y".
	 * Note that it adds a line return on the end
	 * of the output.
	 */
	public void printReport() {
		System.out.println("Cabbage: weight " + this.weight + 
				", cost per kilogram " + this.costPerKilogram);
	}
	
}
