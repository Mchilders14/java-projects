import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {

		// Initializing the Scanner and Loop choice.
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		msg("Welcome to the Interest Calculator. Please provide loan amount and rate.");

		// Start of the loop
		while (choice.equalsIgnoreCase("y")) {

			// Collecting the inputs
			System.out.print("Please enter the loan amount.");
			BigDecimal loanAmount = sc.nextBigDecimal();
			System.out.println("Please enter the interest rate.");
			BigDecimal interestRate = sc.nextBigDecimal();

			// Calculating the interest on the loan and limiting to scale of 2 (2 decimal
			// places) and HALF UP.
			BigDecimal interest = loanAmount.multiply(interestRate).setScale(2, RoundingMode.HALF_UP);

			// Initializing the formats for currency and percent.
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();

			// Setting the max digits for the percent format to (3).
			percent.setMaximumFractionDigits(3);

			// Providing the Output
			System.out.println("Loan Amount: 	" + currency.format(loanAmount));
			System.out.println("Interest Rate: 	" + percent.format(interestRate));
			System.out.println("Interest: 		" + currency.format(interest));

			// Loop choice
			msg("Do you want to calulate another loan (y/n)?");
			choice = sc.next();
		}
		
		sc.close();
		msg("End of Console Application!");

	}

	private static void msg(String string) {
		System.out.println(string);
	}

}
