package Exercise4_3;

public class Apple extends Fruits{
	
	private int quantity, price;
	
	public Apple(String n, int q, int p) {//constructor with 3 arguments
		super(n);
		quantity = q;
		price = p;
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public int TotalPrice() { //overloading without parameter
		return 2*quantity;
	}
	
	public int TotalPrice(int p) { //overloading with 1 parameter
		return p*quantity;
	}
	
	public int TotalPrice(int p, int q) { //overloading with 2 parameters
		return q*p;
	}
	
	public String printBenefit() { //overriding method
		return "Apples are low in sodium, fat, and cholesterol and apples provide vitamin C and fiber. ";
	}
	
	public String toString() {
		return super.toString()+ "\nPrice\t\t: RM" + price + "\nQuantity\t: " + quantity + "\nTotal price\t: RM" + TotalPrice() + "\nTotal price\t: RM" + TotalPrice(2)+ "\nTotal price\t: RM" + TotalPrice(2, 12) + "\n" + printBenefit();
	}

}
