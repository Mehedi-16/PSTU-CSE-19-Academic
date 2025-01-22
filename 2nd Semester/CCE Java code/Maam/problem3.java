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

class ExceptionC extends ExceptionB {
    public ExceptionC(String message) {
        super(message);
    }
}

public class problem3 {
    public static void main(String[] args) {
        try {
            throw new ExceptionB("Exception of type ExceptonB");
        } catch (ExceptionA e) {
            System.out.println(e);
        }

        try {
            throw new ExceptionC("Exception of type ExceptonC");
        } catch (ExceptionA e) {
            System.out.println(e);
        }
    }
}