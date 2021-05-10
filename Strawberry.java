package Exercise4_5;

public class Strawberry extends Fruit { //sub class for Fruit
	
	protected int calories;
	protected char size;
	
	public Strawberry(String name, int calories, char size) {
		super(name);
		this.calories = calories;
		this.size = size;
		
		StrawberryDiscount ee = new StrawberryDiscount();
		System.out.println("STRAWBERRY DISCOUNT: " + ee.rateOfDiscount());
		
		System.out.println();
		System.out.println("Strawberry is constructor invoked.");
		
		
		switch(size) {
		case 'A':
			System.out.println("Total calories of " + size + " size strawberry is " + totalCalories() + " kcal.");
			break;
		case 'B':
			System.out.println("Total calories of " + size + " size strawberry is " + totalCalories(100) + " kcal.");
			break;
		case 'C':
			System.out.println("Total calories of " + size + " size strawberry is " + totalCalories(130) + " kcal.");
			break;
		}
		
}
	
	public double totalCalories() {
		return calories;
	}
	
	public double totalCalories(double c) {
		return c;
	}
	
	public String printBenefit() { //overriding method
		return "Strawberry can gives us more benefits to stay healthy.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
} //end for class Strawberry
