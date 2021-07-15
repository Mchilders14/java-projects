import com.util.Console;

public class PigDiceApp {

	public static void main(String[] args) {

		msg("Welcome to Pig Dice!"); // Welcome Message
		String choice = Console.getString("Do you want to play (y/n)?", "y", "n");

		while (choice.equalsIgnoreCase("y")) {
			Game game = new Game(); // Creation of Game object game.
			game.play(); // Using Game object game in play() method
			choice = Console.getString("\nContine(y/n)?", "y", "n");
		}
		msg("\nEnd of Application"); // End message
	}

	private static void msg(String string) {
		System.out.println(string);
	}
}
