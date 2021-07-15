package presentation;

import com.util.Console;

import logic.Game;

public class TicTacToeApp {

	public static void main(String[] args) {
		msg("Welcome to Tic-Tac-Toe\n");
		Game game = new Game();
		game.printBoard();
		game.play();
		msg("\nGame over!");
	}

	private static void msg(String string) {
		System.out.println(string);
	}
}
