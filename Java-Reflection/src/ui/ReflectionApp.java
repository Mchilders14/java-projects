package ui;

import java.lang.reflect.Field;

import business.Person;

public class ReflectionApp {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		Object person = new Person("Matthew Childers", 24);
		Field[] fields = person.getClass().getDeclaredFields();
		
		for (Field field : fields) {
			System.out.println("-------------------------");
			System.out.println("Field name: " + field.getName());
			System.out.println("Field toString: " + field.toString());

		}
		
		// System.out.println("name field: ");
		// Field f1 = person.getClass().getField("name");
		// System.out.println(f1.getType());

	}

}
