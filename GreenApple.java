package Exercise4_5;

public class GreenApple extends Apple { //sub class for Apple
	
	protected String brand;
	protected String taste;
	
	public GreenApple(String name, double price, int quantity, String brand, String taste) { //constructor sub class with arguments 
		super(name, price, quantity); //inherit data from superclass with passing parameter
		this.brand = brand;
		this.taste = taste;
		
		
		GreenAppleDiscount bb = new GreenAppleDiscount();
		System.out.println("GREEN APPLE DISCOUNT: " + bb.rateOfDiscount());
		
		
		System.out.println("Green Apple constructor is invoked.");
	}

	public String brandGreenApple() {
		return "This" + name + "is from India.";
	}
	
	public String tasteGreenApple() {
		return "This" + name + "is so sour.";
	}
		
	public double calPrice() { //overriding method from class Apple
		return super.price*super.quantity;
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nTaste\t: " + this.taste + "\nBrand\t: " + this.brand;
	}
} //end for class GreenApple
