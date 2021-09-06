package mycollections;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> wordNumberMapping = new LinkedHashMap<>();

        // Adding new key-value pairs to the LinkedHashMap
        wordNumberMapping.put("one", 1);
        wordNumberMapping.put("two", 2);
        wordNumberMapping.put("three", 3);
        wordNumberMapping.put("four", 4);
        wordNumberMapping.put("five", 5);

        // Add a new key-value pair only if the key does not exist in the LinkedHashMap, or is mapped to `null`
        wordNumberMapping.putIfAbsent("five", 95);
        wordNumberMapping.put("five", 5);

        System.out.println(wordNumberMapping);
        
        System.out.println("===================================================================================================");
        LinkedHashMap<Integer, String> customerIdNameMapping = new LinkedHashMap<>();

        customerIdNameMapping.put(1001, "Jack");
        customerIdNameMapping.put(1002, "David");
        customerIdNameMapping.put(1003, "Steve");
        customerIdNameMapping.put(1004, "Alice");
        customerIdNameMapping.put(1005, "Marie");

        System.out.println("customerIdNameMapping : " + customerIdNameMapping);

        // Check if a key exists in the LinkedHashMap
        Integer id = 1005;
        if(customerIdNameMapping.containsKey(id)) {
            System.out.println("Found the customer with id " + id + " : " + customerIdNameMapping.get(id));
        } else {
            System.out.println("Customer with id " + id + " does not exist");
        }

        // Check if a value exists in the LinkedHashMap
        String name = "David";
        if(customerIdNameMapping.containsValue(name)) {
            System.out.println("A customer named " + name + " exist in the map");
        } else {
            System.out.println("No customer found with name " + name + " in the map");
        }

     // Change the value associated with an existing key
        id = 1004;
        customerIdNameMapping.put(id, "Bob");
        System.out.println("Changed the name of customer with id " + id + ", New mapping : " + customerIdNameMapping);
    }
}

	
	