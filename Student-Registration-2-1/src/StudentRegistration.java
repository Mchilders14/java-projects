import java.util.Scanner;
public class StudentRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = "";
		String lastName = "";
		int birthYear = 0;
		String loop = "Yes";
		
		msg("Hello and welcome to the student registration tool!");
		
		while (loop.equalsIgnoreCase("Yes") || loop.equalsIgnoreCase("yes")) {
			
			msg("Enter first name: ");
			firstName = sc.next();
			msg("Enter last name: ");
			lastName = sc.next();
			msg("Enter year of birth: ");
			birthYear = sc.nextInt();
			
			String fullName = firstName + " " + lastName;
			String tempPwd = firstName + birthYear;	
			
			System.out.println("Welcome "+fullName+"!");
			System.out.println("Your registration is complete.");
			System.out.println("Your temporary password is: "+tempPwd);
			
			msg("Do you want to register another student?");
			loop = sc.next();
			
		}
		
		sc.close();
		msg("Thanks for registering!");
	}
	private static void msg(String string) {
		System.out.println(string);
	}
}
