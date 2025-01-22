public class problem7 {

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Caught exception in someMethod\n"+e.getMessage());
            throw e;
        }
    }

    public static void someMethod2() throws Exception {

        throw new Exception("Exception in someMethod2");
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Caught rethrown exception in main\n"+e.getMessage());
            e.printStackTrace();
        }
    }
}