package trowException;

public class ExceptionExample {

    
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
        
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {

            int result1 = divide(10, 2);
            System.out.println("Result of 10 / 2: " + result1);

           
            int result2 = divide(10, 0);
            System.out.println("Result of 10 / 0: " + result2);
        } catch (ArithmeticException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
