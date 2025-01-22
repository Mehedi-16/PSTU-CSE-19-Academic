public class p4 {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("ExceptionA");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        try {
            throw new ExceptionB("ExceptionB");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        try {
            throw new  NullPointerException("NullPointerException");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
