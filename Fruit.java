package Exercise4_5; //interface and abstraction

public abstract class Fruit { //super class
	//define super class as abstract class. this is bcs we dont need to create instance of fruit
	//instance=new class

	protected String name;
	
	public Fruit(String name) { //constructor with 1 argument
		this.name = name;
		//System.out.println("Fruit constructor is invoked.");
	
	}
	
	//declare method that has no implementation
	//only subclass know how to implement the method
	public abstract double totalPrice(); //define method as abstract, only have heading with no body
	public abstract double totalPrice(double newP);
	public abstract double totalPrice(double newP, double disc);
	


} //end for class Fruit
