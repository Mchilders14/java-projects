package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

public class WizardInventoryApp {

	static List<String> items;

	public static void main(String[] args) {

		items = new ArrayList<>();

		items.add("Wooden Staff");
		items.add("Wizard Hat");
		items.add("Cloth Shoes");

		System.out.println("Welcome to the Wizard Inventory App!");
		System.out.println();

		String command = "";

		while (!command.equalsIgnoreCase("exit")) {

			displayMenu();
			command = Console.getString("Command: ");

			switch (command) {
			case "show":
				System.out.println("List all items:");
				System.out.println("=====================");
				listItems();
				break;
			case "grab":
				System.out.println("Add an item:");
				System.out.println("=====================");
				addItem();
				break;
			case "edit":
				System.out.println("Edit an item:");
				System.out.println("=====================");
				int itemNumber = Console.getInt("Number: ");
				editItem(itemNumber);			
				break;
			case "drop":
				System.out.println("Delete an item:");
				System.out.println("=====================");
				itemNumber = Console.getInt("Number: ");
				dropItem(itemNumber);
				break;
			case "exit":
				// exit
				break;
			default:
				System.out.println("Invalid command. Try again.");
			}

			System.out.println();
		}

	}

	private static void dropItem(int itemNumber) {
		if (validateItemNumber(itemNumber)) {
			String deletedItem = items.remove(itemNumber - 1);
			System.out.println(deletedItem +  " was dropped.");
		} else {
			System.out.println("Invalid item number.");
		}
	}

	private static void editItem(int itemNumber) {
		if (validateItemNumber(itemNumber)) {
			String name = Console.getString("Updated name: ");
			items.set((itemNumber - 1), name);
			System.out.println("Item number"  + itemNumber + " was updated.");
		} else {
			System.out.println("Invalid item number.");
		}
	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU: ");
		System.out.println("=====================");
		System.out.println("show - Show all items");
		System.out.println("grab - Grab an item");
		System.out.println("edit - Edit an item");
		System.out.println("drop - Drop an item");
		System.out.println("exit - Exit the Application");
		System.out.println();

	}

	private static void listItems() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println((i + 1) + ". " + items.get(i));
		}
	}

	private static void addItem() {
		if (items.size() < 4) {
			String name = Console.getString("Name: ");
			items.add(name);
			System.out.println(name + " was added.");

		} else {
			System.out.println("You can't carry any more items. Drop an item.");

		}
	}
	private static boolean validateItemNumber(int itemNumber) {
		boolean found = false;
		if (itemNumber > 0 && itemNumber <= items.size()) {
			found = true;
		}
		return found;
		
	}

}
