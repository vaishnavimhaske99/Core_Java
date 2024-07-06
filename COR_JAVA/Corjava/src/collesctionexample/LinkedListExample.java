package collesctionexample;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // 1. Declaring and Initializing a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

  
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("LinkedList after adding elements: " + fruits);

       
        fruits.addFirst("Avocado");
        fruits.addLast("Date");
        System.out.println("LinkedList after adding first and last elements: " + fruits);

      
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        fruits.set(1, "Blueberry");
        System.out.println("LinkedList after modifying element: " + fruits);

  
        fruits.remove(2); 
        System.out.println("LinkedList after removing element: " + fruits);

        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("LinkedList after removing first and last elements: " + fruits);

    
        System.out.println("Iterating over LinkedList using for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("Iterating over LinkedList using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

      
        System.out.println("LinkedList contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Index of 'Blueberry': " + fruits.indexOf("Blueberry"));
        System.out.println("Size of LinkedList: " + fruits.size());

      
        fruits.clear();
        System.out.println("LinkedList after clear(): " + fruits);
    }
}
