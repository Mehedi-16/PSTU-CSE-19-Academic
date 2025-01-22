public class p3 {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("Bal");
        } 
        catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }
        try {
            throw new ExceptionB("mehedi");
        } catch (ExceptionB e) {
            System.out.println(e.getMessage());
        }
    }
}
