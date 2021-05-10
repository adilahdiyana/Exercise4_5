package Exercise4_5;

public class Mango extends Fruit { //sub class for Fruit
	
	protected double weight;
	protected String size;
	protected double vitc;;
	
	public Mango(String name, double weight, String size, double vitc) {
		super(name); 
		this.weight = weight;
		this.size = size;
		this.vitc = vitc;
		
		MangoDiscount dd = new MangoDiscount();
		System.out.println("MANGO DISCOUNT: " + dd.rateOfDiscount());
		
		System.out.println();
		System.out.println("Mango is contstructor invoked.");
		
		if(this.weight < 45) {
			totalVitc();
			System.out.println("Size of mango is small.");
			System.out.println("If weight is LESS than 45, the total vitamin c of mango is " + totalVitc() + "g.");
		}
		
			else if(this.weight > 45 && this.weight < 65) {
				double vc = 23.1;
				totalVitc(vc);
				System.out.println("Size of mango is medium.");
				System.out.println("If weight is MORE than 45, the total vitamin c of mango is " + totalVitc() + "g.");
		}
		
			else {
				double vc = 15.2;
				int p = 3;
				totalVitc(vc, p);
				System.out.println("Size of mango is big.");
				System.out.println("If weight is MORE than 65, the total vitamin c of mango is " + totalVitc() + "g.");
		}
}
	
	public double totalVitc() {
		return this.weight*this.vitc;
	}
	
	public double totalVitc(double vc) {
		return vc*this.weight;
	}
	
	public double totalVitc(double vc, int p) {
		return vc*this.weight*p;
	}
} //end for class Mango
