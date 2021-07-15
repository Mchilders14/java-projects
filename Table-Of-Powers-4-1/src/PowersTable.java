import java.util.Scanner;

public class PowersTable {

	// Declaring Main Method
	public static void main(String[] args) {

		// Initialization and console start
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		msg("Console Application Start!");

		// User choice loop
		while (choice.equalsIgnoreCase("y")) {

			int number = 0;
			System.out.print("Enter an Integer -> ");
			number = sc.nextInt();

			// Header for the table
			System.out.println("\rNumber\tSquared\tCubed");
			System.out.println("======\t=======\t======");

			// For loop to provide squared and cubed row values
			for (int i = 1; i <= number; i++) {
				int squared = (int) Math.pow(i, 2);
				int cubed = (int) Math.pow(i, 3);
				System.out.println(i + "\t" + squared + "\t" + cubed);
			}

			// Loop continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		}

		// Console end and resource management
		sc.close();
		msg("Console Application End!");
	}

	// Message method for basic strings
	private static void msg(String string) {
		System.out.println(string);
	}
}
