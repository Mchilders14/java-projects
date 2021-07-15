import java.util.Scanner;

public class DataValidation {
    
    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();  // print a blank line

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from the user
            double length = getDoubleWithinRange(sc, "Enter length: ", 0, 1000000);
            double width = getDoubleWithinRange(sc, "Enter width:  ", 0, 1000000);

            // calculate the area and perimeter
            double area = length * width;
            double perimeter = 2 * length + 2 * width;

            // display the result
            System.out.println("Area:         " +  area);
            System.out.println("Perimeter:    " +  perimeter);
            System.out.println();

            // see if the user wants to continue
            choice = getChoiceString(sc, "Continue? (y/n): ", "y", "n");
            System.out.println();
        }
    }

    public static double getDouble(Scanner sc, String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDoubleWithinRange(Scanner sc, String prompt,
            double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(sc, prompt);
            if (d <= min) {
                System.out.println(
                    "Error! Number must be greater than " + min);
            } else if (d >= max) {
                System.out.println(
                    "Error! Number must be less than " + max);
            } else {
                isValid = true;
            }
        }
        return d;
    }

    // add a new method that forces the user to enter a string
    private static String getRequiredString(Scanner sc, String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equals("")) {
                System.out.println("Error! This entry is required. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }

    // add another new method that forces the user to enter one of two strings
    private static String getChoiceString(Scanner sc, String prompt,
            String s1, String s2) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getRequiredString(sc, prompt);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '"+
                    s1 +"' or '"+ s2 +"'. Try again.");
            } else  {
                isValid = true;
            }
        }
        return s;
    }
}
