package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

import business.Item;

public class ItemManagerApp {
	private static List<Item> items; // initializing the list

	public static void main(String[] args) {
		// initialize items list and add some office items
		items = new ArrayList<>();
		items.add(new Item(1, "Laptop"));
		items.add(new Item(2, "Monitor"));
		items.add(new Item(3, "Mouse"));

		// implement CRUD functionality to allow a user to
		// maintain the list of items: Create, Read (List, Get by id),
		// Update, and Delete

		System.out.println("Welcome to the Item Manager App!");
		System.out.println();
		int command = 0;
		while (command != 9) {
			displayMenu();
			command = Console.getInt("Command: ");
			switch (command) {
			case 1:
				System.out.println("Items:");
				System.out.println("=================");
				listItems();
				break;
			case 2:
				System.out.println("Get an Item:");
				System.out.println("=================");
				fetchItem();
				break;
			case 3:
				System.out.println("Add an Item:");
				System.out.println("=================");
				addItem();
				break;
			case 4:
				// update an item
				// - prompt user for number to retrieve
				// - loop through items and retrieve item
				// that matches the number entered
				// - if item not found, print message
				// - if item found, prompt user for new description
				// - change the item description (hint: use setter)
				// and display success msg
				int itemNumber = Console.getInt("Please enter the item number of the item you wish to change: ");
				updateItem(itemNumber);
				System.out.println("Update an Item:");
				System.out.println("=================");
				break;
			case 5:
				// delete an item
				// - prompt user for number to retrieve
				// - loop through items and retrieve item
				// that matches the number entered
				// - if item not found, print message
				// - if item found, delete it and display success msg
				System.out.println("Delete an Item:");
				System.out.println("=================");
				deleteItem();
				break;
			case 9:
				// exit
				break;
			default:
				System.out.println("Invalid command.  Try again.");
				break;
			}
			System.out.println();
		}
		System.out.println("Bye!");
	}
	
	private static void deleteItem() {
		int itemNumber = Console.getInt("Please enter the item number you wish to remove: ");
		if (validateItemNumber(itemNumber)) {
			items.remove(itemNumber);
			System.out.println("Remove Successful!!!!");
		} else {
			System.out.println("Error, please choose correct item number.");
		}
		
	}
	
	private static void updateItem(int number) {
		
		if (validateItemNumber(number)) {
			Item item = items.get(number);
			String description = Console.getString("Please enter a NEW description for item.");
			item.setDescription(description);
			items.set(number, item);
			System.out.println("Update Successful!!!!");
		} else {
			System.out.println("Error, please choose correct item number.");
		}
		
	}
	
	private static void addItem() {
		int itemId = Console.getInt("Please enter an item ID for product addition: ");
		String description = Console.getString("Please enter an item Description for product addition: ");
		Item item = new Item(itemId, description);
		items.add(item);
		System.out.println("Item Added!");
	}
	
	private static void fetchItem() {
		int number = Console.getInt("Please enter Item ID to retrieve product.");
		Item item = items.get(number);
		System.out.println(item.getDescription());
	}
	
	private static void listItems() {
		// for (int i = 0; i < items.size(); i++) {
		// 	  System.out.println(items.get(i));
		// }
		
		for (Item i : items) {
			System.out.println(i.getDescription());
		}
	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("==================");
		System.out.println("1 - List all items");
		System.out.println("2 - Get an item");
		System.out.println("3 - Add new item");
		System.out.println("4 - Update an item");
		System.out.println("5 - Delete an item");
		System.out.println("9 - Exit");
		System.out.println();
	}
	
	private static boolean validateItemNumber(int itemNumber) {
		boolean found = false;
		if (itemNumber > -1 && itemNumber < items.size()) {
			found = true;
		}
		return found;
		
	}

}
