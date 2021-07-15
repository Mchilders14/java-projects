import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Scanner;

public class Console {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static String askToContinue(Scanner sc) {
        // see if the user wants to continue
        System.out.print("Continue? (y/n): ");
        String choice = sc.next();
        sc.nextLine();  // discard any other data entered on the line
        System.out.println();
		return choice;
    }
    
    public static Date getDate(String prompt) throws ParseException {		
    	System.out.print(prompt);											
    	String stringDate = sc.nextLine(); 									
        Date date = new SimpleDateFormat("MM/dd/yyyy").parse(stringDate);  	
        System.out.println(stringDate+"\t"+date);  							
    	return date;														
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();  // read user entry
        //sc.nextLine();  // discard any other data entered on the line
        return s;
    }

    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
}