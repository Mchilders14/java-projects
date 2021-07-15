import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		msg("Welcome to the Change Return!");
		
		while(choice.equalsIgnoreCase("y")) {
			
			msg("Please enter your change (0-99)");
			
			int cents = sc.nextInt();
			
			int quarters = cents / 25;
			int remainder = cents % 25;
			
			int dimes = remainder / 10;
			remainder = remainder % 10;
			
			int nickels = remainder / 5;
			remainder = remainder % 5;
			
			int pennies = remainder;
			
			System.out.println("Quarters" + quarters);
			System.out.println("Dimes	" + dimes);
			System.out.println("Nickels	" + nickels);
			System.out.println("Pennies	" + pennies);
			
			
		}
		
		sc.close();
		msg("Console Application End!");
	}
	
	
	private static void msg(String string) {
		System.out.println(string);
	}

}
