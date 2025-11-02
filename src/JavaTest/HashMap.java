package JavaTest;

public class HashMap {

	public static void main(String[] args) {

		
		java.util.HashMap<String, Integer> map = new java.util.HashMap<>();

		// Adding key-value pairs to the HashMap
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Orange", 3);

		// Displaying the HashMap
		System.out.println("HashMap: " + map);

		// Accessing a value by its key
		int value = map.get("Banana");
		System.out.println("Value for key 'Banana': " + value);

		// Removing a key-value pair
		map.remove("Orange");
		System.out.println("HashMap after removing 'Orange': " + map);

		// Iterating through the HashMap
		System.out.println("Iterating through the HashMap:");
		for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		
		
	}

}
