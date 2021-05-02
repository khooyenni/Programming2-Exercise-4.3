package Exercise4_3;

public class Main {

	public static void main(String[] args) {
		
		Apple obj1 = new Apple("Apple", 3, 2);
		System.out.println("*****APPLE******");
		System.out.println(obj1);
		
		Lychee obj2 = new Lychee("Lychee", 0.5);
		System.out.println("\n*****Lychee*****");
		System.out.println(obj2);
		
		Cherry obj3 = new Cherry("Cherry", 0.5);
		System.out.println("\n*****Cherry*****");
		System.out.println(obj3);
		
		GrannySmithApple obj4 = new GrannySmithApple("Granny Smith Apple", 4, 3, "green", "Australia");
		System.out.println("\n*****Granny Smith Apple*****");
		System.out.println(obj4);
		
		FujiApple obj5 = new FujiApple("Fuji Apple", 8, 2, "Fibre");
		System.out.println("\n*****Fuji Apple*****");
		System.out.println(obj5);
		
	}
	

}
