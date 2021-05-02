package Exercise4_3;

public class Lychee extends Fruits {

	private double weight;
	
	public Lychee(String n, double w) { //constructor with 4 arguments
		super(n);
		weight = w;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double TotalCalories() { //overloading without parameter
		return weight*660;
	}
	
	public double TotalCalories(double w) { //overloading with 1 parameter
		return w*660;
	}
	
	public double TotalCalories(double w, int c) { //overloading with 2 parameters
		return w*c;
	}
	
	public String printBenefit() { //overriding method
		return "\nLychee contain Magnesium, copper, iron, vitamin C, manganese and folate.";
	}
	
	public String toString() { //overriding method
		return super.toString()+ "\nWeight(in kg)\t: " + weight +"\nTotal calories\t: " + TotalCalories()+ "\nTotal calories\t: " + TotalCalories(0.8) + "\nTotal calories\t: " + TotalCalories(0.8,660) + printBenefit();
	}

}
