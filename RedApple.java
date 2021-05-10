package Exercise4_5;

public class RedApple extends Apple { //sub class for Apple
	
	protected String colour;
	protected double mass;
	
	public RedApple(String name, double price, int quantity, String colour, double mass) {
		super(name, price, quantity);
		this.colour = colour;
		this.mass = mass;
	
		RedAppleDiscount cc = new RedAppleDiscount();
		System.out.println("RED APPLE DISCOUNT: " + cc.rateOfDiscount());
		
		
		System.out.println("Red Apple is constructor invoked.");
	}

	public String colourRedApple() {
		return "Colour of " + name + "is red.";
	}
	
	public double mass() {
		return this.mass*super.quantity;
	}
	
	public double calcPrice() { //overriding method 
		return super.price*super.quantity*this.mass;
	}
	
	publi String toString() { //overriding method
		return super.toString() + "\nMass\t: " + this.mass + "\nColour\t: " + this.colour;
	}
} //end for class RedApple
