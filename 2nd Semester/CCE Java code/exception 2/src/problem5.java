
class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

public class problem5 {
    public static void main(String[] args) {
        try {

            // throw new ExceptionA("ExceptionA occurred");
            throw new ExceptionB("ExceptionB occurred");

        } catch (ExceptionA e) {
            // Catch block for ExceptionB
            System.out.println("Caught ExceptionB: " + e.getMessage());

        } 
        catch (ExceptionB e) {
            // Catch block for ExceptionA
            System.out.println("Caught ExceptionA: " + e.getMessage());
        }
    }
}
