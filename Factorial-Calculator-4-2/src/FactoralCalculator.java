import java.util.Scanner;

public class FactoralCalculator {

	// Declaring Main Method
	public static void main(String[] args) {

		// Initialization and console start
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		msg("Console Application Start!");

		// User choice loop
		while (choice.equalsIgnoreCase("y")) {

			int number = 0;

			// User choice loop begin
			while (number > 9 || number < 1) {
				System.out.print("Enter an Integer greater than 0, less than 10 -> ");
				number = sc.nextInt();
			}

			// Factorial For Loop
			long fact = 1;
			for (int i = 2; i <= number; i++) {
				fact = fact * i;
			}

			// program output
			System.out.println("The factoral of " + number + " is " + fact + ".");

			// Loop continue
			System.out.print("\rContinue? (y/n): ");
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
