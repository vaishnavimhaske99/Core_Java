package collesctionexample;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // 1. Declaring and Initializing a Set
        Set<String> fruits = new HashSet<>();

     
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); 
        System.out.println("Set after adding elements: " + fruits);

      
        fruits.remove("Banana");
        System.out.println("Set after removing element: " + fruits);

        System.out.println("Iterating over Set using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Iterating over Set using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

  
        System.out.println("Set contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Set size: " + fruits.size());

    
        fruits.clear();
        System.out.println("Set after clear(): " + fruits);
    }
}
