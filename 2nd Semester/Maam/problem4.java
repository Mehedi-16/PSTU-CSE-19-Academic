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

public class problem4 {
    public static void main(String[] args) {
        try {

        } 
        catch (Exception exception) {

            System.out.println("Caught Exception: " + exception.getMessage());
        }
    }
}