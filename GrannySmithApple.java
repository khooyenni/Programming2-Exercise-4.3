package Exercise4_3;

public class GrannySmithApple extends Apple{
	
	String placeofOrigin, colour;
	
	
	public GrannySmithApple(String n, int p, int q, String c, String place){
		super(n,p,q);
		colour = c;
		placeofOrigin = place;
	}
	
	public String Information() { //overloading without parameter
		return "\nGranny Smith apples are " + colour + " in colour.";
	}
	
	public String Information(String c) { //overloading with 1 parameter
		return "\nGranny Smith apples are " + c + " in colour and averaging 5 to 7 centimeters in diameter";
	}
	
	public String Information(String c, String p) { //overloading with 2 parameters
		return "\nGranny Smith apples are  " + c + " in colour and it is come from " + p+ ".";
	}
	
	public String printBenefit() { //overriding method
		return "Granny Smith apples may help you resist and fight cancer.";
	}
	
	public String toString() {
		return super.toString() + Information() + Information("green") + Information("green","Australia");
	}

}
