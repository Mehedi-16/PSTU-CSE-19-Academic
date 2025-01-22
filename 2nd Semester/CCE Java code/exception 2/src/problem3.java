class ExceptionA extends Exception {
    ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends ExceptionA {
    ExceptionB(String message) {
        super(message);
    }
}

class ExceptionC extends ExceptionB {
    ExceptionC(String message) {
        super(message);
    }
}

public class problem3 {
    public static void main(String[] args) {
        try {

            throw new ExceptionB("ExceptionB occurred");
            // throw new ExceptionC("ExceptionC occurred");

        } catch (ExceptionA e) {

            System.out.println("Caught ExceptionA: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Caught generic Exception: " + e.getMessage());
        }
    }
}
