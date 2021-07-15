
public class AnimalCounterApp {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		System.out.println("\nCounting Alligators\n");
		Alligator a = new Alligator();
		
		count(a,3);
		
		System.out.println("\nCounting Sheep\n");
		Sheep s = new Sheep("Blackie");
		
		count(s,3);
		
		System.out.println("\nBye");
		
	}

	public static void count(Countable c, int maxCount) {
		c.resetCount();
		while (c.getCount() <= maxCount) {
			System.out.println(c.getCountString());
			c.incrementCount();	
		}
	}
}
