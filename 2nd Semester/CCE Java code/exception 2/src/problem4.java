import java.io.IOException;

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
            // Throwing ExceptionA
            throw new ExceptionA("Exception of type ExceptionA occurred.");
        } catch (Exception exception) {
            System.out.println("Exception caught: " + exception.getMessage());
        }

        try {
            // Throwing ExceptionB
            throw new ExceptionB("Exception of type ExceptionB occurred.");
        } catch (Exception exception) {
            System.out.println("Exception caught: " + exception.getMessage());
        }

        try {
            // Throwing NullPointerException
            String str = null;
            System.out.println(str.length());
        } catch (Exception exception) {
            System.out.println("Exception caught: " + exception.getMessage());
        }

        try {
            // Throwing IOException
            throw new IOException("Exception of type IOException occurred.");
        } catch (Exception exception) {
            System.out.println("Exception caught: " + exception.getMessage());
        }
    }
}
