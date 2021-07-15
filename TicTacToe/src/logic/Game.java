package logic;

import com.util.Console;

public class Game implements GameInterface {

	Player x = new Player('x');
	Player o = new Player('o');
	private int column;
	private int row;
	private static char[][] gameBoardArray = new char[3][3];

	public Game() {
		
	}

	public static char getGameBoardArray(int r, int c) {
		return gameBoardArray[r][c];
	}

	public void setGameBoardArray(char[][] gameBoardArray) {
		this.gameBoardArray = gameBoardArray;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	
	public static void printBoard() {
		for (int i = 0; i < 4; i++) {
			System.out.println("+---+---+---+");
			
			if (i < 3) {
				System.out.println("| " + spotTest(i, 0) + " | " + spotTest(i, 1) + " | " + spotTest(i, 2) + " |");			
			}
		}
	}
	
	public static String spotTest(int i1, int i2) {
		if(gameBoardArray[i1][i2] != '\0') {
			String s = String.valueOf(gameBoardArray[i1][i2]);
			return s;
		} else {
			String space = " ";
			return space;
		}
		
	}

	public void setPlayerTurn(Player p) {
		row = Console.getInt("Pick a row (0, 1, 2): ", -1, 3);
		column = Console.getInt("Pick a column (0, 1, 2): ", -1, 3);

		if (gameBoardArray[row][column] != 'x' && gameBoardArray[row][column] != 'o') {
			
			gameBoardArray[row][column] = p.getPlayerValue();
			
		} else {
			row = Console.getInt("ERROR SPOT TAKEN, Pick a row (0, 1, 2): ");
			column = Console.getInt("ERROR SPOT TAKEN, Pick a column (0, 1, 2): ");
			gameBoardArray[row][column] = p.getPlayerValue();
		}
	}
	
	public boolean determineWinner() {
		if (gameBoardArray[0][0] != '\0' &&
			gameBoardArray[0][1] != '\0' &&
			gameBoardArray[0][2] != '\0' &&
			gameBoardArray[1][0] != '\0' &&
			gameBoardArray[1][1] != '\0' &&
			gameBoardArray[1][2] != '\0' &&
			gameBoardArray[2][0] != '\0' &&
			gameBoardArray[2][1] != '\0' &&
			gameBoardArray[2][2] != '\0' 
			) {
			return true;
		}
		return false;
	}

	@Override
	public void play() {
		while(!determineWinner()) {
			System.out.println("\nx's turn!");
			setPlayerTurn(x);
			printBoard();
			if (win() || determineWinner()) {
				break;
			} else {
				System.out.println("\no's turn!");
				setPlayerTurn(o);
				printBoard();
				if (win()) {
					break;
				}
			
			}
		}
			
	}

	@Override
	public boolean win() {
		if (gameBoardArray[0][0] == gameBoardArray[0][1] && 
			gameBoardArray[0][0] == gameBoardArray[0][2]) {
			if (gameBoardArray[0][0] != '\0' &&
				gameBoardArray[0][1] != '\0' &&
				gameBoardArray[0][2] != '\0') {
				
				System.out.println("\n( " + gameBoardArray[0][0] + " ) WINS THE GAME\nGame Over!");
				return true;
				
			}
		}
		else if (gameBoardArray[1][0] == gameBoardArray[1][1] && 
				 gameBoardArray[1][0] == gameBoardArray[1][2]) {
				if (gameBoardArray[1][0] != '\0' &&
					gameBoardArray[1][1] != '\0' &&
					gameBoardArray[2][2] != '\0') {
					
					System.out.println("\n( " + gameBoardArray[1][0] + " ) WINS THE GAME\nGame Over!");
					System.exit(0);
					
				}
			}
		else if (gameBoardArray[2][0] == gameBoardArray[2][1] && 
				 gameBoardArray[2][0] == gameBoardArray[2][2]) {
				if (gameBoardArray[2][0] != '\0' &&
					gameBoardArray[2][1] != '\0' &&
					gameBoardArray[2][2] != '\0') {
					
					System.out.println("\n( " + gameBoardArray[2][0] + " ) WINS THE GAME\nGame Over!");
					System.exit(0);
					
				}
			}
		else if (gameBoardArray[0][0] == gameBoardArray[1][0] && 
				 gameBoardArray[0][0] == gameBoardArray[2][0]) {
				if (gameBoardArray[0][0] != '\0' &&
					gameBoardArray[1][0] != '\0' &&
					gameBoardArray[2][0] != '\0') {
					
					System.out.println("\n( " + gameBoardArray[0][0] + " ) WINS THE GAME\nGame Over!");
					System.exit(0);
					
				}
			}
		else if (gameBoardArray[0][1] == gameBoardArray[1][1] && 
				 gameBoardArray[0][1] == gameBoardArray[2][1]) {
				if (gameBoardArray[0][1] != '\0' &&
					gameBoardArray[1][1] != '\0' &&
					gameBoardArray[2][1] != '\0') {
					
					System.out.println("\n( " + gameBoardArray[0][1] + " ) WINS THE GAME\nGame Over!");
					System.exit(0);
					
				}
			}
		else if (gameBoardArray[0][2] == gameBoardArray[1][2] && 
				 gameBoardArray[0][2] == gameBoardArray[2][2]) {
				if (gameBoardArray[0][2] != '\0' &&
					gameBoardArray[1][2] != '\0' &&
					gameBoardArray[2][2] != '\0') {
					
					System.out.println("\n( " + gameBoardArray[0][2] + " ) WINS THE GAME\nGame Over!");
					System.exit(0);
					
				}
			}
		else if (gameBoardArray[0][0] == gameBoardArray[1][1] && 
				 gameBoardArray[0][0] == gameBoardArray[2][2]) {
				if (gameBoardArray[0][0] != '\0' &&
					gameBoardArray[1][1] != '\0' &&
					gameBoardArray[2][2] != '\0') {
					
					System.out.println("\n( " + gameBoardArray[0][0] + " ) WINS THE GAME\nGame Over!");
					System.exit(0);

					
				}
			}
		else if (gameBoardArray[2][0] == gameBoardArray[1][1] && 
				 gameBoardArray[2][0] == gameBoardArray[0][2]) {
				if (gameBoardArray[2][0] != '\0' &&
					gameBoardArray[1][1] != '\0' &&
					gameBoardArray[0][2] != '\0') {
					
					System.out.println("\n( " + gameBoardArray[2][0] + " ) WINS THE GAME\nGame Over!");
					System.exit(0);
					
				}
			}
		return false;
	}

}
