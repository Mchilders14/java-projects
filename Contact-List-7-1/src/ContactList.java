
public class ContactList {

	 public static void main(String[] args) {
	        // display a welcome message
	        System.out.println("Welcome to the Contact List application");
	        System.out.println();  

	        // perform invoice calculations until choice isn't equal to "y" or "Y"
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	            // create a new contact object
	            Contact contact = new Contact();
	            
	            // get contact data from the user
	            String first = Console.getString("Enter first name: ");
	            contact.setFirstName(first);
	            
	            String last = Console.getString("Enter last name:  ");
	            contact.setLastName(last);
	            
	            String email = Console.getString("Enter email:      ");
	            contact.setEmail(email);
	            
	            String phone = Console.getString("Enter phone:      ");
	            contact.setPhone(phone);           

	            // display the contact
	            System.out.println();
	            System.out.print(contact.displayContact());
	            System.out.println();

	            // see if the user wants to continue
	            choice = Console.getString("Continue? (y/n): ");
	            System.out.println();
	        }
	    }

}
