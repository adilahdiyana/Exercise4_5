package Exercise4_5;

public class Main {


	public static void main(String[] args) {
		
		//Fruit f = new Fruit("Orange"); //no need new object for super class
		
				System.out.println();
				
				Apple a = new Apple("Apple", 15.50, 5);
				System.out.println(a);
				
				GreenApple g = new GreenApple("Green Apple", 12.90, 3, "India", "sour");
				System.out.println(g);
				
				
				RedApple r = new RedApple("Red Apple", 9.80, 4, "bright red", 1.20);
				System.out.println(r);
				
				Mango m = new Mango("Mango", 0.95, "small", 1.30);
				System.out.println(m);
				
				Strawberry s = new Strawberry("Strawberry", 3, 'B');
				System.out.println(s);
							
				
	}

}
