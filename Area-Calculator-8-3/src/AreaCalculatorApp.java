public class AreaCalculatorApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Area Calculator");
        System.out.println();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get data from the user and create appropriate object based on user choice
            String type = Console.getString(
                    "Calculate area of a circle, square, or rectangle? (c/s/r): ");
            System.out.println();
            
            Shape shape;
            if (type.equalsIgnoreCase("c")) {
                double radius = Console.getDouble("Enter radius: ");
                shape = new Circle(radius);
            } else if (type.equalsIgnoreCase("s")) {
                double width = Console.getDouble("Enter width: ");
                shape = new Square(width);
            } else {
                double width = Console.getDouble("Enter width: ");
                double height = Console.getDouble("Enter height: ");
                shape = new Rectangle(width, height);
            }
            
            // get the type of object that was created based on user choice
            Class c = shape.getClass();

            // display area to user
            System.out.println();
            System.out.println("The area of the " + c.getName() +
                    " you entered is " + shape.getArea());
            System.out.println();

            // see if the user wants to continue
            choice = Console.getString("Continue? (y/n): ", "y", "n");
            System.out.println();
        }
    }
    
}