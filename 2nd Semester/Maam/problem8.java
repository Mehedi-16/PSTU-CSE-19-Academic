public class problem8 {

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in the outer scope: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception in the outer scope: " + e.getMessage());
        }
    }

    public static void someMethod() {
        try {
            int result = divideByZero();
            System.out.println("Result: " + result);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in someMethod: " + e.getMessage());
        } finally {
            System.out.println("Finally block in someMethod");
        }
    }

    public static int divideByZero() {
        return 10 / 0;
    }
}