import com.util.Console;

public class Game implements GameInterface {

	private Die die;
	private int totalScore; 			// Belongs to object, able to track OBJECT specific total score.
	private int rollCount; 				// Belongs to object, able to track OBJECT specific roll count.
	private static int gameCount = 1; 	// Belongs to the class, able to track game count for ALL objects.
	private static int highScore; 		// Belongs to the class, able to track highest score from all games played for ALL objects.
	private static int lowScore; 		// Belongs to the class, able to track lowest score from all games played for ALL objects.

	public Game() {
		die = new Die();
	}

	public Die getDie() {
		return die;
	}

	public void setDie(Die die) {
		this.die = die;
	}

	public int getRollCount() {
		return rollCount;
	}

	public void setRollCount(int rollCount) {
		this.rollCount = rollCount;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public static int getHighScore() {
		return highScore;
	}

	public static void setHighScore(int highScore) {
		Game.highScore = highScore;
	}

	public static int getLowScore() {
		return lowScore;
	}

	public static void setLowScore(int lowScore) {
		Game.lowScore = lowScore;
	}

	@Override
	public boolean win() { // Determines game winner by achieving a roll of 1. Returns a boolean(True/False).
		int score = die.getValue();
		if (score == 1) {
			System.out.println("\n\n* You win the GAME! See following statistics below. *");
			System.out.println("\nGame number: " + gameCount);
			System.out.println("Total number of rolls: " + rollCount);
			System.out.println("\nTotal Score: " + totalScore);
			highScore(); // Print and track highest winning score in current game session (Globally with static integers).
			lowScore();	 // Print and track lowest winning score in current game session (Globally with static integers).
			return true;
		} else {
			System.out.println("You have not won, KEEP ROLLING!");	// Statement is printed until victory.
			return false;
		}
	}
	
	public void totalScore() {
		totalScore += die.getValue();
	}

	public void highScore() {	// Highest winning score method
		if (totalScore > highScore) {
			highScore = totalScore;
			System.out.println("High Score: " + highScore);
		} else {
			System.out.println("High Score: " + highScore);
		}
		/*
		 * Can be done also using Max function
		 * 
		 * highScore = Math.max(highScore, totalScore);
		 * 
		 */
	}

	public void lowScore() {	// Lowest winning score method
		if (totalScore < lowScore || lowScore == 0) {
			lowScore = totalScore;
			System.out.println("Low Score: " + lowScore);
		} else {
			System.out.println("Low Score: " + lowScore);
		}
		/*
		 * Can be done also using Max function
		 * 
		 * lowScore = Math.min(lowScore, totalScore);
		 * 
		 */
	}

	@Override
	public void play() {                                             // Method for playing the game
		do {                                                         // Do While loop because, why not

			rollCount++;                                             // Roll Count Tracker
			Console.getString("Press enter to roll.");               // Enter to roll / *Remove this line for automation*
			die.roll();                                              // Rolling Dice
			System.out.println("Your roll -> " + die.getValue());    // Print current role
			totalScore();                                            // Total score calculated locally (per game NOT session)

		} while (!win());                                            // Repeats until method win() returns true
		gameCount++;                                                 // Game Count Tracker
	}
}
