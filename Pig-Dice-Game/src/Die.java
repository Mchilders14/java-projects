
public class Die {

	private int value;

	public Die() {	// Die object constructor, defaulted with value of 0
		value = 0;
	}

	public int getValue() {	// Gets value of variable [value]
		return value;
	}

	public void roll() { // Roll method for a six-sided die
		value = (int) (Math.random() * 6) + 1;
	}
	
	public void printRoll(Die die) { // Print method for value of Die object.
		System.out.println(die.getValue());
	}
}
