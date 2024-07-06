package collesctionexample;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Declaring and Initializing an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Adding Elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("ArrayList after adding elements: " + fruits);

        // 3. Accessing Elements
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // 4. Modifying Elements
        fruits.set(1, "Blueberry");
        System.out.println("ArrayList after modifying element: " + fruits);

        // 5. Removing Elements
        fruits.remove(2);
        System.out.println("ArrayList after removing element: " + fruits);

        // 6. Iterating Over Elements
        System.out.println("Iterating over ArrayList using for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("Iterating over ArrayList using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 7. Other Useful Methods
        System.out.println("ArrayList contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Index of 'Blueberry': " + fruits.indexOf("Blueberry"));
        System.out.println("Size of ArrayList: " + fruits.size());

        // Clear all elements
        fruits.clear();
        System.out.println("ArrayList after clear(): " + fruits);
    }
}
