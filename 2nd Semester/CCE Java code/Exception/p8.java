public class p8 {
    public static void someMethod() throws Exception
    {
        try {
            int result=10/0;
            System.out.println(result);
           } 
        catch (NullPointerException e) {
            System.out.println(e);
        }
        finally
        {
            System.out.println("final in somemethod");
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }


}
