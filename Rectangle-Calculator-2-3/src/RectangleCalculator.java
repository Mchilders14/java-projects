import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		msg("Welcome to the Rectangle Calculator Console App");

		double length = 0.0;
		double width = 0.0;
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			System.out.println();

			// Input
			System.out.print("Enter Length: ");
			length = sc.nextDouble();
			System.out.print("Enter Width: ");
			width = sc.nextDouble();

			// Equations
			double area = length * width;
			double perimeter = 2 * length + 2 * width;

			// Output
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);

			msg("\nWould you like to continue (y/n)?");
			choice = sc.next();

		}
		//End message with scanner close
		msg("This is the end of the Rectangle Calculator Console App");
		sc.close();
	}

	private static void msg(String string) {
		System.out.print(string);
	}
}
