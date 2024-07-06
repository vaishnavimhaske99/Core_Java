package uncheckeedexception;

public class ArrayIndexOutOfBoundsException {
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};

	        try {
	           
	            int value = numbers[10];
	            System.out.println("Value at index 10: " + value);
	        } catch (Exception e) {
	            
	            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	        }

	       
	        System.out.println("Program continues after handling exception.");
	    }

}
