import java.util.Scanner;
public class GradeConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		msg("Hello and welcome to the Grade Converter App!");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println();
			
			//User Input
			System.out.print("Enter numeric grade: ");
			int numericGrade = sc.nextInt();
			
			//Business Logic
			String letterGrade = "F";
			if(numericGrade >= 88) {
				letterGrade = "A";
			}
			else if (numericGrade >= 80) {
				letterGrade = "B";
			}
			else if (numericGrade >= 68) {
				letterGrade = "C";
			}
			else if (numericGrade >= 60) {
				letterGrade = "D";
			}
			
			//Output results
			System.out.println("Letter Grade: "+letterGrade);
			
			
			//User choice to continue
			msg("Continue (y/n)? ");
			choice = sc.next();
		}
		
		msg("This is the end!");
		sc.close();
	}
	private static void msg(String string) {
		System.out.println(string);
	}
}
