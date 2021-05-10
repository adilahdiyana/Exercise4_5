package Exercise4_5;

public class Apple extends Fruit { //sub class for Fruit
	
	protected double price;
	protected int quantity;
	
	public Apple(String name, double price, int quantity) { //constructor with 3 arguments
		super(name); //inherit
		this.price = price;
		this.quantity = quantity;
		
		System.out.println();
		//System.out.println("Apple constructor is invoked.");
		
		if(this.quantity < 30) {
			totalPrice(); //overloading with no arguments bcs of price & quantity is remained same
			System.out.println("Quantity of " + name + ":" + this.quantity);
			System.out.println("Price of" + name + ": RM " + this.price);
			System.out.println("Discount get\t: 0 %");
			System.out.println("Total price of " + this.quantity + " " + name + " : RM " + totalPrice());
			System.out.println("If quantity is LESS than 30, the total price of apples is RM" + totalPrice());
		}
		
			else if(this.quantity > 30 && this.quantity < 130) {
				double newP = 1.50; //p=price
				totalPrice(newP); //overloading with 1 argument
				System.out.println("Quantity of " + name + ":" + this.quantity);
				System.out.println("Price of" + name + ": RM " + newP);
				System.out.println("Discount get\t: 0 %");
				System.out.printf("Total price of %d %s\t: RM %2f%n", this.quantity, name, totalPrice());
				System.out.println("If quantity is MORE than 30, the total price of apples is RM" + totalPrice(newP));
	    }
		
			else {
				double newP = 1.00; //can buy more than 130, the price will be 1.00
				double disc = 0.5; //d=discount //buy more than 130 will get discount 50%
				
				AppleDiscount aa = new AppleDiscount(); //create new object 
				System.out.println("DISCOUNT: "+ aa.rateOfDiscount());
				disc = aa.rateOfDiscount();
				totalPrice(newP, disc); //overloading with 2 arguments
				System.out.println("Quantity of " + name + ":" + this.quantity);
				System.out.println("Price of "+ name + ": RM " + newP);
				System.out.printf("Discount get\t: %.2f percent", disc*100);
				System.out.printf("%nTotal price of %d %s\t: RM %.2f%n", this.quantity, name ,totalPrice(newP, disc));
				System.out.println("If quantity is MORE than 130, the total price of apples is RM" + totalPrice(newP, disc));
		}	
				
}
	
	public double totalPrice() {
		return this.price*this.quantity;
	}
	
	public double totalPrice(double newP) {
		return newP*this.quantity;
	}
	
	public double totalPrice(double newP, double disc) {
		return (newP*this.quantity)-(newP*this.quantity*disc);
	}
} //end for class Apple
