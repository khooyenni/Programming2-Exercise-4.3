package Exercise4_3;

public class Cherry extends Fruits{
	
	private double weight;
	
	public Cherry(String n, double w) {//constructor with 4 arguments
		super(n);
		weight = w;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double TotalCalories() {
		return weight*500;
	}
	
	public double TotalCalories(double w) {
		return w*500;
	}
	
	public double TotalCalories(double w, int c) {
		return w*c;
	}
	
	public String printBenefit() { //overriding method
		return "\nCherries contain vitamin C, A, K, potassium, magnesium, and calcium.";
	}
	
	public String toString() {
		return super.toString()+ "\nWeight(in kg)\t: " + weight +"\nTotal calories\t: " + TotalCalories()+ "\nTotal calories\t: " + TotalCalories(0.5) + "\nTotal calories\t: " + TotalCalories(0.5,500) + printBenefit();
	}

}
