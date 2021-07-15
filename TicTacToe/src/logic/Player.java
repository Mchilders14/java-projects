package logic;

public class Player {
	
	private char playerValue;
	
	Player(){
		// Empty Constructor
	}
	public Player(char playerValue) {
		this.playerValue = playerValue;
	}

	public char getPlayerValue() {
		return playerValue;
	}

	public void setPlayerValue(char playerValue) {
		this.playerValue = playerValue;
	}

}
