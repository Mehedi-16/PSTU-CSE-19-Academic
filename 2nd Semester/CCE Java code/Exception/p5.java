public class p5 {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("mehedi");
        } catch (ExceptionA e) {
            System.out.println(e);
        }
        catch (ExceptionB e) {
            System.out.println(e);
        }
    }
}
