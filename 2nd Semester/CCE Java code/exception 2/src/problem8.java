public class problem8 {

    public static void someMethod() {
        try {
            // Code that may throw an exception
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (NullPointerException e) {
            // This catch block does not catch ArithmeticException
            System.out.println("Caught NullPointerException in someMethod: " + e.getMessage());
        } 
        finally {
            // This block will be executed regardless of exceptions
            System.out.println("Finally block in someMethod");
        }
    }


    public static void main(String[] args) {
        try {
            someMethod();
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in the outer scope: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Caught Exception in the outer scope: " + e.getMessage());
        }
    }

    
   
    
}
