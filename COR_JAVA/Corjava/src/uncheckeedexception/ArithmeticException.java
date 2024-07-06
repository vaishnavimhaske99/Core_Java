package uncheckeedexception;

public class ArithmeticException {
	
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
          
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (Exception e) {
           
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        
        System.out.println("Program continues after handling exception.");
    }


}
