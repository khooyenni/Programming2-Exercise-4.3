package Exercise4_3;

public class FujiApple extends Apple{
	
	private String nutrient;
	
	public FujiApple(String n, int p, int q, String nu){
		super(n,p,q);
		nutrient=nu;
	}
	
	public String Nutrient() { //overloading without parameter
		return "\nFuji apples contain Vitamin C.";
	}
	
	public String Nutrient(String nu) { //overloading with 1 parameter
		return "\nFuji apples contain Vitamin C and " + nu + ".";
	}
	
	public String Nutrient(String nu, String m) { //overloading with 2 parameters
		return "\nFuji apples contain Vitamin C, " + nu + " and " + m +".";
	}
	
	public String printBenefit() { //overriding method
		return "Fuji apples can boosts brain health.";
	}
	
	public String toString() {
		return super.toString() + Nutrient() + Nutrient("fibre") + Nutrient("fibre", "mineral");
	}

}
