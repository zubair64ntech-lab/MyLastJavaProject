package JavaTest;

public class ArrayList {

	public static void main(String[] args) {

		
		java.util.ArrayList<String> list = new java.util.ArrayList<>();

		// Adding elements to the ArrayList
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		// Displaying the ArrayList
		System.out.println("ArrayList: " + list);

		// Accessing an element by its index
		String element = list.get(1);
		System.out.println("Element at index 1: " + element);

		// Removing an element
		list.remove("Banana");
		System.out.println("ArrayList after removing 'Banana': " + list);

		// Iterating through the ArrayList
		System.out.println("Iterating through the ArrayList:");
		for (String item : list) {
			System.out.println(item);
		}
		
		
	}

}
