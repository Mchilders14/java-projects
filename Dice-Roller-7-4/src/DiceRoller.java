import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {
    	
        // display a welcome message
        System.out.println("Welcome to the Dice Roller!");
        System.out.println();  

        // create the Scanner object
        Scanner sc = new Scanner(System.in);
        
        // create the Dice object
        Dice dice = new Dice();
        
        // start the dice rolling
        System.out.print("Roll the dice? (y/n) ");
        String choice = sc.next();

        // continue until choice isn't equal to "y" or "Y"
        while (choice.equalsIgnoreCase("y")) {
            dice.roll();
            dice.printRoll();

            // see if the user wants to continue
            System.out.print("Roll again? (y/n): ");
            choice = sc.next();
        }
        sc.close();        
    }
    
}
